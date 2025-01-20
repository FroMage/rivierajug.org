package org.rivierajug;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.rivierajug.OnStart.XWikiDoc.Attachment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import io.quarkus.logging.Log;
import io.quarkus.runtime.Startup;

public class OnStart {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class XWikiPackage {
		@JacksonXmlElementWrapper(localName = "files")
		public List<String> file;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class XWikiDoc {
		public String title;
		public long date;
		public long creationDate;
		public String syntaxId;
		public String content;
	    @JacksonXmlElementWrapper(useWrapping = false)
		public List<Attachment> attachment;
		
		@JsonIgnoreProperties(ignoreUnknown = true)
		public static class Attachment {
			public String filename;
			public String content;
			public int filesize;
		}
	}

	private static final DateTimeFormatter EVENT_DATE_FORMATTER = new DateTimeFormatterBuilder()
			.parseCaseInsensitive()
			.appendValue(ChronoField.DAY_OF_MONTH).appendLiteral(' ')
			.appendText(ChronoField.MONTH_OF_YEAR).appendLiteral(' ')
			.appendValue(ChronoField.YEAR)
			.toFormatter(Locale.FRENCH);

	private static final DateTimeFormatter EVENT_COMPLETE_DATE_FORMATTER = new DateTimeFormatterBuilder()
			.parseCaseInsensitive()
			.appendText(ChronoField.DAY_OF_WEEK).appendLiteral(' ')
			.appendValue(ChronoField.DAY_OF_MONTH).appendLiteral(' ')
			.appendText(ChronoField.MONTH_OF_YEAR).appendLiteral(' ')
			.appendValue(ChronoField.YEAR)
			.toFormatter(Locale.FRENCH);

	private static final DateTimeFormatter BLOG_FOLDER_FORMATTER = new DateTimeFormatterBuilder()
			.appendValue(ChronoField.YEAR).appendLiteral('-')
			.appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-')
			.appendValue(ChronoField.DAY_OF_MONTH, 2)
			.toFormatter();

	public static void deleteDirectory(Path toDelete) throws IOException {
	    try (Stream<Path> paths = Files.walk(toDelete)) {
	        paths.sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
	    }
	}

	@Startup
	public void start() throws StreamReadException, DatabindException, IOException {
		// This will translate xwiki data to Row/Markdown: disabled now that we got it done
		
//		Log.info("Start called, let's parse baby");
//
//		Path marker = Path.of("content/marker.md");
//		if(!Files.exists(marker)) {
//
//			Path output = Path.of("content");
//			if(Files.exists(output)) {
//				deleteDirectory(output);
//			}
//			Files.createDirectory(output);
//			Files.copy(Path.of("content-saved/index.html"), Path.of("content/index.html"));
//
//			XmlMapper mapper = new XmlMapper();
//			File packageFile = new File("xwiki/package.xml");
//			XWikiPackage pkg = mapper.readValue(packageFile, XWikiPackage.class);
//			for (String file : pkg.file) {
//				Log.info("Reading file: "+file);
//				importFile(mapper, file);
//			}
//			Files.write(marker, new byte[0]);
//		} else {
//			Log.info("Not importing anything: content/marker present");
//		}
	}

	private void importFile(XmlMapper mapper, String file) throws StreamReadException, DatabindException, IOException {
		File f = new File("xwiki/"+file.replace('.', '/').replace("\\/", ".").replace("\\","")+".xml");
		XWikiDoc doc = mapper.readValue(f, XWikiDoc.class);
		LocalDate creation = LocalDate.ofInstant(Instant.ofEpochMilli(doc.creationDate), ZoneId.systemDefault());
		Log.infof(" Parsed new doc: %s created at %s", doc.title, creation);
		LocalDate parsedDate = null;
		if(doc.title.contains(" @")) {
			String titleDate = doc.title.substring(0, doc.title.indexOf(" @ "));
			if(titleDate.equals("Tuesday November 7")) {
				titleDate = "7 novembre 2023";
			}
			try {
				parsedDate = LocalDate.parse(titleDate, EVENT_DATE_FORMATTER);
			} catch (DateTimeParseException x ) {
				parsedDate = LocalDate.parse(titleDate, EVENT_COMPLETE_DATE_FORMATTER);
			}
			Log.infof("  Read a first line date: %s", parsedDate);
		} else {
			Log.info("  No date in title");
		}
		
		File output;
		if(parsedDate != null) {
			String originalFile = file;
			String title = originalFile.replace("Main.", "").replace("Main\\.", "").replace(".WebHome", "").replace("Tuesday November 7 @ Sophia-Antipolis\\:  Aerospike evening", "20231107-aerospike");
			if(title.indexOf('-') != -1) {
				title = parsedDate.format(BLOG_FOLDER_FORMATTER)+title.substring(title.indexOf('-'));
			} else {
				title = parsedDate.format(BLOG_FOLDER_FORMATTER)+doc.title.substring(doc.title.indexOf(" : ")+3).toLowerCase().replace(' ', '-').replace("soirée-", "");
			}
			File folder = new File("content/posts/"+title);
			folder.mkdirs();
			output = new File(folder, "index.md");
		} else {
			if(doc.attachment != null && doc.attachment.size() > 0) {
				String name = file.replace("Main.", "");
				File folder = new File("content/"+name);
				folder.mkdirs();
				output = new File("content/"+name+"/index.md");
			} else {
				output = new File("content/"+file.replace("Main.", "")+".md");
			}
		}
		try(FileWriter fw = new FileWriter(output)){
			fw.append("---\n");
			if(parsedDate != null) {
				fw.append("layout: :theme/post\n");
			} else {
				fw.append("layout: :theme/page\n");
			}
			fw.append("title: \""+doc.title.replace("\"", "\\\"")+"\"\n");
			if(parsedDate != null) {
				fw.append("tags: event\n");
			}
			fw.append("author: stephane\n");
			fw.append("---\n\n");
			if(doc.syntaxId.equals("xwiki/1.0"))
				fw.append(convert1ToMarkdown(doc.content));
			else if(doc.syntaxId.equals("xwiki/2.0") || doc.syntaxId.equals("xwiki/2.1"))
				fw.append(convert2ToMarkdown(doc.content));
			else
				throw new RuntimeException("Unsupported syntax: "+doc.syntaxId);
			if(doc.attachment != null && doc.attachment.size() > 0) {
				for (Attachment attachment : doc.attachment) {
					byte[] content = Base64.getDecoder().decode(attachment.content);
					Files.write(output.getParentFile().toPath().resolve(attachment.filename), content);
				}
			}
		}
	}

	private final static Pattern WIKI2_LINK_MATCHER = Pattern.compile("\\[\\[(.*?)>>(.*?)\\]\\]");
	private final static Pattern WIKI2_LINK_ANCHOR_MATCHER = Pattern.compile("\\[\\[(.*?)>>\\|\\|anchor=\"(.*?)\"\\]\\]");
	private final static Pattern LINK_MATCHER = Pattern.compile("\\[([^|]*)\\|([^]]*)\\]");
	private final static Pattern LINK2_MATCHER = Pattern.compile("\\[([^>]*)\\>([^]]*)\\]");
	private final static Pattern PAGE_IMAGE_MATCHER = Pattern.compile("\\{image:([^|]*)\\|document=Main\\.([^}]*)\\}");
	private final static Pattern FLOAT_IMAGE_MATCHER = Pattern.compile("\\{image:([^|]*)\\|halign=floatright\\}");
	private final static Pattern IMAGE_MATCHER = Pattern.compile("\\{image:([^|]*)\\|([^}]*)\\}");
	private final static Pattern IMAGE_MATCHER2 = Pattern.compile("\\{image:(.*?)\\}");
	private final static Pattern IMAGE_SIZE_MATCHER = Pattern.compile("\\{image:([^|]*)\\|width=(\\d+)\\|height=(\\d+)\\}");
	private final static Pattern ATTACH_MATCHER = Pattern.compile("\\{attach:(.*?)\\|file=(.*?)\\}");
	// [[image:Main.Sponsors@avisto-150.png>>http://www.avisto.com]]
	private final static Pattern WIKI2_PAGE_IMAGE_LINK_MATCHER = Pattern.compile("\\[\\[image:Main\\.(.*?)@(.*?)>>(.*?)\\]\\]");
	private final static Pattern WIKI2_PAGE_IMAGE_LINK_MATCHER2 = Pattern.compile("\\[\\[\\[\\[image:Main\\.(.*?)@(.*?)\\]\\]>>(.*?)\\]\\]");
	private final static Pattern WIKI2_IMAGE_LINK_MATCHER = Pattern.compile("\\[\\[\\[\\[image:(.*?)\\]\\]>>(.*?)\\]\\]");
	private final static Pattern WIKI2_IMAGE_LINK_MATCHER2 = Pattern.compile("\\[\\[image:(.*?)>>(.*?)\\]\\]");
	private final static Pattern WIKI2_IMAGE_LINK_SIZE_MATCHER = Pattern.compile("\\[\\[\\[\\[image:(.*?)\\|\\|height=\"(\\d+)\" width=\"(\\d+)\"\\]\\]>>(.*?)\\]\\]");
	private final static Pattern WIKI2_FLOAT_IMAGE_MATCHER = Pattern.compile("\\[\\[image:([^|]*)\\|\\|style=\"(.*?)\"\\]\\]");
	private final static Pattern WIKI2_FLOAT_IMAGE_ALT_SIZE_MATCHER = Pattern.compile("\\[\\[image:([^|]*)\\|\\|alt=\"(.*?)\" (height=\".*?\" )?style=\"(.*?)\" (width=\".*?\")\\]\\]");
	private final static Pattern WIKI2_FLOAT_IMAGE_ALT_MATCHER = Pattern.compile("\\[\\[image:([^|]*)\\|\\|alt=\"(.*?)\" style=\"(.*?)\"\\]\\]");
	private final static Pattern WIKI2_ANCHOR_MATCHER = Pattern.compile("\\{\\{id name=\"(.*?)\"/\\}\\}");
	
	public String convert1ToMarkdown(String content) {
		StringBuilder sb = new StringBuilder(content.length());
		boolean table = false;
		int tableRows = 0;
		boolean lastLineWasBlank = true;
		for(String line : content.lines().toList()) {
			line = line.trim();
			if(line.equals("{table}")) {
				table = !table;
				tableRows = 0;
				continue;
			}
			if(line.startsWith("1 ")) {
				if(!lastLineWasBlank) {
					sb.append("\n");
				}
				line = "#"+line.substring(1);
			} else if(line.startsWith("1.1 ")) {
				if(!lastLineWasBlank) {
					sb.append("\n");
				}
				line = "##"+line.substring(3);
			}
			if(line.startsWith("#warning(\"")) {
				line = "<div class='warning'>" + line.substring(10, line.length()-2)+"</div>";
			}
			line = line.replace("~~", "_");
			// These pages are gone
			if(line.startsWith("<script type=\"text/javascript\" src=\"http://www.lunatech-research.com/event")) {
				line = "";
			}
			// NOTE: we use \b instead of { in our replacements, so we can get rid of any { that we did not put in ourselves
			// Image before link, because links can contain images
			// {image:lunatech-research-logo-small.png|document=Main.Sponsors}
			Matcher matcher = FLOAT_IMAGE_MATCHER.matcher(line);
			line = matcher.replaceAll("<img style='float: right;' src='$1'/>");
			matcher = PAGE_IMAGE_MATCHER.matcher(line);
			line = matcher.replaceAll("![alt text](\bsite.page('$2/index.md').image('$1')})");
			matcher = IMAGE_SIZE_MATCHER.matcher(line);
			line = matcher.replaceAll("<img width='$2' height='$3' src='$1'/>");
			matcher = IMAGE_MATCHER.matcher(line);
			line = matcher.replaceAll("![alt text]($1)");
			matcher = IMAGE_MATCHER2.matcher(line);
			line = matcher.replaceAll("![alt text]($1)");
			matcher = LINK_MATCHER.matcher(line);
			line = matcher.replaceAll("[$1]($2)");
			matcher = LINK2_MATCHER.matcher(line);
			line = matcher.replaceAll("[$1]($2)");
			matcher = ATTACH_MATCHER.matcher(line);
			line = matcher.replaceAll("[$1]($2)");
			// make sure Qute isn't fired up for no reason
			line = line.replace("{", "\\{");
			// now put back our legitimate Qute usage
			line = line.replace("\b", "{");
			if(table) {
				tableRows++;
				sb.append("|");
			}
			sb.append(line);
			if(table)
				sb.append("|");
			sb.append("\n");
			if(table && tableRows == 1) {
				// need to add header separator, for some reason
				for(String col : line.split("\\|")) {
					sb.append("|---");
				}
				sb.append("|\n");
			}
			lastLineWasBlank = line.isEmpty();
		}
		return sb.toString();
	}

	public String convert2ToMarkdown(String content) {
		StringBuilder sb = new StringBuilder(content.length());
		boolean isWarning = false;
		String warningLine = null;
		boolean lastLineWasBlank = true;
		boolean table = false;
		int tableRows = 0;
		content = content.replace("(((\n"
				+ "Troisième mi-temps dans un resto quelque part !\n"
				+ ")))", "Troisième mi-temps dans un resto quelque part !");
		content = content.replace("(((\n"
				+ "Troisième mi-temps dans un resto à proximité !\n"
				+ ")))", "Troisième mi-temps dans un resto à proximité !");
		for(String line : content.lines().toList()) {
			line = line.trim();
			if(line.startsWith("|=")) {
				table = true;
				tableRows = 0;
				line = line.replace("|=", "|");
			} else if(line.startsWith("|") && !table) {
				table = true;
				tableRows = 1;
				sb.append("|Horaire|Description|\n");
				sb.append("|---|---|\n");
			} else if(!line.startsWith("|")) {
				table = false;
			}
			if(line.startsWith("= ")) {
				if(!lastLineWasBlank) {
					sb.append("\n");
				}
				line = "#"+line.substring(1, line.length()-2);
			} else if(line.startsWith("== ")) {
				if(!lastLineWasBlank) {
					sb.append("\n");
				}
				line = "##"+line.substring(2, line.length()-3);
			}
			line = line.replace("[[image:https://rivierajug.org/xwiki/resources/icons/silk/emoticon_smile.png?cache-version=1687256830000||alt=\"emoticon_smile\"]]", "😀");
			line = line.replace("(% style=\"list-style-type: square\" %)", "");
			// this is a stupid italic separator as it's the same as for URI schemes :(
			line = line.replaceAll("([^:\"])//", "$1_");
			line = line.replaceAll("--(.*?)--", "<s>$1</s>");
			// this is just weird
			line = line.replace("~]", "]");
			line = line.replace("~[", "[");
			line = line.replace("~>", ">");
			line = line.replace("~~/~~/", "//");
			if(line.equals("{{html}}") || line.equals("{{html clean=\"false\"}}") || line.equals("{{/html}}")){
				continue;
			}
			// remove reservation frames that just take space up
			if(line.matches("<iframe id=\"rivierajug-.*\" allowTransparency=\"true\" width=\"570\" height=\"500\"")) {
				line = "_Réservations fermées_";
			} else if(line.equals("frameborder=\"0\">You must have a browser that supports iframes</iframe>")) {
				continue;
			}
			line = line.replace("(% style=\"text-align: center\" %)", "");
			line = line.replace("(% style=\"text-align:center;\" %)", "");
			line = line.replace("(% style=\"text-align:center\" %)", "");
			line = line.replace("{{code}}", "`");
			line = line.replace("{{/code}}", "`");
			if(line.equals("{{warning}}")){
				isWarning = true;
				continue;
			}
			if(line.equals("{{/warning}}")){
				isWarning = false;
				line = "<div class='warning'>" + warningLine +"</div>";
				warningLine = null;
			}
			// These pages are gone
			if(line.startsWith("<script type=\"text/javascript\" src=\"http://www.lunatech-research.com/event")) {
				line = "";
			}
			line = line.replace("data-xwiki-image-style-alignment=\"end\" style=\"", "style=\"float: right; ");
			Matcher matcher = WIKI2_IMAGE_LINK_SIZE_MATCHER.matcher(line);
			line = matcher.replaceAll("<a href='$4'><img src=\"\bpage.image('$1')}\" width='$3' height='$2'/></a>");
			matcher = WIKI2_PAGE_IMAGE_LINK_MATCHER2.matcher(line);
			line = matcher.replaceAll("[![alt text](\bsite.page('$1/index.md').image('$2')})]($3)");
			matcher = WIKI2_PAGE_IMAGE_LINK_MATCHER.matcher(line);
			line = matcher.replaceAll("[![alt text](\bsite.page('$1/index.md').image('$2')})]($3)");
			matcher = WIKI2_IMAGE_LINK_MATCHER.matcher(line);
			line = matcher.replaceAll("[![alt text](\bpage.image('$1')})]($2)");
			matcher = WIKI2_IMAGE_LINK_MATCHER2.matcher(line);
			line = matcher.replaceAll("[![alt text](\bpage.image('$1')})]($2)");
			matcher = WIKI2_LINK_ANCHOR_MATCHER.matcher(line);
			line = matcher.replaceAll("[$1](#$2)");
			matcher = WIKI2_LINK_MATCHER.matcher(line);
			line = matcher.replaceAll("[$1]($2)");
			matcher = WIKI2_FLOAT_IMAGE_MATCHER.matcher(line);
			line = matcher.replaceAll("<img style='$2' src='$1'/>");
			matcher = WIKI2_FLOAT_IMAGE_ALT_SIZE_MATCHER.matcher(line);
			line = matcher.replaceAll("<img style='$4' $3 $5 title='$2' src='$1'/>");
			matcher = WIKI2_FLOAT_IMAGE_ALT_MATCHER.matcher(line);
			line = matcher.replaceAll("<img style='$3' title='$2' src='$1'/>");
			matcher = WIKI2_ANCHOR_MATCHER.matcher(line);
			line = matcher.replaceAll("<a name='$1'/>");
			
//			matcher = IMAGE_MATCHER.matcher(line);
//			line = matcher.replaceAll("![alt text]($1)");
			// make sure Qute isn't fired up for no reason
			line = line.replace("{", "\\{");
			// now put back our legitimate Qute usage
			line = line.replace("\b", "{");
			if(isWarning) {
				warningLine = line;
			} else {
				sb.append(line);
				if(table) {
					tableRows++;
					sb.append("|");
				}
				sb.append("\n");
			}
			if(table && tableRows == 1) {
				// need to add header separator, for some reason
				boolean minusOne = true;
				for(String col : line.split("\\|")) {
					if (minusOne) {
						minusOne = false;
						continue;
					}
					sb.append("|---");
				}
				sb.append("|\n");
			}
			lastLineWasBlank = line.isEmpty();
		}
		return sb.toString();
	}
}

package org.rivierajug;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import io.quarkiverse.roq.frontmatter.runtime.model.DocumentPage;
import io.quarkiverse.roq.frontmatter.runtime.model.RoqCollection;
import io.quarkiverse.roq.frontmatter.runtime.model.Site;
import io.quarkus.arc.Arc;
import io.quarkus.qute.TemplateExtension;

@TemplateExtension
public class JavaExtensions {
	private static final DateTimeFormatter BLOG_DATE_FORMATTER = new DateTimeFormatterBuilder()
			.appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral('/')
			.appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('/')
			.appendValue(ChronoField.YEAR, 4)
			.toFormatter();

	public static String format(ZonedDateTime date) {
		return date.format(BLOG_DATE_FORMATTER);
	}
	
	public static String extractTopic(String title) {
		String prefix = " @ Sophia-Antipolis : ";
		int index = title.indexOf(prefix);
		if(index == -1) {
			prefix = " @ Sophia-Antipolis: ";
			index = title.indexOf(prefix);
			if(index == -1) {
				return title;
			}
		}
		String topic = title.substring(index+prefix.length()).trim();
		if(topic.startsWith("soirée ")) {
			topic = topic.substring(7);
		}
		if(topic.startsWith("après-midi ")) {
			topic = topic.substring(11);
		}
		if(topic.startsWith("\"")) {
			topic = topic.substring(1);
		}
		if(topic.endsWith("\"")) {
			topic = topic.substring(0, topic.length()-1);
		}
		if(Character.isLowerCase(topic.charAt(0))) {
			topic = Character.toUpperCase(topic.charAt(0)) + topic.substring(1);
		}
		return topic;
	}

	public static Map<Integer, List<DocumentPage>> archives(Site site){
		RoqCollection posts = site.collections().get("posts");
		Map<Integer, List<DocumentPage>> ret = new LinkedHashMap<Integer, List<DocumentPage>>();
		for (DocumentPage post : posts) {
			int year = post.date().getYear();
			List<DocumentPage> pagesPerYear = ret.get(year);
			if(pagesPerYear == null) {
				pagesPerYear = new ArrayList<DocumentPage>();
				ret.put(year, pagesPerYear);
			}
			pagesPerYear.add(post);
		}
		return ret;
	}
	
	public static String firstSection(DocumentPage post) {
		String content = post.rawContent().trim();
		// skip eventual markdown header
		if(content.startsWith("{#markdown}")){
			content = content.substring(11).trim();
		}
		// skip any leading title
 		if(content.startsWith("# ")) {
 			int endOfLine = content.indexOf('\n');
 			if(endOfLine != -1) {
 				content = content.substring(endOfLine+1);
 			}
 		}
		// now go until the next title
		int firstTitle = content.indexOf("\n# ");
		if(firstTitle != -1) {
			return content.substring(0, firstTitle);
		}
		return "Nope";
	}
}

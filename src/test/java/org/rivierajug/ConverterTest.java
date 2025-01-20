package org.rivierajug;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

	@Test
	public void testWiki1() {
		OnStart onStart = new OnStart();
		String result = onStart.convert1ToMarkdown("""
				{image:laurent.png|width=120|height=120}

				{attach:300 DPI|file=rivierajug-logo-1-300dpi.png}

				{image:rivierajug-logo-1-gros.png}
				""");
		
		Assertions.assertEquals("""
				<img width='120' height='120' src='laurent.png'/>
				
				[300 DPI](rivierajug-logo-1-300dpi.png)

				![alt text](rivierajug-logo-1-gros.png)
				""", result);
	}
	
	@Test
	public void testWiki2() {
		OnStart onStart = new OnStart();
		String result = onStart.convert2ToMarkdown("""
				= title1 =
				
				== title 2 ==
				
				text
				== title 2 no blank line ==
				
				{{html clean="false"}}
				{{html}}
				<div>html</div>
				{{/html}}
				
				{{warning}}
				A warning
				{{/warning}}
				
				some //italic// text and {{code}}l33t code{{/code}} and --strike-through--
				
				<iframe id="rivierajug-2011-fevrier" allowTransparency="true" width="570" height="500" 
				  frameborder="0">You must have a browser that supports iframes</iframe>

				(% style="text-align: center" %)Something
				(% style="text-align:center;" %)Something else
				(% style="text-align:center" %)Something else 2
				
				inline [[Sanne Grinovero>>#HSanneGroverino]] something [[Sanne Grinovero>>#HSanneGroverino]]
				
				[[[[image:Main.Sponsors@amadeus.png]]>>https://amadeus.com/fr]]
				[[[[image:avisto-150.png]]>>http://www.avisto.com]]
				[[image:lunatech-research-logo-small.png>>http://www.lunatech.com]]
				[[[[image:image-20221123190734-1.png||height="328" width="601"]]>>https://twitter.com/RivieraJUG/status/1595456357242703872]]
				
				[[image:Main.Sponsors@avisto-150.png>>http://www.avisto.com]]
				
				[[image:http://photos.potociar.net/Personal/My-Smug-Mug/detail/194927347_WTkLh-Th.jpg||style="float: right; margin: 1em"]]

				[[image:jerome-louvel-100.png||style="float: right; margin: 1em"]]
				
				[[image:lukas-vlcek.jpg||style="float: right;"]]
				[[image:bluxte.png||alt="Sylvain Wallez" style="margin:1em; float:right"]]
				[[image:AndyDamevin.jpeg||alt="Andy Damevin" height="278" style="margin:1em; float:right" width="250"]]
				[[image:ThomasBoni_color.jpg||alt="Thomas Boni" style="margin:1em; float:right" width="250"]]
				[[image:suntan.jpeg||alt="Sun Tan" data-xwiki-image-style-alignment="end" style="margin:1em" width="250"]]

				src="//eventbrite.com

				Fix this (((
				Troisième mi-temps dans un resto quelque part !
				)))
				Fix this (((
				Troisième mi-temps dans un resto à proximité !
				)))
				
				~~/~~/
				[[image:https://rivierajug.org/xwiki/resources/icons/silk/emoticon_smile.png?cache-version=1687256830000||alt="emoticon_smile"]]

				|=Horaire|=Description
				|18:00 - 18:30|Accueil — café
				|18:30 - 19:30|[[ElasticSearch>>#HElasticSearch]], //par [[Lukáš Vlček>>#HLukE1161Vl10Dek]]//

				|18:00 - 18:30|Accueil — café
				
				Nope(% style="list-style-type: square" %)

				[[-~> Programme détaillé>>||anchor="DetailedProgram"]]
				{{id name="DetailedProgram"/}}
				[[~[~[image:Main.Sponsors@amadeus.png~]~]>>https://amadeus.com/fr]]
				""");
		Assertions.assertEquals("""
				# title1
				
				## title 2
				
				text
				
				## title 2 no blank line
				
				<div>html</div>
				
				<div class='warning'>A warning</div>
				
				some _italic_ text and `l33t code` and <s>strike-through</s>
				
				_Réservations fermées_

				Something
				Something else
				Something else 2
												
				inline [Sanne Grinovero](#HSanneGroverino) something [Sanne Grinovero](#HSanneGroverino)
				
				[![alt text]({site.page('Sponsors/index.md').image('amadeus.png')})](https://amadeus.com/fr)
				[![alt text]({page.image('avisto-150.png')})](http://www.avisto.com)
				[![alt text]({page.image('lunatech-research-logo-small.png')})](http://www.lunatech.com)
				<a href='https://twitter.com/RivieraJUG/status/1595456357242703872'><img src="{page.image('image-20221123190734-1.png')}" width='601' height='328'/></a>
				
				[![alt text]({site.page('Sponsors/index.md').image('avisto-150.png')})](http://www.avisto.com)
				
				<img style='float: right; margin: 1em' src='http://photos.potociar.net/Personal/My-Smug-Mug/detail/194927347_WTkLh-Th.jpg'/>

				<img style='float: right; margin: 1em' src='jerome-louvel-100.png'/>

				<img style='float: right;' src='lukas-vlcek.jpg'/>
				<img style='margin:1em; float:right' title='Sylvain Wallez' src='bluxte.png'/>
				<img style='margin:1em; float:right' height="278"  width="250" title='Andy Damevin' src='AndyDamevin.jpeg'/>
				<img style='margin:1em; float:right'  width="250" title='Thomas Boni' src='ThomasBoni_color.jpg'/>
				<img style='float: right; margin:1em'  width="250" title='Sun Tan' src='suntan.jpeg'/>

				src="//eventbrite.com
				
				Fix this Troisième mi-temps dans un resto quelque part !
				Fix this Troisième mi-temps dans un resto à proximité !

				//
				😀

				|Horaire|Description|
				|---|---|
				|18:00 - 18:30|Accueil — café|
				|18:30 - 19:30|[ElasticSearch](#HElasticSearch), _par [Lukáš Vlček](#HLukE1161Vl10Dek)_|

				|Horaire|Description|
				|---|---|
				|18:00 - 18:30|Accueil — café|
				
				Nope

				[-> Programme détaillé](#DetailedProgram)
				<a name='DetailedProgram'/>
				[![alt text]({site.page('Sponsors/index.md').image('amadeus.png')})](https://amadeus.com/fr)
				""", result);
	}
}

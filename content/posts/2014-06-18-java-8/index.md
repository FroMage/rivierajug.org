---
layout: :theme/post
title: "Mercredi 18 juin 2014 @ Sophia-Antipolis : soirée Java 8"
tags: event
author: stephane
---

# Mercredi 18 juin 2014 @ Sophia-Antipolis : soirée Java 8

Le Riviera JUG organise une rencontre **gratuite** sur le thème de Java 8 le mercredi 18 juin 2014 à partir de 18h sur le site d’[Amadeus](http://www.amadeus.com) à Sophia-Antipolis ([localiser sur Google Maps](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=amadeus,+sophia-antipolis&sll=46.860191,1.73584&sspn=10.502605,18.215332&ie=UTF8&ll=43.623277,7.058501&spn=0.020939,0.051928&t=h&z=15&iwloc=A)).

Ça y est, le « train » à accouché ! Java 8 est sorti ! Combien de temps nous faudra-t-il pour enfin sauter de le pas de Java 1.2 à Java 8 ? Seule madame Irma le sait.

Par contre, José Paumard viendra nous montrer tout ce qui déchire sa race dans la nouvelle version de Java, la plus ambitieuse depuis Java 5, avec des lambdas, des méthodes dans les interfaces, des références de méthodes, et les nouveaux APIs qui vont avec.

José fait le tour des JUGs depuis de longue, et des conférences majeures telles que Devoxx, donc ça sera par une soirée exceptionnelle que nous pré-achèverons la saison 2013-2014 du Riviera JUG ( la soirée avec [Antonio Goncalves sur Java EE 7](Main.201406-javaee7) ayant été reprogrammée pour la semaine suivant ).

Ne manquez pas cette soirée !

<div class='warning'>Attention, horaires et salle exceptionnels, ne vous pointez pas à l´INRIA, la soirée est à Amadeus et commence dès 18h !</div>

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="https://www.eventbrite.com/tickets-external?eid=11219308253&ref=etckt" frameborder="0" height="214" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Online event registration</a><span style="color:#ddd;"> for </span><a style="color:#ddd; text-decoration:none;" target="_blank" href="https://www.eventbrite.com/e/mercredi-18-juin-2014-sophia-antipolis-soiree-java-8-tickets-11219308253?ref=etckt">Mercredi 18 juin 2014 @ Sophia-Antipolis : soirée Java 8</a> <span style="color:#ddd;">powered by</span> <a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com?ref=etckt">Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:25|[Lambdas, Streams et Collectors – Le nouveau visage de l’API Collection — Première partie](#HLambdas2CStreamsetCollectors2013Lenouveauvisagedel2019APICollection), _par [José Paumard](#HJosE9Paumard)_|
|19:25 - 19:35|Pause — discussions|
|19:35 - 20:30|[Lambdas, Streams et Collectors – Le nouveau visage de l’API Collection — Première partie](#HLambdas2CStreamsetCollectors2013Lenouveauvisagedel2019APICollection), _par [José Paumard](#HJosE9Paumard)_|

# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('amadeus.gif')})](http://www.amadeus.com)  | Salle|

# Pour venir

**Essayez de co-voiturer car le parking invités d’Amadeus ne pourra peut-être pas accueillir tout le monde.**

Amadeus s.a.s.
485, route du Pin Montard
Les Bouillides - BP 69
06902 Sophia Antipolis
Tél : 04 92 94 60 00

[Plan d’accès](attach:Main/200907XX@amadeus-access.pdf)

<iframe width="600" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=amadeus,+sophia-antipolis&amp;sll=46.860191,1.73584&amp;sspn=10.502605,18.215332&amp;ie=UTF8&amp;t=h&amp;cid=10740142577143277507&amp;hq=amadeus,+sophia-antipolis&amp;hnear=&amp;ll=43.632659,7.066183&amp;spn=0.020939,0.051928&amp;vpsrc=6&amp;iwloc=A&amp;output=embed"></iframe><br /><small><a href="http://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=amadeus,+sophia-antipolis&amp;sll=46.860191,1.73584&amp;sspn=10.502605,18.215332&amp;ie=UTF8&amp;t=h&amp;cid=10740142577143277507&amp;hq=amadeus,+sophia-antipolis&amp;hnear=&amp;ll=43.632659,7.066183&amp;spn=0.020939,0.051928&amp;vpsrc=6&amp;iwloc=A" style="color:#0000FF;text-align:left">View Larger Map</a></small>

# Programme détaillé

## Lambdas, Streams et Collectors – Le nouveau visage de l’API Collection

L’API la plus utilisée du JDK est sans aucun doute l’API Collection. Brillamment conçue il y a un peu plus de 15 ans, elle est encore aujourd’hui au cœur de toutes les applications Java. En 2004, elle a subi son premier lifting, avec l’introduction des génériques. Cette mise à jour, bien qu’importante, n’a cependant pas modifié ses patterns d’utilisation. Avec l’introduction des lambdas en Java 8, l’API Collection est à nouveau réécrite, mais cette fois la situation est différente : ses patterns d’utilisation sont complètement changés.

La première partie de cette conférence introduit les lambda expressions, comment les écrire, et ce qu’elle nous apportent en tant que développeurs. La deuxième partir présente en détail les nouveaux patterns introduits par les API Stream et Collector. Ces nouvelles API vont changer la façon dont nous allons pouvoir traiter les collections de grande taille, y compris en parallèle, avec un modèle de programmation très simple, et des patterns très puissants. Cette puissance sera montrée dans des exemples réels, qui monteront comment Java 8 va pouvoir nous aider à écrire simplement du code efficace et performant.

# À propos des intervenants

## José Paumard

<img style='float: right; margin: 1em' src='jose-paumard.jpg'/>

Passionné par la programmation depuis plus de 20 ans, José a fait ses premières armes en assembleur, puis C, C parallèle sur machine SIMD avant d’adopter Java comme langage objet, indispensable à la plupart des grandes applications modernes. Maître de conférences à l’institut Galilée (Université Paris 13), et docteur en mathématiques appliquées de l’ENS de Cachan. Il découvre le langage Java en 1995, et enseigne les technologies Java / Java EE en DESS, M2 et 3ème année ingénieur depuis 1998. Il intervient également régulièrement auprès d’entreprises, sous forme d’aide à projet et à l’architecture, d’expertise, et de formation.

José se passionne également pour l’éducation et la transmission des connaissances. Il tient un blog, Java le soir, source documentaire francophone sur les technologies Java pour des milliers de développeurs dans le monde. L’objet de ce blog est de publier son cours (environ 750 pages en ligne et disponibles au format ePub) et différents articles techniques, bien sûr en accès libre.

Il est enfin membre dirigeant du Paris JUG et co-organisateur de Devoxx France. Il prend enfin la parole régulièrement lors de conférences, devant des audiences très diverses : étudiants, chercheurs (mathématique, informatique, sciences humaines), ingénieurs, grand public, JUGs.

Son Twitter : [http://twitter.com/JosePaumard](@JosePaumard)

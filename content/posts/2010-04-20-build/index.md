---
layout: :theme/post
title: "20 avril 2010 @ Sophia-Antipolis : soirée outils de build"
tags: event
author: stephane
---

# Mardi 20 avril 2010 @ Sophia-Antipolis : soirée outils de build

<div class='warning'>Dernière minute : Hans Dockter ne pourra pas venir parler de Gradle à cause du volcan Islandais. Arnaud Héritier fera donc une présentation plus longue.</div>

Le Riviera JUG organise une rencontre *gratuite* sur le thème des outils de build le mardi 20 avril 2010 dans les locaux de [l’INRIA Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Dans la vie on a pas toujours le choix de faire ce que l’on veut, mais en ce qui concerne le build de projets on à souvent le choix, il faut admettre. On peut compiler chaque classe Java à la main à grands coups de javac et se souvenir quelles resources vont ou et comment invoquer les outils de jar ou javadoc, ou bien écrire un script de build en shell ou dans une [langue morte](http://www.gnu.org/software/make).

Il faut admettre que les projets qui ne font pas appel à des technologies post-1990 pour le build de projets Java sont peu nombreux et c’est tant mieux, car nous avons quand même bien innové dans ce domaine. À l’heure ou [Ant](http://ant.apache.org) est en train de disparaître suite à l’OPA (non hostile), j’hésite à dire _marche forcée_ vers [Maven](http://maven.apache.org) (quand bien même ce puisse être pour le mieux), le vent tourne en faveur d’outils de builds qui sont plus que des simples scripts procéduraux bêtes, et qui accomplissent un maximum de tâches en un minimum de configuration.

Ce soir nous ne vous présenterons non pas un outil de build mais deux, et pas des moindres puisque le Riviera JUG vous fait <a href="#arnaud">Arnaud Héritier</a>, un des principaux développeurs de <a href="#maven">Maven</a>, et <a href="#hans">Hans Dockter</a>, auteur de [Gradle](http://www.gradle.org), qui nous expliquerons pourquoi chacun des deux outils est meilleur que l’autre. Enfin tout au moins nous expliqueront-ils ce que fait chaque outil et dans quels cas l’utiliser.

Encore une fois, le Riviera JUG vous présente des technologies modernes par les meilleurs orateurs sur le sujet. Venez nombreux :)


# Réservation

<iframe id="rivierajug-2010-avril" allowTransparency="true" width="570" height="500" frameborder="0">You must have a browser that supports iframes</iframe>





# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil — café|
|18:30 - 19:30|<a href="#maven">Maven</a>, _par <a href="#arnaud">Arnaud Héritier</a>_|
|19:30 - 20:00|Pause — buffet|
|20:00 - 20:15|Présentation du livre « Clean Code » par Boris Lenzinger|
|20:15 - 21:15|<a href="#maven">Maven</a>, _par <a href="#arnaud">Arnaud Héritier</a>_<br/>--<a href="#gradle">Gradle - A Better Way To Build</a>, _par <a href="#hans">Hans Dockter</a>_-- (annulé pour cause de volcan Islandais)|
|21:15 - 21:45|Fin/Rencontres — buffet|




# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('lunatech-research-logo-small.png')})](http://www.lunatech.fr) | Employeur des deux organisateurs|
|[![alt text]({site.page('Sponsors/index.md').image('inria-small-transp.gif')})](http://www.inria.fr)  | Salle|

# Pour venir

Salle « Euler Violet », bâtiment Euler en face du poste de garde (le gardien vous l’indiquera quand vous arriverez sur le site).

INRIA Sophia-Antipolis<br/>
2004, route des Lucioles<br/>
06902 Sophia Antipolis

[Plan d’accès](http://www-sop.inria.fr/presentation/data/plan_sophia.jpg).

<div class='warning'>Prevoyez une pièce d’identité pour le poste de garde.</div>

<iframe width="800" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.fr/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685&amp;output=embed"></iframe><br /><small><a href="http://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685" style="color:#0000FF;text-align:left">View Larger Map</a></small>

# Programme détaillé

<a name="maven"/>

## Maven

Maven est aujourd'hui un outil incontournable pour tous ceux qui mettent leurs pieds dans l'ecosystème Java. Outil révolutionnaire pour certains, maléfique pour d'autres, il ne cesse d'alimenter les conversations aux bistros des JUGs (et sur de très nombreux blogs).

Lors de cette session vous découvrirez Maven et tout son eco-système. Vous verrez d'où il vient, ce qu'il apporte, ce qui le différencie par rapport aux autres outils de sa catégorie et son avenir avec un tour d'horizon sur sa troisième version majeure qui verra le jour cette année.

<a name="gradle"/>

## Gradle - A Better Way To Build

Gradle is an enterprise-grade build system. Gradle allows you to describe your build using a rich, extensible build language based on Groovy. It comes with build-by-convention support for Java, Groovy, Scala, OSGi, and web projects. Gradle provides exciting solutions for the big pain points that exist with current build systems.

Gradle pushes declarative builds to a new level. It allows users to provide there own declarative elements and to customize the behavior of the build-in ones. Thus enabling concise, expressive and maintainable builds. All this is build on a rich, flexible imperative layer of tasks.

With its Deep API Gradle allows you to hook in and customize every aspect of the build, be it configuration or execution behavior.

Gradle has a particular focus on enterprise builds. It comes with many optimization strategies for building fast and yet reliable. It has a powerful support for multi-project builds and transitive dependency management. It allows to integrate with your existing Ant/Maven builds and your Ivy/Maven/Custom repositories.

In this session you will first learn about the philosophy and concepts of Gradle. After that we will go through a couple of live demos to see Gradle in action. You will see how easy and elegant you can do amazing things with Gradle. The demos will span dependency management, test result analysis, code sharing, parallelizing, incremental builds, importing Ant/Maven projects and more.


# À propos des intervenants

<a name="arnaud"/>

## Arnaud Héritier

<img style='float: right;' src='arnaudheritier.jpg'/>

Arnaud Héritier est architecte senior. Il a dix années d'expériences professionnelles acquises au sein d'éditeurs de logiciels, de sociétés de services et de cabinets de conseil.
Il rejoint [eXo Platform](http://www.exoplatform.com) en Juillet 2009 en tant que Software Factory Manager. Il y est responsable des méthodes et outils utilisés pour développer et livrer les produits.
Il participe à divers projets open-source depuis plusieurs années. Sa contribution principale est pour le projet [Apache Maven](http://maven.apache.org) qu'il a rejoint en 2004 et dont il fait parti du comité de direction (PMC).
Il est régulièrement speaker dans des conférences ou JUGs, et est le co-auteur du livre [Apache Maven](http://www.pearson.fr/livre/?GCOI=27440100730370) aux éditions Pearson.

<a name="hans"/>

## Hans Dockter

<img style='float: right;' src='hans-dockter.jpg'/>

Hans Dockter is the founder and project manager of Gradle and the CEO of Gradle Inc.. He has 12 years of experience as a software developer, team leader, architect, trainer, and technical mentor. He is a former committer of the JBoss-Project for which he founded the JBoss-IDE.





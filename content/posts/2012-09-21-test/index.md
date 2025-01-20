---
layout: :theme/post
title: "Vendredi 21 septembre 2012 @ Sophia-Antipolis : soirée Test"
tags: event
author: stephane
---

# Vendredi 21 septembre 2012 @ Sophia-Antipolis : soirée Test

Le Riviera JUG organise une rencontre **gratuite** sur le thème du Test le vendredi 21 septembre 2012 à partir de 18h dans les locaux d´[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

À GitHub on ne fait rien comme tout le monde : [ils déploient en prod avant de merger sur master](https://github.com/blog/1241-deploying-at-github)… MAIS ils testent avant de déployer quand même (ouf). Donc si même GitHub teste le code, vous devriez aussi.

Mais c´est tellement ennuyeux de tester… On traine, on oublie, enfin on essaye. On met tous les `-Dmaven.test.skip=true -DskipTests=true` requis et puis on part en weekend.

Eh bien, justement détrompez vous, nous avons la solution bonux à tous vos problèmes de tests. Dans un premier temps Mathilde Lemée viendra nous parler de [FluentLenium](http://www.fluentlenium.org/) qui permet de tester les applis web en pilotant des navigateurs à distance, y compris avec le nœud dans le torchon !

Et ensuite pour apprendre à faire les nœuds sur les torchons, Aslak Knutsen viendra nous parler d´[Arquillian](http://www.jboss.org/arquillian.html), un framework de test automatisé qui vous permet d´écrire et de faire tourner vos tests du sol au plafond.

Si après ça vous ne testez toujours pas vos projets avant de les mettre en prod, faudra pas venir vous plaindre.

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="http://www.eventbrite.com/tickets-external?eid=4287389698&ref=etckt" frameborder="0" height="192" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Online Ticketing</a><span style="color:#ddd;"> for </span><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://http://www.eventbrite.com/event/4287389698?ref=etckt">Vendredi 21 septembre 2012 @ Sophia-Antipolis : soirée Test</a> <span style="color:#ddd;">powered by</span> <a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com?ref=etckt">Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:30|[FluentLenium](#HFluentLenium), _par [Mathilde Lemée](#HMathildeLemE9e)_|
|19:30 - 20:00|Pause buffet — discussions|
|20:00 - 21:00|[Arquillian](#HArquillian), _par [Aslak Knutsen](#HAslakKnutsen)_|

# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('avisto-150.png')})](http://www.avisto.com) | Sponsor annuel|
|[![alt text]({site.page('Sponsors/index.md').image('inria-2-150px.png')})](http://www.inria.fr/sophia)  | Salle|

# Pour venir

Salle « Euler Violet », bâtiment Euler en face du poste de garde (le gardien vous l’indiquera quand vous arriverez sur le site).

INRIA Sophia-Antipolis
2004, route des Lucioles
06902 Sophia Antipolis

[Plan d’accès](http://www-sop.inria.fr/presentation/data/plan_sophia.jpg).

<div class='warning'>Prevoyez une pièce d’identité pour le poste de garde.</div>

<iframe width="600" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.fr/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685&amp;output=embed"></iframe><br /><small><a href="http://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685" style="color:#0000FF;text-align:left">View Larger Map</a></small>

# Programme détaillé

## FluentLenium

[FluentLenium](http://www.fluentlenium.org/) is a framework that helps you writing Selenium tests. FluentLenium provides you a fluent interface to the Selenium Web Driver. FluentLenium let you use the assertion framework you like, either jUnit assertions, Hamcrest or Fest-assert.

## Arquillian

[Arquillian](http://www.jboss.org/arquillian.html) is a revolutionary testing platform for Java and the JVM that enables developers to easily create and execute integration and functional tests for Java middleware, from Java EE and beyond.

One of Arquillian’s strong points is its extensibility. Arquillian was built with the ability to change its default behavior via its powerful extension model as well as to grow past its original programming to take on the challenges of tomorrow.

This presentation guides you through the Arquillian extensions by demonstrating how specific extensions solve common problematic testing scenarios faced by enterprise developers. You will get a overview of what is available and possible today as well as what is brewing in the community.

# À propos des intervenants

## Aslak Knutsen

<img style='float: right; margin: 1em' src='aslak-knutsen-120.png'/>

Aslak Knutsen, the project lead of Arquillian, is a Senior Software
Engineer at JBoss, by Red Hat. He's involved in projects such as
Arquillian, ShrinkWrap, Weld and Seam 3, one of the founders of the
JBoss Testing initiative and a speaker at major industry conferences
including Devoxx, JavaOne, Jazoon, JFokus, and Geecon.

## Mathilde Lemée

<img style='float: right; margin: 1em' src='mathilde-lemee.jpg'/>

Mathilde Lemée est une consultante Java indépendante, membre du réseau des zindeps, groupement d’indépendants pronant une autre manière de travailler. Elle est actuellement très active au sein des JDuchess, groupement feminin autour de Java, qu’elle a co-fondé en 2010.

Elle est à l’origine de [[http://www.java-freelance.fr]], où elle poste sur les sujets qui l’interessent (tests, performance, nouveautés …). Elle est intervenue dans différentes conférences (ParisJUG, Marmite, Mix-it, SoftShake...).

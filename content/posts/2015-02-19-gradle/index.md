---
layout: :theme/post
title: "Jeudi 19 février 2015 @ Sophia-Antipolis : soirée Gradle"
tags: event
author: stephane
---

# Jeudi 19 février 2015 @ Sophia-Antipolis : soirée Gradle

Le Riviera JUG organise une rencontre **gratuite** sur le thème de Gradle le jeudi 19 février 2015 à partir de 18h dans les locaux d´[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Au début, le build c’était une série d’incantations cryptiques en grec ancien, qui impliquait les divinités gcc, ld et autres. Et puis les gens en ont eu marre de se souvenir de la séquence de choses à faire pour faire compiler le tout et ont inventé les scripts shell. Là dessus on a continué à batir pour faire les Makefiles, qui permettaient quand même non seulement d’invoquer les commandes grecques cryptiques, mais aussi de faire un beau eval au milieu et du templating avec deux niveaux de substitution de variables. Naturellement c’était trop simple alors on a inventé configure, puis automake et autoconf et on a rajouté un troisième niveau de substitution.

Là vraiment c’était le bon temps. Après, allez savoir pourquoi, des illéttrés qui ne comprenaient pas le grec se sont mis à faire du Java et ont inventé Ant pour remplacer Make. Histoire principalement de remplacer les problèmes de tab vs espace par les problèmes de XML, sans doute.

Et puis pour les dépendances ben bon courage. Fallait aller les chercher sur Internet à la main. Ou alors on les mettait dans le SCM, à l’ancienne (à côté des clefs Amazon).

Et puis un mec est venu avec l’idée que le build devait rester en XML (déjà bon on aurait pu se douter…), mais ne devait plus décrire le build par une série de commandes mais par de la composition de conventions et de phases et de faisceaux qui ne doivent pas se croiser sinon c’est mal. Ah oui, et il fallait faire des backups d’Internet de façon régulière et que finalement prendre 10 minutes pour compiler deux fichiers c’était acceptable et surtout virer cette hérésie de build incrémental. Et donc on a eu Maven, le summum de la quintessence du build.

L’histoire aurait pu s’arrêter là mais c’était sans compter sur les grecs qui voulaient quand même se débarrasser du XML, garder les solutions pour la modularité et les dépendances, mais revenir à des incantations de commandes, mais plus en grec cette fois : en latin. Et Gradle est né. Comme tous les systèmes de build, c’est le plus mieux et la solution ultime et le reste c’est le passé.

Peter Ledbrook va venir nous expliquer en quoi Gradle c’est mieux que le reste et pourquoi vous devez l’utiliser. Et moi je vais aller chercher du popcorn.

Ne manquez pas cette soirée :)

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="//eventbrite.com/tickets-external?eid=15725236606&ref=etckt" frameborder="0" height="214" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Online event registration</a><span style="color:#ddd;"> for </span><a style="color:#ddd; text-decoration:none;" target="_blank" href="https://www.eventbrite.com/e/jeudi-19-fevrier-2015-sophia-antipolis-soiree-gradle-tickets-15725236606?ref=etckt">Jeudi 19 février 2015 @ Sophia-Antipolis : soirée Gradle</a> <span style="color:#ddd;">powered by</span> <a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com?ref=etckt">Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:25|[Why Gradle?](HWhyGradle3F), _par [Peter Ledbrook](#HPeterLedbrook)_|
|19:25 - 19:35|Pause — discussions|
|19:35 - 20:30|[Improving your Gradle builds](HImprovingyourGradlebuilds), _par [Peter Ledbrook](#HPeterLedbrook)_|

# Sponsors

|Sponsor|Rôles|
|---|---|
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

## Why Gradle?

Maven and Ant have dominated the build landscape in the Java
world for more than a decade. Why on earth do we need or want another
one? That’s a question many people ask themselves when hearing about
Gradle. In this talk, I provide some context to what makes a good
build and hence what you should expect from your build tools.

You will then learn how Gradle provides the features you need to solve
any build problem, while still being easy to use for standard stuff.
Afterwards, you’ll start to understand why Google picked Gradle for
the new Android build system.

## Improving your Gradle builds

Gradle is easy to use for building standard Java projects,
but it’s rare to find a project that is completely standard. Whenever
you have some custom requirement, you need to start using Gradle’s
power features. It’s at that point that you can find yourself
producing an unmaintainable mess and a hard-to-use build.

This talk will start by explaining Gradle’s model, which you need to
understand if you want to retain control over your builds. I will then
introduce you to some simple but effective guidelines that will ensure
that your builds stay clean and effective.

# À propos des intervenants

## Peter Ledbrook

<img style='float: right; margin: 1em' src='peter-ledbrook.jpeg'/>

Peter is a long time Java developer and co-author of the book
Grails in Action with Glen Smith.

With a passion for how new technology can help developers get stuff
done, he has worked with lots of open source projects and attempts to
make the ones he likes more accessible. He is currently immersed in
the Groovy ecosystem. This comes on top of more than 10 years
experience in software development, from C to pure servlet
development, to modern web apps.

Throughout his development life he has worked with and developed
builds using Make, Ant, and Maven. These days he favours Gradle, which
promises to break the boundaries between language platforms and allow
people to use a single build tool for polyglot projects.

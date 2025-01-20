---
layout: :theme/post
title: "Jeudi 28 mai 2015 @ Sophia-Antipolis : soirée MongoDB"
tags: event
author: stephane
---

# Jeudi 28 mai 2015 @ Sophia-Antipolis : soirée MongoDB

Le Riviera JUG organise une rencontre **gratuite** sur le thème de MongoDB le jeudi 28 mai 2015 à partir de 18h dans les locaux d´[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

SQL, NoSQL, c’est un long débat, [depuis des années](http://www.commitstrip.com/fr/2014/06/03/the-problem-is-not-the-tool-itself/), et on a vu pas mal de trolls s’en emparer comme des classiques Vim vs. Emacs, Objet vs. Fonctionnel, ou Windows vs. OSX vs. Linux… Alors je vais pas troller, c’est promis.

Bon si allez quand-même un petit peu. En gros, au début on avait la guerre base de données relationnelles vs. objet. Si si, vous ne vous en souvenez pas ? C’est à l’époque ou mon collègue Gavin King à lancé le premier ORM (Object Relational Mapper) populaire qui a permis de mapper un modèle objet sur une DB relationnelle sans avoir besoin d’une base de données objet : Hibernate, inspirant JPA par la suite. On a à peu près plus jamais entendu parler des DB objets après ça, alors qu’en 2000 c’était annoncé comme tuant les DB relationnelles…

Avançons un peu dans le temps avec l’arrivée de NoSQL il y a quelques années. Je me souviens d’une anecdote mythique au premier Sophia Conf en 2010, lors du Bar Camp pendant la discussion avec les orateurs, où un orateur nous a calmement expliqué que NoSQL c’était l’avenir et la seule solution possible, alors que SQL était mort, inutile, obsolète et inadéquat. Le tout face à Emmanuel Bernard (qui a modernisé Hibernate avec les annotations de Java 5, et lançait déjà Hibernate OGM qui permet de mapper un modèle objet avec JPA sur du NoSQL), qui avait forcément une vue plus modérée et clémente de SQL tout en ayant un bonne idée des apports des bases NoSQL. La discussion n’a pas dégénéré parce qu’on a simplement fait comme sur internet et ignoré le troll avec un regard gêné. Mais ça montrait bien les crispations autour de la question.

De nos jours on a toujours des interrogations sur ce que peut faire NoSQL (est-ce qu’on perd les données ? comment les retrouver ? comment garder un schema ?), de la même manière qu’autour de SQL (comment répliquer ? comment isoler ? comment faire évoluer un schema ?) mais je pense que le débat s’est apaisé car on a eu un peu de recul et on a su apprendre les différences des deux modèles et accepter que chaque solution convient à des problèmes différents, et non pas à tous les cas de figures.

Bref, ce soir nous allons parler de MongoDB, une base NoSQL qui dépote, et qui est incontournable dans la famille NoSQL, et également parler des séries temporelles : un problème classique dans les bases de données.

Donc je vais me contenter de vous encourager fortement à venir voir Massimo nous parler de MongoDB, quand, pourquoi et comment l’utiliser avec brio :)

Ne manquez pas cette soirée :)

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="//eventbrite.com/tickets-external?eid=17001916189&ref=etckt" frameborder="0" height="214" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a class="powered-by-eb" style="color: #dddddd; text-decoration: none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Powered by Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:25|[MongoDB: What, Why, When](#HMongoDB:What2CWhy2CWhen), _par [Massimo Brignoli](#HMassimoBrignoli)_|
|19:25 - 19:35|Pause — discussions|
|19:35 - 20:30|[Time-Series and MongoDB](#HTime-SeriesandMongoDB), _par [Massimo Brignoli](#HMassimoBrignoli)_|

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

## MongoDB: What, Why, When

This talk will introduce to the document database technology, explaining what kind of problems is trying to solve and the advantages compared to the relational approach. Will be illustrated also the most common used case for MongoDB.

## Time-Series and MongoDB

Time-series are everyone and are becoming more and more important: from logs to sensors informations. This talk will show how to manipulate the document schema to optimize both writes and reads typical of the Time-Series approach.

# À propos des intervenants

## Massimo Brignoli

<img style='float: right; margin: 1em' src='massimo-brignoli-120.jpg'/>

Massimo Brignoli works as Senior Solutions Architect for MongoDB Inc. From 1990 to nowadays he worked for all the main database vendors: from MySQL, to Oracle, to MongoDB, traveling all around the globe to help companies to design their database architecture. He managed also the engineering team that created Virgilio.it, the biggest italian web portal.

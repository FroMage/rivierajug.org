---
layout: :theme/post
title: "Lundi 12 janvier 2015 @ Sophia-Antipolis : soirée Apache Flink"
tags: event
author: stephane
---

# Lundi 12 janvier 2015 @ Sophia-Antipolis : soirée Apache Flink

Le Riviera JUG organise une rencontre **gratuite** sur le thème de Apache Flink le lundi 12 janvier 2015 à partir de 18h dans les locaux d´[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Alors voilà le topo : vous êtes venus au JUG, et donc vous utilisez les dernières technos à la mode, avec du Java 8, du NoSQL, du streaming, du scaling du buzzwording, et du coup vous avez trop d’utilisateurs qui vous envoient trop de données et vous ne savez plus quoi en faire.

[Apache Flink](http://flink.incubator.apache.org) c’est un petit écureuil agile qui va aller chercher les noisettes qu’il vous faut dans le foutoir des arachides que vous avez cachées dans votre archi distribuée, et que vous n’arrivez plus à retrouver.

C’est un truc qui va aller chercher dans les données rapidement, de manière distribuée et parallèle et surtout rapide, histoire de vous sauver la mise avec vos clients écureuils.

Bref, venez au prochain JUG découvrir plus en détail cette histoire de sciuridés :)

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="//eventbrite.com/tickets-external?eid=15138110496&ref=etckt" frameborder="0" height="214" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Online Ticketing</a><span style="color:#ddd;"> for </span><a style="color:#ddd; text-decoration:none;" target="_blank" href="https://www.eventbrite.com/e/lundi-12-janvier-2015-sophia-antipolis-soiree-apache-flink-tickets-15138110496?ref=etckt">Lundi 12 janvier 2015 @ Sophia-Antipolis : soirée Apache Flink</a> <span style="color:#ddd;">powered by</span> <a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com?ref=etckt">Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:25|[Apache Flink](#HApacheFlink), _par [Gyula Fóra](#HGyulaFF3ra)_|
|19:25 - 19:35|Pause — discussions|
|19:35 - 20:30|[Flink Streaming](#HFlinkStreaming), _par [Gyula Fóra](#HGyulaFF3ra)_|

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

## Apache Flink

Apache Flink is an open source project that develops a fast and reliable system for large-scale data analysis. Flink offers programming APIs in Java and Scala centered around the notion of manipulating distributed object collections using functional primitives such as map, reduce, join, etc, augmented with dedicated operators for iterative programs, and logical, SQL-like, definition of keys (e.g., groupBy(“id”)). Flink transforms the user’s functional programs into distributed data stream programs that can be executed in large compute clusters. In the course of the transformation, Flink analyzes the user programs and data types, and generates custom code for robust parallel, and memory adaptive, execution of the programs. This talk will focus on Flink from a user’s perspective, covering the capabilities of the APIs and walking through example data analysis programs.

## Flink Streaming

Flink Streaming is the real time data processing engine provided by the Apache Flink data analytics platform. Flink streaming is currently programmable using a Java  and Scala API which provides functional operators including map, reduce and temporal joins amongst others. The streaming API also features flexible windowing semantics to express a wide variety of business logic. In the runtime layer both batch and streaming jobs are executed as a common data flow graph thus providing a multi-paradigm data processing framework that offers a more straight-forward and transparent approach to the lambda architecture than current state of the art solutions. The highly efficient Flink runtime layer offers very competitive performance compared to current streaming solutions like Storm or Spark Streaming with a rich and expressive API. This talk will focus on the features of the Flink Streaming API and our development roadmap including fault tolerance and the lambda architecture API.

# À propos des intervenants

## Gyula Fóra

<img style='float: right; margin: 1em' src='GyulaFora.jpg'/>

Gyula Fóra is a committer and PMC member for the Apache Flink project, currently working on developing Flink at SICS. His main expertise and interest is real-time distributed data processing frameworks, and their connections to other big data applications. He is a core architect of Flink Streaming and he is also working on researching theoretical aspects of distributed stream processing including fault tolerance and lambda architecture. Besides these, his other interests include data mining and real-time predictive analytics.

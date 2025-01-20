---
layout: :theme/post
title: "Mardi 13 juin 2017 @ Sophia-Antipolis : soirée Elastic Search"
tags: event
author: stephane
---

# Mardi 13 juin 2017 @ Sophia-Antipolis : soirée Elastic Search

Le Riviera JUG organise une rencontre **gratuite** sur le thème d’Elastic Search le mardi 13 juin 2017 à partir de 18h dans les locaux d’[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Pour beaucoup, les bases de données ça ingère bien les données, ça s’en délecte, même, jusqu’à la boursouflure, jusqu’à en avoir les dents du fond qui baignent, quoi. Enfin, vous voyez. Une fois rassasiée, elle en fait quoi la base, de toutes ces données ? Elle les garde jalousement, et vous si vous avez le malheur de vouloir y accéder, vous voici revenu au bon vieux Altavista (comment ça vous n’avez jamais connu ? Ah, ces jeunes…) c’est à dire que vous êtes foutus si vous ne connaissez pas l’URL direct vers le résultat que vous cherchez. Enfin dans une base de données c'est le bon critère (indexé de préférence) pour faire ce fichu SELECT.

Mais si c'est un peu moins évident que ça, vous êtes dans la panade. Dans le vieux Nice sans Google Maps. Dans votre déclaration d’impôt avec votre pile de documents vaguement liés dans la main (que d’ailleurs c'est trop tard si vous ne l’avez pas encore faite). Bref, c’est perdu, vous n’avez plus qu’à effacer votre base de données et en refaire une plus petite. Aussi, fallait pas être si ambitieux.

Ah, non ? On me dit qu’en fait j’ai effacé ma base pour rien ? Il y aurait un baril de lessive miracle qui retrouverait mes données et les chaussettes manquantes ? Et qu’en plus elle lave les données plus blanc que blanc ?

David Pilato, développeur et évangéliste chez elastic.co, viendra nous expliquer comment Elastic Search va chercher les données avec les dents (que d’ailleurs paraît qu’elle peut même chercher la croissance avec ses super dents), mieux que Lycos et Altavista réunis ! Et que grâce à ça on va pouvoir arrêter le régime à sec des bases puisqu’on pourra enfin en faire sortir ce dont on a besoin. Comme par exemple cette déclaration d’impôt en retard, donc…

Ne manquez pas cette soirée :)

# Réservation

<div style="width:100%; text-align:left;"><iframe src="//eventbrite.com/tickets-external?eid=35009260641&ref=etckt" frameborder="0" height="275" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:12px; padding:10px 0 5px; margin:2px; width:100%; text-align:left;" ><a class="powered-by-eb" style="color: #ADB0B6; text-decoration: none;" target="_blank" href="http://www.eventbrite.com/">Powered by Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:15|[Un moteur de recherche NoSQL pour chercher^H^H^H^H^H^H^H^H trouver...](#HProgrammedE9taillE9)|
|19:15 - 19:45|Buffet, boissons|
|19:45 - 20:45|[Ingest node : (ré)indexer et enrichir des documents dans Elasticsearch](#HProgrammedE9taillE9)|

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

<iframe src="https://www.google.com/maps/embed?pb=!1m17!1m11!1m3!1d12898.164001627882!2d7.061702203010714!3d43.61600471568019!2m2!1f0!2f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xe656aec13e1ef9b1!2sInria+Sophia+Antipolis+Mediterranean!5e1!3m2!1sen!2sfr!4v1496239060604" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>

# Programme détaillé

## Un moteur de recherche NoSQL pour chercher^H^H^H^H^H^H^H^H trouver...

Vous cherchez toujours dans vos données avec des SELECT * FROM person WHERE name like '%david%pilato%" ?

Au delà des performances obtenues, êtes-vous certain de renvoyer les résultats les plus pertinents pour vos utilisateurs d'abord ?

Venez découvrir comment un moteur de recherche vous aidera à répondre aux questions posées par vos utilisateurs, de manière pertinente et efficace, tout en apportant des fonctionnalités d'analyse des résultats et ce, quelque soit le volume...

## Ingest node : (ré)indexer et enrichir des documents dans Elasticsearch

Lorsque vous injectez des données dans elasticsearch, vous pouvez avoir besoin de réaliser des opérations de transformation assez simples. Jusqu'à présent, ces opérations devaient s'effectuer en dehors d'elasticsearch, avant l'indexation proprement dite.

Souhaitez la bienvenue à Ingest node ! Un nouveau type de noeud qui vous permet justement de faire cela.

Ce talk explique le concept de Ingest Node, comment l'intégrer avec le reste de la suite logicielle Elastic et comment développer son propre plugin Ingest par la pratique en montrant comment j'ai développé le plugin ingest-bano pour enrichir des adresses postales et/ou des coordonnées géographiques françaises (pour l'instant).

Ce talk parlera également de l'API de réindexation qui peut également bénéficier du pipeline d'ingestion pour modifier vos données à la volée lors de la réindexation.

# À propos des intervenants

## David Pilato

<img style='float: right; margin: 1em' src='david-pilato-120.jpg'/>

Depuis 2013, David est développeur et évangéliste chez elastic.co, après avoir passé les deux années précédentes à promouvoir le projet open-source Elasticsearch. Il en anime la communauté française.

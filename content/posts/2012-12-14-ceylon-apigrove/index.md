---
layout: :theme/post
title: "Vendredi 14 décembre 2012 @ Sophia-Antipolis : soirée Ceylon et apiGrove"
tags: event
author: stephane
---

# Vendredi 14 décembre 2012 @ Sophia-Antipolis : soirée Ceylon et apiGrove

Le Riviera JUG organise une rencontre **gratuite** sur le thème de Ceylon et apiGrove le vendredi 14 décembre 2012 à partir de 18h dans les locaux d´[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Pour la dernière soirée de 2013, nous allons faire venir des orateurs locaux.

Le premier, Guilhem Ensuque, d´Alcatel-Lucent, va nous parler d´un serveur de gestion d´API web en Java qui s´appelle
[apiGrove](http://apigrove.github.com/apigrove/). Ça sert a gérer les APIs de services RESTful ou SOAP (authentification, rate limiting, sécurité). Le tout est basé sur Jetty, Apache ServiceMix/Camel/CXF, avec un cache distribué Hazelcast, donc plein de technos sympas.

Le deuxième speaker, Stéphane Épardaud (moi-même, donc), de Red Hat, va nous parler du nouveau langage de programmation [Ceylon](http://ceylon-lang.org), qui a rien moins comme but de sauver le monde, un programmeur à la fois :) Ce talk présentera le langage, et montrera une démo de ce que vous pouvez déjà faire avec.

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="http://www.eventbrite.com/tickets-external?eid=4982207918&ref=etckt&v=2" frameborder="0" height="214" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Sell Tickets Online</a> <span style="color:#ddd;">through</span> <a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com?ref=etckt">Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:30|[La Nouvelle Star : l'histoire de 1 milliard de SMS / mois via une API](#HLaNouvelleStar:l27histoirede1milliarddeSMS2FmoisviauneAPI), _par [Guilhem Ensuque](#HGuilhemEnsuque)_|
|19:30 - 20:00|Pause buffet — discussions|
|20:00 - 21:30|[Introduction à Ceylon](#HIntroductionE0Ceylon), _par [Stéphane Épardaud](#HStE9phaneC9pardaud)_|

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

## La Nouvelle Star : l'histoire de 1 milliard de SMS / mois via une API

Il était une fois des gens qui voulaient envoyer un milliard de SMS par mois via une API ...

Cette présentation vous racontera comment cela fut rendu possible, en prenant exemple sur l'architecture et les technologies de [apiGrove](http://apigrove.github.com/apigrove/), notre gateway d'API développé en Java sur Fuse ESB.

On soulèvera le capot pour vous donner des détails sur notre modèle de policy enforcement et de synchronisation de données. Au sein de gros clusters de gateways dans le cloud. Avec haute disponibilité, et haute précision pour le rate limiting des APIs.

## Introduction à Ceylon

Ceylon est un nouveau langage de programmation pour la machine virtuelle Java. Nous sommes fans de Java et de son écosysteme, cependant nous pensons que le langage Java et ses libraires conçus il y a 15 ans sont désuets face aux challenges actuels.

Ceylon a été conçu avec plusieurs objectifs

- Facile à apprendre pour les développeurs Java et C#
- Améliorer le typage fort de Java
- Fournir une syntaxe déclarative pour exprimer des concepts hierarchiques (interface utilisateurs, configuration systeme, etc...)
- Promouvoir l'approche fonctionelle par des objects immuables et des fonction d'ordre supérieur
- Support de la méta programmation
- Modulaire

Cette introduction à Ceylon vous montrera les fonctionnalités de Ceylon ainsi que les derniers progrès fait sur le compilateur, l'IDE et la communauté autour de Ceylon.

# À propos des intervenants

## Guilhem Ensuque

<img style='float: right; margin: 1em' src='GuilhemEnsuque.jpg'/>

A Alcatel-Lucent, Guilhem est le "Product Owner" de apiGrove, un "API gateway" opensource permettant de controller vos APIs REST/SOAP à grande échelle.

Auparavant, Guilhem était responsable de la gestion de produits à OpenPlug, une startup de Sophia Antipolis rachetée par Alcatel-Lucent en 2010. Guilhem a notamment créé l'écosysteme de développeurs autour de l'outil OpenPlug Studio, un environnement multiplateformes pour applications mobiles.

Plus tôt dans sa carrière, il a créé le premier gestionnaire de connexion data mobile pour PCs et PDAs à Alice Systems, et fait de la recherche dans le domaine des réseaux mobiles tout-IP à BT Labs.

## Stéphane Épardaud

<img style='float: right; margin: 1em' src='StephaneEpardaud-120.jpg'/>

Depuis les hautes montagnes de Nice, Stéphane travaille pour Red Hat sur le project Ceylon.

Hacker passionné de Java, C, Perl ou Scheme. Versé dans les standards web et des bases de données, il a travaillé sur divers projets tel qu'un éditeur XML WYSIWYG, une libraire de multi-threading en C, un language pour agents mobiles en Scheme (compilateur et machines virtuelles), ainsi que des services web 2.0 RESTful et des interfaces web riches en HTML 5 / Javascript.

Avide de partage de connaissance, il va souvent parler dans des conférences tels que Scheme Workshop 2004, l´Université de Nice en 2008-2009, de nombreux Java User Groups, dont le Riviera Java User Group qu'il a crée avec Nicolas Leroux. Acteur passionné de l´open source depuis le début, il contribute au projet RESTEasy et crée les projets jax-doclets, stamps.js, quelques modules de Play! Framework et travaille sur les projets Ceylon pour Red Hat.

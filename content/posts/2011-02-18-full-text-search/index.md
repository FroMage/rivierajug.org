---
layout: :theme/post
title: "Vendredi 18 février 2011 @ Sophia-Antipolis : soirée full-text search"
tags: event
author: stephane
---

# Vendredi 18 février 2011 @ Sophia-Antipolis : soirée full-text search

Le Riviera JUG organise une rencontre *gratuite* sur le thème de la recherche de texte le vendredi 18 février 2011 dans les locaux de [l’INRIA Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Que ça soit des clients durs, des applis pour smartphone ou des bonne vielles applications web, on se retrouve toujours avec des utilisateurs qui entrent des données dans l´application, et même si vous avez réussi à éviter la bataille de développeurs qui veulent base relationnelle ou du NOSQL, vous allez vous retrouver avec un coup de fil d´un utilisateur assez rapidement pour vous demander où sont passées ses données.

Tiens, c´est vrai… Elles sont passées où ces données… Comment on va faire pour retrouver ce message envoyé par votre chef qui vous expliquait la procédure pour avoir une augmentation ? Comment mettre la main sur le PDF des impôts qu´on a mis dans le système avant que le fisc ne défonce la porte ?

Il ne suffit pas de laisse les utilisateurs entrer des données, ils sont devenus exigeants ces gens là, il faut aussi leur donner les moyens de les retrouver. Et là c´est la crise : on a besoin de recherche _full-text_.

Ne paniques pas, le Riviera JUG est là pour vous sauvez la peau (comme d´habitude). Ce soir on vous fait venir deux pointures dans le monde de la recherche full-text, avec [Sanne Grinovero](#HSanneGroverino), de JBoss qui nous parlera de [Apache Lucene et de Hibernate Search](#HLucene2FHibernateSearch) (pour ceux qui ont laissé gagné les utilisateurs de base relationnelle), et [Lukáš Vlček](#HLukE1161Vl10Dek) qui nous présentera [ElasticSearch](#HElasticSearch) (pour ceux qui aiment le NOSQL, le REST et le JSON).

Avec tout ça nous allons enfin pouvoir satisfaire les utilisateurs et les développeurs, qui vont enfin pouvoir mettre la main sur la doc du moteur de recherche, qui doit bien être quelque part dans le système, m´enfin j´aurai juré…

# Réservation

_Réservations fermées_



# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil — café|
|18:30 - 19:30|[ElasticSearch](#HElasticSearch), _par [Lukáš Vlček](#HLukE1161Vl10Dek)_|
|19:30 - 20:00|Pause — buffet|
|20:00 - 21:00|[Lucene/Hibernate Search](#HLucene2FHibernateSearch), _par [Sanne Groverino](#HSanneGroverino)_|
|21:00 - 21:30|Fin/Rencontres — buffet|

# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('avisto-150.png')})](http://www.avisto.com) | Sponsor annuel|
|[![alt text]({site.page('Sponsors/index.md').image('lunatech-research-logo-small.png')})](http://www.lunatech.fr) | Employeur des deux organisateurs|
|[![alt text]({site.page('Sponsors/index.md').image('inria-small-transp.gif')})](http://www.inria.fr)  | Salle|

# Pour venir

Salle « Euler Violet », bâtiment Euler en face du poste de garde (le gardien vous l’indiquera quand vous arriverez sur le site).

INRIA Sophia-Antipolis
2004, route des Lucioles
06902 Sophia Antipolis

[Plan d’accès](http://www-sop.inria.fr/presentation/data/plan_sophia.jpg).

<div class='warning'>Prevoyez une pièce d’identité pour le poste de garde.</div>

<iframe width="800" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.fr/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685&amp;output=embed"></iframe><br /><small><a href="http://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685" style="color:#0000FF;text-align:left">View Larger Map</a></small>

# Programme détaillé

## ElasticSearch

ElasticSearch is a distributed, highly available, RESTful search engine built on top of Lucene. In this talk we will go through basic concepts and APIs. We will take a closer look at its REST API and we will build a real application with pure AJAX web interface during this talk.

## Lucene / Hibernate Search

Highly available and scalable JPA2 applications using fulltext search. We'll introduce Hibernate Search, the Hibernate extension which integrates Lucene into the well known JPA paradigm, then highlight some of the neat tricks you get with the latest versions, finally focusing on Infinispan integration which provides true real time and dynamic index distribution and eases cloud deployments.



# À propos des intervenants

## Lukáš Vlček

<img style='float: right' src='lukas-vlcek.jpg'/>

Lukáš Vlček started his career in 2000 as a graphic designer and web developer but was eventually grabbed by Java and server side coding.

He spent many years developing applications for world wide organisations, but after all, his growing passion about Java open source brought him to JBoss in 2009 and his second passion for full text search led him to joining JBoss community team in June 2010. His responsibility (calling would be a better word) is to improve full text search for the jboss.org web site and make it really rock!

## Sanne Grinovero

<img style='float: right' src='sanne-grinovero-120.jpg'/>

Working in the Hibernate and Infinispan teams of JBoss focusing on Lucene integrations, striving to make it easier to use, improve scalability. Early adopter of large cloud deployments, I'we been scaling Lucene on EC2 using Hibernate Search, and designed a clusterable cloud friendly JIRA edition using Infinispan. Have been trainer on Seam and Hibernate courses. Currently based in Newcastle, I've lived in The Netherlands, Italy, Portugal, Southern America.

Website: http://in.relation.to, http://codingobsession.blogspot.com
Location: Newcastle, UK
Occupation: Software Engineer at JBoss, a Division of Red Hat Inc

---
layout: :theme/post
title: "Vendredi 6 mai 2011 @ Sophia-Antipolis : soirée Envers et TorqueBox"
tags: event
author: stephane
---

# Vendredi 6 mai 2011 @ Sophia-Antipolis : soirée Envers et TorqueBox

Le Riviera JUG organise une rencontre *gratuite* sur le thème de Envers et TorqueBox le vendredi 6 mai 2011 dans les locaux de [l’INRIA Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Avant, quand on faisait une nouvelle version de quelque chose, on écrasait l´ancienne. On rase un immeuble pour en faire un autre. C´était pareil dans le logiciel il n´y a pas si longtemps. On a ensuite commencé par faire des backups, « au cas où » (et en général le cas se présentait), histoire de pouvoir revenir en arrière un peu. On pouvait donc sauver la base de données du site en prod.

Ensuite on a compris l´utilité des systèmes de version de code ([VCS](http://en.wikipedia.org/wiki/Revision_control)), histoire de pouvoir garder chaque version antérieure du code pour l´historique plus qu´en cas de désastre. Il a fallu attendre [Wikipedia](http://en.wikipedia.org/wiki/Main_Page) pour que le même principe s´applique aux données en ligne.

Depuis Wikipedia on s´attend tous à pouvoir voir les anciennes versions de ce qu´on a touché, de ce que les autres ont touché, et même de pouvoir les restaurer individuellement (contrairement à la base de données complête). Et ça, si vous avez déjà du l´implémenter, c´est dur.

Enfin, plus depuis [Envers](http://www.jboss.org/envers), la librairie de versioning de [Hibernate](http://www.hibernate.org/), écrite par [Adam Warski](http://www.warski.org/), qui viendra nous la présenter. Avec cette librairie on peut sauvegarder automatiquement tous les anciennes versions des entités [JPA](http://en.wikipedia.org/wiki/Java_Persistence_API) qui sont modifiées, faire des requêtes sur les anciennes versions et même les restaurer.

Adam viendra nous montrer tout ça lui-même, et profitera de son passage pour nous parler de [TorqueBox](http://torquebox.org/), un serveur d´application [Ruby On Rails](http://rubyonrails.org) basé sur [JBoss AS](http://www.jboss.org/jbossas/). Il nous montrera comment il a implémenté [JBison](https://www.jbison.com), avec TorqueBox et [CDI/Weld](http://seamframework.org/Weld) (le framework d´injection de dépendances type-safe de Java EE 6).

Une fois de plus nous vous faisons venir un intervenant de qualité pour parler de logiciels de qualité, alors inscrivez-vous vite :)

# Réservation

_Réservations fermées_



# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil — café|
|18:30 - 19:30|[Envers - entity versioning/auditing for Hibernate](#Envers), _par [Adam Warski](#Adam)_|
|19:30 - 20:00|Pause — buffet|
|20:00 - 21:00|[Torquebox & CDI - taking the best from Java and Ruby, or how we built JBison](#JBison), _par [Adam Warski](#Adam)_|
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

<iframe width="600" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.fr/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685&amp;output=embed"></iframe><br /><small><a href="http://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685" style="color:#0000FF;text-align:left">View Larger Map</a></small>

# Programme détaillé

## Torquebox & CDI - taking the best from Java and Ruby, or how we built JBison

[JBison](https://www.jbison.com) is built using two technologies, which at first glance belong to two completely different worlds: [Ruby On Rails](http://rubyonrails.org) and [CDI/Weld](http://seamframework.org/Weld). Mostly thanks to the excellent [Torquebox](http://torquebox.org) server!

Torquebox, a project led by Bob McWhirter, is a modified JBoss AS server which integrates the JEE and Ruby environments. It enables deploying RoR applications as web applications, supports messaging (based on JMS), gives you a possibility to quickly and easily cluster your Ruby application, and more!

CDI is a relatively new specification which was introduced as a part of JEE6. It aims at standardizing dependency injection, combining the best features of Seam and Guice. It also contains some innovations in the area, like [Portable Extensions](http://docs.jboss.org/weld/reference/latest/en-US/html/extend.html).

But if we decide to write an application using CDI, do we also have to use JSF? Luckily not!

In the presentation I will show how to start working with the Torquebox server; how to write a simple web application, which has a Ruby on Rails front-end and a CDI back-end. I will also talk about our (mine and [Tomek Szymanski](http://twitter.com/#!/szimano)'s, who was working with me on the project) experiences from working with such an
exotic mix.

## Envers - entity versioning/auditing for Hibernate

There are numerous situations where it is very useful to maintain an audit of some data stored in the database. One prominent example is a wiki-type application, where the possibility to view the history of changes made to a page (an entity) is one of the main features.

Envers started as a stand-alone project - extension for Hibernate, and in early 2009 became a core module. It has one main purpose and function: to easily store and retrieve historical data. Using it is transparent to the programmer, and very non-intrusive. Code changes are minimal, and boil down to adding just one annotation to your entities: @Audited. No additional actions are required from the programmer to store historical data, it is done automatically behind the scenes. Also, "latest" data can be accessed as always; querying, persisting, removing entities is done normally (using either the Session or EntityManager).

A clean and simple interface is provided for reading historical data. For each successful transaction, in which audited data is changed, a revision is created, similarly to a version control system like Subversion. This way, only data in "consistent" state is captured as a new revision. A very important feature of Envers is that apart from auditing basic data types, like strings, numbers, dates, etc, you can also audit relations between entities. Thanks to that, it is possible to explore the data that the database contained at a given timestamp/revision with ease.

It is also possible to query historical data - for example, to execute a query "at a given revision", or to query for revisions of an entity satisfying some specified conditions.

# À propos des intervenants

## Adam Warski

<img style='float: right' src='adam-warski-120.png'/>

Graduated from the University of Warsaw, he received a Master's Degree in Computer Science. Founder and lead developer of Hibernate Envers, a Hibernate core module, which provides entity versioning/auditing capabilities. He is also one of the co-founders of SoftwareMill, a company specializing in delivering customized software solutions (http://softwaremill.eu, "Extraordinary software as a standard"), based on Java and JBoss technologies.

After work, apart from being involved in development of Envers, he works on several small projects around static analysis (using JSR 308 - Typestate Annotations/ Checkers Framework and FindBugs), and some CDI/Weld (not always portable) extensions, like autofactories or stackable security interceptors. He is also interested in new JVM-based languages, especially with functional elements (like Scala, JRuby) and frameworks built using them (like Lift), as well as improving the ways we use Dependency Injection. When not working, he enjoys hiking in the mountains (summer), skiing (winter) and playing tennis.

His website: [[http://www.warski.org]]

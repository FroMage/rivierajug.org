---
layout: :theme/post
title: "Jeudi 19 mars 2015 @ Sophia-Antipolis : soirée jOOQ"
tags: event
author: stephane
---

# Jeudi 19 mars 2015 @ Sophia-Antipolis : soirée jOOQ

Le Riviera JUG organise une rencontre **gratuite** sur le thème de jOOQ le jeudi 19 mars 2015 à partir de 18h dans les locaux d´[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Bon, je sais, ça commence à se voir : je ne connais pas _tous_ les sujets qu’on va faire présenter au JUG. Mais c’est aussi pour découvrir des choses qu’on fait ce JUG, alors c’est normal de ne pas tout connaître.

Visiblement jOOQ c’est un super truc pour… Oh eh ben je vous propose de lire l’abstract en bas de page après tout, vous serez aussi bien servi que moi ;)

En tous les cas, ne ratez pas cette soirée !

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="//eventbrite.com/tickets-external?eid=16104510023&ref=etckt" frameborder="0" height="214" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Sell Tickets</a> <span style="color:#ddd;">through</span> <a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com?ref=etckt">Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:25|[jOOQ: Get Back in Control of Your SQL](#HjOOQ:GetBackinControlofYourSQL), _par [Lukas Eder](#HLukasEder)_|
|19:25 - 19:35|Pause — discussions|
|19:35 - 20:30|[2000 Lines of Java? Or 50 lines of SQL? The Choice is Yours](#H2000LinesofJava3FOr50linesofSQL3FTheChoiceisYours), _par [Lukas Eder](#HLukasEder)_|

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

## jOOQ: Get Back in Control of Your SQL

SQL is a powerful and highly expressive language for queries against relational databases. SQL is established, standardised and hardly challenged by alternative querying languages. Nonetheless, in the Java ecosystem, there had been few relevant steps forward since JDBC to better integrate SQL into Java. All attention was given to object-relational mapping and language abstractions on a higher level, such as OQL, HQL, JPQL, CriteriaQuery. In the meantime, these abstractions have become almost as complex as SQL itself, regardless of the headaches they're giving to DBAs who can no longer patch the generated SQL.

jOOQ is a dual-licensed Open Source product filling this gap. It implements SQL itself as an internal domain-specific language in Java, allowing for the typesafe construction and execution of SQL statements of arbitrary complexity. This includes nested selects, derived tables, joins, semi-joins, anti-joins, self-joins, aliasing, as well as many vendor-specific extensions such as stored procedures, arrays, user-defined types, recursive SQL, grouping sets, pivot tables, window functions and many other OLAP features. jOOQ also includes a source code generator allowing you to compile queries in modern IDEs such as Eclipse very efficiently.

jOOQ is a good choice in a Java application where SQL and the specific relational database are important. It is an alternative when JPA / Hibernate abstract too much, JDBC too little. It shows, how a modern domain-specific language can greatly increase developer productivity, internalising SQL into Java.

## 2000 Lines of Java? Or 50 lines of SQL? The Choice is Yours

After Object-Databases, XML-Databases, ORMs, and NoSQL, we dare have a look at SQL, the core database language and how it evolved - from a Java perspective.

In the past decade, RDBMS related traction has moved away completely from SQL towards JPA / JPQL, or even further, towards NoSQL. Evangelists have widely agreed that RDBMS are not "web scale", even if the race is far from being decided.

In this talk, I want to show you how many features you're missing out on, when you don't do real SQL. When you don't take advantage of recent SQL standard evolutions, such as SQL:1999 hierarchical SQL, SQL:2003 window functions, or many vendor specific extensions. In an example session, we're going to look at how we can calculate running totals on medium-sized data sets using

- nested selects
- window functions
- hierarchical SQL
- the Oracle MODEL clause
- stored functions

And most importantly, we're going to see how the above can help us increase performance while we decrease the number of lines of code when using any of MyBatis, jOOQ, or SpringJDBC.

# À propos des intervenants

## Lukas Eder

<img style='float: right; margin: 1em' src='lukas-eder.jpg'/>

I am the founder and CEO of Data Geekery GmbH, located in Zurich, Switzerland. With our company we have been selling database products and services around Java and SQL since 2013. Ever since my Master’s studies at EPFL in 2006, I have been fascinated by the interaction of Java and SQL. Most of this experience I have obtained in the Swiss E-Banking field through various variants (JDBC, Hibernate, mostly with Oracle). I am happy to share this knowledge at various conferences, JUGs, in-house presentations and on my blog. Here’s my conference and JUG talk schedule for the most recent time: http://www.jooq.org/news.

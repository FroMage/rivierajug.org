---
layout: :theme/post
title: "Vendredi 20 janvier 2012 @ Sophia-Antipolis : soirée EclipseLink"
tags: event
author: stephane
---

# Vendredi 20 janvier 2012 @ Sophia-Antipolis : soirée EclipseLink

Le Riviera JUG organise une rencontre *gratuite* sur le thème de EclipseLink le vendredi 20 janvier 2012 dans les locaux de [l’INRIA Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Dès qu´on parle d´[ORM](http://en.wikipedia.org/wiki/Object-relational_mapping) ou de persistence, on pense brièvement à [JPA](http://en.wikipedia.org/wiki/Java_Persistence_API) puis on parle d´[Hibernate](http://en.wikipedia.org/wiki/Hibernate_(Java)), mais on oublie souvent que l´implémentation de référence de JPA c´est [EclipseLink](http://en.wikipedia.org/wiki/EclipseLink). Eh bien ce soir nous allons rectifier le tir, et vous présenter non seulement EclipseLink, mais encore mieux nous allons voir des aspects très pratiques de son utilisation.

En premier nous allons ainsi voir comment utiliser EclipseLink pour réaliser des applications Web [RESTful](http://en.wikipedia.org/wiki/Restful), puis nous allons découvrir comment résoudre les problèmes de [multitenancy](http://en.wikipedia.org/wiki/Multitenancy). Le tout grâce à Shaun Smith, de Oracle, qui travaille sur EclipseLink et qui viendra nous faire le plaisir de nous présenter tout ça.

# Réservation

_Réservations fermées_



# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil — café|
|18:30 - 19:30|[EclipseLink: The Evolution of Java Persistence](#HEclipseLink:TheEvolutionofJavaPersistence), _par [Shaun Smith](#HShaunSmith)_|
|19:30 - 20:00|Pause — buffet|
|20:00 - 21:00|[Multitenancy with EclipseLink](#HMultitenancywithEclipseLink), _par [Shaun Smith](#HShaunSmith)_|
|21:00 - 21:30|Fin/Rencontres — buffet|

# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('avisto-150.png')})](http://www.avisto.com) | Sponsor annuel|
|[![alt text]({site.page('Sponsors/index.md').image('lunatech-research-logo-small.png')})](http://www.lunatech.fr) | Sponsor technique|
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

## EclipseLink: The Evolution of Java Persistence

Data access today isn’t just about reading and writing from relational databases anymore. It’s also about mapping your objects to XML and to JSON for use in RESTful web services. It’s about being able to persist your objects in NoSQL databases and being able to cache them in data grids so you can scale out your application to hundreds of servers. The EclipseLink project is well known as an object-relational mapping framework and as the JPA 2.0 reference implementation in Java EE 6, but it is evolving to provide a comprehensive set of data services for Java developers building enterprise and cloud applications in Java EE, Java SE, and in OSGi. In this session we’ll dive into these new services and see how to build modern enterprise Java applications leveraging EclipseLink both in the back end for data persistence and on the front end to build RESTful services that support HTML5 clients. Features will include:

* EclipseLink “JSON-B”—provides Java/JSON binding similar to EclipseLink JAXB’s Java/XML binding. With JSON-B, developers can easily marshall their Java domain model to and from JSON which is the preferred format for HTML5/JavaScript clients.
EclipseLink JPA-RS—provides a service that exposes JPA mapped entities over REST either as XML with JAXB or JSON with EclipseLink JSON-B. It supports a full CRUD API as well as named query invocation.
* Resource Mapping—While JAXB and JSON-B provide a way to marshall to and from XML/JSON, RESTful services require a way to define what constitutes a resource. A naive approach of entity==resource may be used but is likely inefficient. With EclipseLink Resource Mapping the classes in a domain model can be declaratively mapped to a resource model which can be exposed using JPA-RS.
* EclipseLink Dynamic Provisioning—provides persistence services to pure HTML5 applications without the need for Java classes. With Dynamic Provisioning, HTML5 clients can dynamically define storage requirements for a set of classes (object types) and EclipseLink will instantiate a full JPA-RS CRUD service for those classes as well as JPQL query support.

## Multitenancy with EclipseLink

In addition to expanding the boundaries of Java persistence, EclipseLink is the JPA 2.1 reference implementation in Java EE 7. One of major themes of EE 7 is cloud deployment and multitenancy and EclipseLink has been blazing the trail by shipping support for both multitenancy and tenant specific extensions in the Eclipse Indigo release. EclipseLink multitenancy enables the use of a single persistence unit by multiple tenants while keeping their data isolated and secure. But to provide a SaaS platform EclipseLink also provides tenant specific extensions so that each tenant can augment JPA entities with the additional data they need to capture and maintain. In this section we'll:

* Look at the challenges presented by multi-tenancy in Java EE and JPA
* Explore the EclipseLink JPA multi-tenancy and extensibility features
* Introduce the EclipseLink MOXy extensibility features that enable exposing multi-tenant and extended data over REST
* Explore a complete multi-tenant Java EE application that supports dynamic tenant provisioning and customization

# À propos des intervenants

## Shaun Smith

<img style='float: right' src='shaun-smith.jpg'/>

Shaun Smith is a Product Manager for [Oracle TopLink](http://www.oracle.com/technetwork/middleware/toplink/overview/index.html) and an active member of the Eclipse community. He's Ecosystem Development Lead for the [EclipseLink](http://www.eclipse.org/eclipselink) project and a committer on the Eclipse [Gemini Enterprise Modules](http://www.eclipse.org/gemini), and the [Dali Java Persistence Tools](http://www.eclipse.org/webtools/dali) projects. Prior to joining Oracle Shaun was a consultant specializing in enterprise application architecture and agile software development. He's been involved with object persistence since 1996 starting with TopLink for Smalltalk and it's successor TopLink for Java. He's currently working on leveraging EclipseLink JPA and MOXy (JAXB and JSON binding) to accelerate the development of data services for HTML5 applications as well as [Oracle TopLink Grid](http://www.oracle.com/technetwork/middleware/toplink/tl-grid-097210.html) which supports the scaling out of EclipseLink JPA applications using Oracle Coherence.

---
layout: :theme/post
title: "14 janvier 2009 @ Sophia-Antipolis: Mini-conférence Java EE"
tags: event
author: stephane
---

# 14 janvier 2009 @ Sophia-Antipolis: Mini-conférence Java EE

[Lunatech Research](http://www.lunatech-research.com) et l'[IUT de Nice Sophia-Antipolis](http://www.iut.unice.fr) organisent une mini-conférence *gratuite* sur [Java EE](http://java.sun.com/javaee/) le mercredi 14 janvier 2009 sur le site de l'[IUT de Sophia-Antipolis](http://portail.unice.fr/jahia/Jahia/site/iut/pid/9941) ([Google Maps](http://maps.google.fr/maps?q=IUT+Sophia-Antipolis+650,+Route+des+Colles+06560+Valbonne@43.616365,7.071826))

Cette rencontre sera le point de départ du tout nouveau Riviera [JUG](http://java.sun.com/community/usergroups/). Nous attendons de nombreux développeurs et étudiants de Nice et Sophia-Antipolis. Vous pouvez aussi decider de n'assister qu'aux presentations du soir si vous travailler dans la journée.

S’il vous plaît prenez le temps de vous [inscrire en ligne](http://www.lunatech-research.com/event/register/miniconf-sophia). L’inscription est gratuite et même si elle n’est pas obligatoire, elle est recommandée pour nous permettre de prévoir les rafraîchissements d’usage.

N'hesitez pas à [nous contacter](mailto:info@rivierajug.org) pour de plus amples informations.



# Audience

Nous attendons aussi bien des étudiants de l'[IUT Nice-Sophia-Antipolis](http://www.iut.unice.fr) et de [Polytech Nice](http://www.polytechnice.fr/), que des professionnels novices et confirmés. Toutes nos présentations sont accessibles aux débutants tout en restant intéressantes pour les développeurs expérimentés de par la nouveauté des technologies présentées, qui sont souvent négligées par les entreprises avant d'avoir atteint une maturité qui vient souvent trop tardivement.

Le minimum requis pour apprécier ces présentations est de connaître le langage [Java](http://en.wikipedia.org/wiki/Java_(programming_language)) (ou [C#](http://en.wikipedia.org/wiki/C_Sharp) donc, de par leur [similitude](http://en.wikipedia.org/wiki/Comparison_of_C_Sharp_and_Java)), l'univers du [web](http://en.wikipedia.org/wiki/World_Wide_Web) ([HTTP](http://en.wikipedia.org/wiki/HTTP), [HTML](http://en.wikipedia.org/wiki/HTML)...) et d'aimer la programmation. Ces présentations s'adressent principalement aux développeurs avec du code, du code et encore du code. Plein de buzzwords certes — comment les éviter en Java? — mais pas de présentations vagues et abstraites.

Nous vous recommandons de venir nombreux, pour découvrir par besoin ou par curiosité, et échanger des idées avec les intervenants entre les présentations, leur poser des questions, leur suggérer des améliorations. N'oubliez-pas, l'entrée est gratuite.


# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus.</div>

|Horaire|Description|
|---|---|
|13:30 - 14:00|Accueil|
|14:00 - 15:00|Nouvelles technologies de développement Java EE (par Stéphane Épardaud et Nicolas Leroux)|
|15:15 - 16:00|RESTful web services avec JAX-RS (par Stéphane Épardaud)|
|16:15 - 16:45|Pause café|
|16:45 - 17:45|Programmation de Portlets (par Julien Viet)|
|18:00 - 19:00|GlassFish v3 (par Alexis Moussine-Pouchkine)|
|19:15 - 19:30|Fin/Rencontres|





# Programme détaillé

## Nouvelles technologies de développement Java EE

À travers la création d'un service web permettant de gérer les évènements que nous organisons, nous présentons plusieurs technologies [Java EE](http://java.sun.com/javaee/) récentes ou futures de façon incrémentale. Nous présentons ainsi JSF ([Java Server Faces](http://java.sun.com/javaee/javaserverfaces/)) et [Facelets](https://facelets.dev.java.net/) pour l'interface web, EJB ([Enterprise Java Beans](http://java.sun.com/products/ejb/)) et [Seam](http://www.seamframework.org) pour le middle-tier, JPA ([Java Persistence API](http://java.sun.com/developer/technicalArticles/J2EE/jpa/)) pour le storage-tiers, [Hibernate Validation](http://www.hibernate.org/412.html) et [Bean Validation](http://jcp.org/en/jsr/detail?id=303) pour les contraintes DB de haut-niveau, JAXB ([Java API for XML Binding](https://jaxb.dev.java.net/)) pour la sérialisation XML, [JAX-RS](https://jsr311.dev.java.net/) (Java API for [RESTful](http://en.wikipedia.org/wiki/REST) services) pour les web services, [Hibernate Search](http://www.hibernate.org/410.html) pour le [full-text search](http://en.wikipedia.org/wiki/Full_text_search), [Drools](http://www.jboss.org/drools/) pour l'inférence d'information.

Bien entendu nous survolons les technologies mais prenons le temps à chaque fois de les présenter en montrant des exemples concrets et fonctionnels. Après ce tour d'horizon, vous saurez de quoi Java EE est capable.

## RESTful web services avec JAX-RS

[RESTful](http://en.wikipedia.org/wiki/REST) est le dernier-cri des protocoles de [web services](http://en.wikipedia.org/wiki/Web_service). Contrairement à [SOAP](http://en.wikipedia.org/wiki/Simple_Object_Access_Protocol) ou [XML-RPC](http://en.wikipedia.org/wiki/XML-RPC) qui définissent un protocole complexe, RESTful utilise [HTTP](http://en.wikipedia.org/wiki/HTTP) comme transport et permet d'accéder directement aux ressources distantes au moyen d'[URLs](http://en.wikipedia.org/wiki/Uniform_Resource_Locator) simples et structurés. Chaque ressource peut avoir une ou plusieurs représentations différentes. Tout cela permet à des clients simples d'obtenir des données structurées et formatées à leur goût.

[JAX-RS](https://jsr311.dev.java.net/) est le nouveau [JSR](http://jcp.org/en/jsr/overview) permettant d'implementer une API RESTful en Java au moyen d'annotations. Il est très simple de déclarer quels URLs invoqueront quelles méthodes, quels paramètres (path, query...) seront acceptés et comment sérialiser les données en plusieurs formats ([XML](http://en.wikipedia.org/wiki/XML), [JSON](http://www.json.org/)...). Nous présenterons JAX-RS et l'implémentation de [Bill Burke](http://bill.burkecentral.com/) pour [JBoss](http://www.jboss.org): [RESTEasy](http://www.jboss.org/resteasy/). Bill Burke ne pouvant malheureusement venir, Stéphane Épardaud fera une présentation basée sur celle de Bill Burke.

## Programmation de Portlets

Les portlets sont un élément essentiel dans l'intégration d'applications dans un environment de type portail. Les specifications Portlet 1.0 (JSR 168) et plus récemment Portlet 2.0 (JSR 286) fournissent un modèle de composant qui permet de développer des applications qui s'integrent dans des portails de manière portables. La spécification Portlet 2.0 apporte de nombreuses fonctionnalités qui permettent aux portlets d'interragir et de communiquer ainsi que les fonctionnalités Ajax.

La session débute par une introduction générale aux portail d'entreprise et développe ensuite l'API Portlet et ses spécificités. L'API Portlet est comparée avec l'API Servlet et les similarités et différences sont expliquées. Finallement la session se termine avec l'intégration d'applications basées sur des frameworks existants.

## Glassfish V 3.0

[GlassFish](https://glassfish.dev.java.net/) est le serveur d'applications Open Source de [Sun](http://www.sun.com) qui monte. Sa version [v3 Prelude](http://www.sun.com/software/products/glassfishv3_prelude/index.xml), disponible depuis peu, propose un environnement modulaire, extensible, standard et léger. Cette présentation couvrira ces différents qualificatifs. Pour les amateurs d'acronymes, on peut citer [Java EE 6](http://jcp.org/en/jsr/detail?id=313), [OSGi](http://www.osgi.org/), [HK2](https://hk2.dev.java.net/), [JSP](http://en.wikipedia.org/wiki/JavaServer_Pages), [Servlet](http://java.sun.com/products/servlet/), [JSF](http://en.wikipedia.org/wiki/JavaServer_Faces), [JPA](http://java.sun.com/javaee/overview/faq/persistence.jsp), [JAX-RS](https://jsr311.dev.java.net/), [jersey](https://jersey.dev.java.net/), [jruby](http://jruby.codehaus.org/), [grails](http://grails.org/), metro, [EJB 3.1](http://jcp.org/en/jsr/detail?id=318), embedded, etc ! Le tout avec des démonstrations bien entendu.


# À propos des intervenants

## Julien Viet

<img style='float: right;' src='portrait-julien.jpg'/>

[Julien Viet](http://www.julienviet.com/) a rejoint la [communauté JBoss](http://www.jboss.org) en 2001 peu de temps après s'est fait embaucher par la [compagnie JBoss](http://www.jboss.com). À JBoss, Julien a commencé comme contributeur au projet [JBoss Application Server](http://www.jboss.com/products/platforms/application) en 2002. En 2004, il fonde le projet open-source [JBoss Portal](http://www.jboss.org/jbossportal) et en reste à la tête jusqu'à août 2008.

Il est membre du groupe d'experts _[JSR 286 Portlet 2.0](http://jcp.org/en/jsr/detail?id=286)_ et de la spécification _[JSR 283 Content Repository](http://jcp.org/en/jsr/detail?id=283) for Java Technology API 2.0_.

Aujourd'hui Julien est _portal product manager_ à [eXo platform](http://www.exoplatform.com/).

Il a parlé aux conférences suivantes:

* _what's new and cool in Portlet 2.0_ à [JavaZone](http://javazone.no/) en septembre 2008;
* _what's new and cool in Portlet 2.0_ à WebExpo Bern en mars 2008;
* _portlet Best Practices_ à [Javaone](http://java.sun.com/javaone/) en 2006;
* _JBoss Portal talk_ à [Javapolis](http://www.javapolis.com/) en 2005;
* _[JBoss World](http://www.jbossworld.com/)_ plusieurs fois.




## Nicolas Leroux

<img style='float: right;' src='portrait-nicolas.jpg'/>

Niçois d'origine, il est maintenant basé à Rotterdam, Pays-Bas où il travaille comme développeur senior à [Lunatech Research](http://www.lunatech-research.com). Il a de nombreuses années d'expérience de conception d'applications Java EE pour l'industrie et le service public grâce aux librairies open-source et des méthodes [agiles](http://en.wikipedia.org/wiki/Agile_software_development).

Expert en [Enterprise Java Beans](http://java.sun.com/products/ejb/), [JBoss Seam](http://www.seamframework.org), [Java Message Service](http://java.sun.com/products/jms/), [JBPM](http://jboss.com/products/jbpm), [Struts](http://struts.apache.org/), [Spring](http://www.springframework.org/) pour ne citer qu'eux, car il met un point d'honneur à tester les nombreux nouveaux frameworks qui sortent chaque année, restant ainsi à la pointe des dernières innovations. Organisateur de plusieurs [Benelux JBug](http://www.lunatech-research.com/archives/2008/01/17/jbug-2008-02) ([JBoss User Group](http://jboss.org/resources/jbugs.html)) à Rotterdam. [Présentation](http://www.parleys.com/display/PARLEYS/Home#talk=18972706;slide=1;title=Seam%20in%20Action%20-%20Part%202) à [Javapolis](http://www.javapolis.com/) en 2007.


## Stéphane Épardaud

<img style='float: right;' src='portrait-stef.jpg'/>

Senior développeur à [Lunatech Research](http://www.lunatech-research.com) depuis 1998, aujourd'hui basé dans l'[arrière-pays Niçois](http://fr.wikipedia.org/wiki/Nice). Passionné de hacks [Java](http://en.wikipedia.org/wiki/Java_(programming_language)), [C](http://en.wikipedia.org/wiki/C_(programming_language)), [Perl](http://en.wikipedia.org/wiki/Perl) ou [Scheme](http://en.wikipedia.org/wiki/Scheme_(programming_language)). Baigné dans les [standards web](http://en.wikipedia.org/wiki/Web_standards) et les [bases de données](http://en.wikipedia.org/wiki/Database), il a implémente entre autres un éditeur [XML](http://en.wikipedia.org/wiki/XML) [WYSIWYG](http://en.wikipedia.org/wiki/WYSIWYG), une [librairie de multi-threading](http://www-sop.inria.fr/teams/mimosa/Stephane.Epardaud/lurc/) en C, un [langage pour agents mobiles](http://www-sop.inria.fr/teams/mimosa/Stephane.Epardaud/ulm/) en Scheme (compilateur, machine virtuelle), des services [Web 2.0](http://en.wikipedia.org/wiki/Web_2.0)] comme [VisibleLogistics](http://www.visiblelogistics.com). Présentations au [Scheme Workshop 2004](http://www.cs.indiana.edu/scheme2004/), à l'IUT de Nice en 2008. Il est investi à temps plein depuis 2008 dans les nouvelles technologies [Java EE](http://java.sun.com/javaee/) et [Web 2.0](http://en.wikipedia.org/wiki/Web_2.0), il dévore les [JSRs](http://jcp.org/en/jsr/overview) et utilise les plus récents projets open source auquels il contribue souvent.


## Alexis Moussine-Pouchkine

<img style='float: right;' src='portrait-alexis.jpg'/>

[Alexis Moussine-Pouchkine](http://blogs.sun.com/alexismp) aime le bon vin et les architectures Java. Chez [Sun Microsystems](http://www.sun.com), il tient le rôle d’ambassadeur du projet Libre [GlassFish](https://glassfish.dev.java.net/), un serveur d’application Java EE de nouvelle génération. Ceci lui permet de rencontrer lors de réunions ou de conférences de nombreux développeurs Java et autres utilisateurs de technologies libres. Il participe à plusieurs communautés open source, traduit en français des ouvrages techniques autour de [Java](http://en.wikipedia.org/wiki/Java) ou [XML](http://en.wikipedia.org/wiki/XML) et possède une vie en dehors de Java. Alexis est intervenu aux conférences [JavaZone](http://www.javazone.no/), [JavaPolis/Devoxx](http://devoox.com), [Jazoon](http://jazoon.com/), [CommunityOne](http://developers.sun.com/events/communityone/) et [Sun TechDays](http://developers.sun.com/events/techdays/).







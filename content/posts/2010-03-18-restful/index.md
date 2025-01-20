---
layout: :theme/post
title: "18 Mars 2010 @ Sophia-Antipolis : soirée RESTful"
tags: event
author: stephane
---

# Jeudi 18 Mars 2010 @ Sophia-Antipolis : soirée RESTful

Le Riviera JUG organise une rencontre *gratuite* sur le thème des architectures [RESTful](http://en.wikipedia.org/wiki/Representational_State_Transfer) le jeudi 18 mars 2010 dans les locaux de [l’INRIA Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Le RESTful, c’est un paradigme de services webs nouveau, étrange, et souvent peu ou mal compris. Et pourtant c’est l’avenir. Ses partisans en disent autant de bien que ses détracteurs en disent du mal. Les discussions sont souvent animées et nous comptons bien en avoir une de haut vol.

Dans une première partie nous aurons le plaisir de découvrir le [Play! framework](http://www.playframework.org) grâce à rien de moins que son concepteur, Guillaume Bort. Habib Guergachi se joindra à la présentation pour nous parler des architectures RESTful. Play! est un framework web RESTful, assez récent mais très novateur.

Ensuite Stéphane Épardaud nous fera partager une session de code en direct pour expliquer l’API RESTful de Java, JAX-RS, et l’implémentation de JBoss, RESTEasy, sur lequel il contribue.

# Réservation

<iframe id="rivierajug-2010-mars" allowTransparency="true" width="570" height="500" frameborder="0">You must have a browser that supports iframes</iframe>





# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil — café|
|18:30 - 19:30|<a href="#play">Play! framework</a>, _par <a href="#guillaume">Guillaume Bort</a> et <a href="#habib">Habib Guergachi</a>_|
|19:30 - 20:00|Pause — buffet|
|20:00 - 21:00|<a href="#rest">RESTful web services in JAX-RS/RESTEasy</a>, _par <a href="#stef">Stéphane Épardaud</a>_|
|21:00 - 21:30|Fin/Rencontres — buffet|


# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('lunatech-research-logo-small.png')})](http://www.lunatech.fr) | Employeur des deux organisateurs|
|[![alt text]({site.page('Sponsors/index.md').image('inria-small-transp.gif')})](http://www.inria.fr)  | Salle|

# Pour venir

Salle « Euler Violet », bâtiment Euler en face du poste de garde (le gardien vous l’indiquera quand vous arriverez sur le site).

INRIA Sophia-Antipolis<br/>
2004, route des Lucioles<br/>
06902 Sophia Antipolis

[Plan d’accès](http://www-sop.inria.fr/presentation/data/plan_sophia.jpg).

<div class='warning'>Prevoyez une pièce d’identité pour le poste de garde.</div>

<iframe width="800" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.fr/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685&amp;output=embed"></iframe><br /><small><a href="http://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=inria,+sophia-antipolis&amp;sll=47.15984,2.988281&amp;sspn=20.81297,46.757813&amp;ie=UTF8&amp;t=h&amp;ll=43.626819,7.071934&amp;spn=0.005406,0.011415&amp;z=14&amp;iwloc=A&amp;cid=556043547175134685" style="color:#0000FF;text-align:left">View Larger Map</a></small>

# Programme détaillé

<a name="rest"/>

## RESTful web services in JAX-RS/RESTEasy

<a href="http://en.wikipedia.org/wiki/REST" rel="nofollow">RESTful</a> est le dernier-cri des protocoles de <a href="http://en.wikipedia.org/wiki/Web_service" rel="nofollow">web services</a>. Contrairement à <a href="http://en.wikipedia.org/wiki/Simple_Object_Access_Protocol" rel="nofollow">SOAP</a> ou <a href="http://en.wikipedia.org/wiki/XML-RPC" rel="nofollow">XML-RPC</a> qui définissent un protocole complexe, RESTful utilise <a href="http://en.wikipedia.org/wiki/HTTP" rel="nofollow">HTTP</a> comme transport et permet d'accéder directement aux ressources distantes au moyen d’<a href="http://en.wikipedia.org/wiki/Uniform_Resource_Locator" rel="nofollow">URLs</a> simples et structurés. Chaque ressource peut avoir une ou plusieurs représentations différentes. Tout cela permet à des clients simples d'obtenir des données structurées et formatées à leur goût.

<a href="https://jsr311.dev.java.net/" rel="nofollow">JAX-RS</a> est le nouveau <a href="http://jcp.org/en/jsr/overview" rel="nofollow">JSR</a> permettant d'implementer une API RESTful en Java au moyen d'annotations. Il est très simple de déclarer quels URLs invoqueront quelles méthodes, quels paramètres (path, query...) seront acceptés et comment sérialiser les données en plusieurs formats (<a href="http://en.wikipedia.org/wiki/XML" rel="nofollow">XML</a>, <a href="http://www.json.org/" rel="nofollow">JSON</a>…). Nous présenterons JAX-RS et l'implémentation de <a href="http://www.jboss.org" rel="nofollow">JBoss</a> : <a href="http://www.jboss.org/resteasy/" rel="nofollow">RESTEasy</a> et ses extensions.

<a name="play"/>

## Play! framework

Play! est un framework Java Web nouvelle génération et sans compromis: il apporte toute l'agilité et la productivité des frameworks basés sur les langages dynamiques dont Java n'avais jamais pu profiter.
Contrairement a de nombreux frameworks Java qui ne sont que des tentatives de masquer des technologies trop complexes telles que JSF ou EJB, Play! s'attaque aux problèmes du développement Web avec Java
de manière totalement novatrice et rompt définitivement avec les pratiques avérées non viables du monde JEE.

Créé par des développeurs Web pour des développeurs Web, Play! offre un environnement de très haute productivité grâce à un cycle de développement hyper optimisé sans phase de compilation! ni phase de
déploiement!. Tout ceci associé à des rapports d'erreurs d'une perfection inédite allant même jusqu'à une proposition de résolution du problème. En s'appuyant complétement sur le langage Java, il permet de profiter de la richesse de son ecosystème ainsi que de ses outils de développement et d'optimisation les plus modernes.


# À propos des intervenants

<a name="stef"/>

## Stéphane Épardaud

<img style='float: right;' src='stef-epardaud.jpg'/>

Senior développeur à <span><a href="http://www.lunatech-research.com" rel="nofollow">Lunatech Research</a></span> depuis 1998, aujourd'hui basé dans l'<span><a href="http://fr.wikipedia.org/wiki/Nice" rel="nofollow">arrière-pays Niçois</a></span>. Passionné de hacks <span><a href="http://en.wikipedia.org/wiki/Java_%28programming_language%29" rel="nofollow">Java</a></span>, <span><a href="http://en.wikipedia.org/wiki/C_%28programming_language%29" rel="nofollow">C</a></span>, <span><a href="http://en.wikipedia.org/wiki/Perl" rel="nofollow">Perl</a></span> ou <span><a href="http://en.wikipedia.org/wiki/Scheme_%28programming_language%29" rel="nofollow">Scheme</a></span>. Baigné dans les <span><a href="http://en.wikipedia.org/wiki/Web_standards" rel="nofollow">standards web</a></span> et les <span><a href="http://en.wikipedia.org/wiki/Database" rel="nofollow">bases de données</a></span>, il a implémente entre autres un éditeur <span><a href="http://en.wikipedia.org/wiki/XML" rel="nofollow">XML</a></span> <span><a href="http://en.wikipedia.org/wiki/WYSIWYG" rel="nofollow">WYSIWYG</a></span>, une <span><a href="http://www-sop.inria.fr/teams/mimosa/Stephane.Epardaud/lurc/" rel="nofollow">librairie de multi-threading</a></span> en C, un <span><a href="http://www-sop.inria.fr/teams/mimosa/Stephane.Epardaud/ulm/" rel="nofollow">langage pour agents mobiles</a></span> en Scheme (compilateur, machine virtuelle), des services <span><a href="http://en.wikipedia.org/wiki/Web_2.0" rel="nofollow">Web 2.0</a></span>) comme <span><a href="http://www.visiblelogistics.com" rel="nofollow">VisibleLogistics</a></span>. Présentations au <span><a href="http://www.cs.indiana.edu/scheme2004/" rel="nofollow">Scheme Workshop 2004</a></span>, à l'IUT de Nice en 2008. Il est investi à temps plein depuis 2008 dans les nouvelles technologies <span><a href="http://java.sun.com/javaee/" rel="nofollow">Java EE</a></span> et <span><a href="http://en.wikipedia.org/wiki/Web_2.0" rel="nofollow">Web 2.0</a></span>, il dévore les <span><a href="http://jcp.org/en/jsr/overview" rel="nofollow">JSRs</a></span> et utilise les plus récents projets open source auquels il contribue souvent, dont RESTEasy sur lequel il est committer.

<a name="guillaume"/>

## Guillaume Bort

<img style='float: right;' src='guillaume.jpg'/>

Guillaume Bort, est lead developper du projet Play! framework et co-fondateur et CTO du cabinet de conseil [Zenexity](http://www.zenexity.fr) spécialisé dans les architectures pure Web. Après avoir commencé sa carrière au sein d'une grande SSII, il rejoint l'équipe [ECOO de l'INRIA](http://www.inria.fr/recherche/equipes/ecoo.en.html), contribue à plusieurs projets open source de renommée, et rejoint Zenexity où il dirige des missions de conseil en transformations de SI d'entreprises prestigieuses.


<a name="habib"/>

## Habib Guergachi

<img style='float: right;' src='habib.jpg'/>

Habib GUERGACHI, co-fondateur et PDG de [Zenexity](http://www.zenexity.fr) fait partie des architectes français qui ont introduit des concepts forts, comme le "coefficient d'intégrabilité" des applications. Plus de 7 ans à la Direction Centrale des SI d'[AXA](http://www.axa.fr), plus de 3 ans à Direction de la Stratégie des SI à la [Société Générale](http://www.societegenerale.fr/), 5 ans au comité exécutif et Direction Technique d'une grande SSII, il pilote aujourd'hui des grands projets d'Urbanisation et transformation de SI vers le WEB. Il anime plusieurs séminaires au sein du prestigieux [Capgemini Institut](http://www.fr.capgemini.com/collaboration/capgemini_institut/).






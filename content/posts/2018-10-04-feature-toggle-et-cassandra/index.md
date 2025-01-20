---
layout: :theme/post
title: "Jeudi 4 octobre 2018 @ Sophia-Antipolis : soirée feature toggle et Cassandra"
tags: event
author: stephane
---

# Jeudi 4 octobre 2018 @ Sophia-Antipolis : soirée feature toggle et Cassandra

Le Riviera JUG organise une rencontre **gratuite** sur le thème des feature toggle et de Cassandra le jeudi 4 octobre 2018 à partir de 18h dans les locaux d’[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Oyez! Oyez! Pour ce deuxième JUG de la saison, nous vous proposons une soirée avec deux sujets très différents !

On commencera en parlant de feature toggling, ces outils qui permettent d'activer/désactiver des fonctionnalités en prod. Ca fait rêver beaucoup de monde mais s'en servir au jour le jour c'est plus compliqué. Cédrick Lunven, créateur et main commiter du projet FF4J démystifiera tout ça et nous montrera des exemples d'usages concret.

On enchainera avec Cédrick pour parler d'API. GraphQL, GRPC, REST, WebFlux, OData; il existe de nombreux protocoles pour implémenter une API. Cette session sera donc l'occasion d'un tour d'horizon à travers une session de coding qui montrera les avantages et inconvénients de ces solutions.

Ne manquez pas cette soirée :)

# Réservation

<div id="eventbrite-widget-container-50631383832"></div>

<script src="https://www.eventbrite.com/static/widgets/eb_widgets.js"></script>

<script type="text/javascript">
var exampleCallback = function() \{
console.log('Order complete!');
};

window.EBWidgets.createWidget(\{
// Required
widgetType: 'checkout',
eventId: '50631383832',
iframeContainerId: 'eventbrite-widget-container-50631383832',

// Optional
iframeContainerHeight: 425,  _ Widget height in pixels. Defaults to a minimum of 425px if not provided
onOrderComplete: exampleCallback  _ Method called when an order has successfully completed
});
</script>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:00|[Présentation de FF4J, Proposition de Feature Toggle pour Java](#HProgrammedE9taillE9)|
|19:00 - 19:30|Buffet, boissons|
|19:30 - 20:30|[Implementer ses API au dessus de DB comme Apache Cassandra](#HProgrammedE9taillE9)|

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

## Présentation de FF4J, Proposition de Feature Toggle pour Java

Le "feature toggle", ou la capacité à activer ou désactiver une fonctionnalité à chaud, est souvent associée à une astuce de développement au service du Continuous Delivery. On peut pousser du code en production qui n'est pas complètement finalisé et introduire de la dette technique... mais il peut être tellement plus utile !!!!! Après un panorama de quelques cas d'usages très concrets, je vous propose de détailler les capacités du framework FF4J, les choix d'implémentation, les références en production, les killers features ainsi que les prochaines évolutions.

## Implementer ses API au dessus de DB comme Apache Cassandra

GraphQL, GRPC, REST, WebFlux, OData il existe une multitude de protocoles et formats pour implementer des API au dessus d'une base de donnees comme Cassandra. Chez DataStax nous avons eu l'occasion de toutes les implementer pour tester. Je vous propose un tour d'horizon des différentes solutions avec les pros, les cons et surtout beaucoup de code !

# À propos des intervenants

## Cédrick Lunven

<img style='float: right; margin: 1em; width: 120px' src='cedrick-lunven-120.jpg'/>

Cedrick est Developer Advocate chez DataStax. Cela lui permet de partager ses passions pour le développement logiciel et les architectures distribuées au travers de talks, blogposts et/ou application de références autour d'Apache Cassandra. Il y a 5 ans il propose le framework open source de feature Toggle ff4j dont il est toujours le principal commiteur.

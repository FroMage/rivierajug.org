---
layout: :theme/post
title: "Mardi 27 septembre 2022 @ Sophia-Antipolis :  soirée Elasticsearch"
tags: event
author: stephane
---

# Mardi 27 septembre 2022 @ Sophia-Antipolis :  soirée Elasticsearch

Le Riviera JUG organise une rencontre **gratuite** sur le thème d'Elasticsearch le mardi 27 septembre 2022 à partir de 18h dans les locaux de [Amadeus Sophia Antipolis](url:https://goo.gl/maps/agQMwmE74eWqqQvd8).

Cette soirée sera entièrement présentée par [Sylvain Wallez](https://twitter.com/bluxte), avec un premier talk sur les nouveautés d'Elasticsearch 8 et un deuxième sur le nouveau client Java pour icelui... qui est un vrai bijou d'ingénierie ingénieuse !!!

Ne manquez pas cette soirée !  :)

# Réservation

<div id="eventbrite-widget-container-421626394897"></div>

<script src="https://www.eventbrite.com/static/widgets/eb_widgets.js"></script>

<script type="text/javascript">
var exampleCallback = function() \{
console.log('Order complete!');
};

window.EBWidgets.createWidget(\{
// Required
widgetType: 'checkout',
eventId: '421626394897',
iframeContainerId: 'eventbrite-widget-container-421626394897',

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
|18:30 - 19:30|TODO|
|19:30 - 20:00|Buffet, boissons|
|20:00 - 21:00|TODO|

# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('amadeus.png')})](https://amadeus.com/fr)  | Salle|

# Pour venir

Amadeus, main site, Mistral auditorium
485 Rte du Pin Montard
06410 Biot

[Plan d’accès](https://goo.gl/maps/agQMwmE74eWqqQvd8)

<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2334.61087379998!2d7.057556422906037!3d43.62195443006717!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12cc2b7cba432085%3A0xcb5e30e756ebb5c5!2sAmadeus%20Main%20Site!5e0!3m2!1sen!2sfr!4v1648131547103!5m2!1sen!2sfr" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>

# Programme détaillé

## Elastic 8

La suite Elastic continue son évolution, avec une release toutes les 8 semaines !  On passera en revue les évolutions principales depuis la sortie de la version 8.0 en mars dernier.

## 400 endpoints d'API et 2000 types : genèse et utilisation du nouveau client Java pour Elasticsearch

Un nouveau client Java pour Elasticsearch est sorti en octobre 2021.  Plus léger, plus rapide, plus ergonomique et… généré à 99% !  Une session en deux parties, avec un REx sur le développement de cette nouvelle librairie, suivi d’une exploration de son usage en live coding.

L'API d'Elasticsearch a grandi de façon organique depuis 10 ans et compte près de 400 points d'API et 2000 structures de données.  Jusqu'à 2021 il n'y avait pas de spécification formelle complète de cette API.  Gênant pour générer du code…  On a rapidement vu que OpenAPI était difficilement applicable, et pris une approche originale, en modélisant l’API avec des types TypeScript “compilés” dans un modèle servant de base à la génération de code.

Comment ensuite, à l’usage, s’y retrouver dans cette API très riche ?  On verra avec quelques exemples que l’utilisation de _fluent functional builders_ et de _tagged unions_ (un peu de formalisme pour des choses simples) permet une écriture proche d’un DSL où on se laisse guider par l’autocomplétion de l’IDE sans jamais avoir à taper un nom de classe, dans des structures arborescentes et polymorphiques proposant parfois plus de 50 variantes.

# About the speaker

## [Sylvain Wallez](https://twitter.com/bluxte)

<img style='margin:1em; float:right' title='Sylvain Wallez' src='bluxte.png'/>

Développeur et architecte passionné depuis trois décennies, membre de la Fondation Apache. Je code sur les machines de toutes tailles, du micro-contrôleur aux clusters de gros serveurs.

Chez Elastic depuis 5 ans, d'abord dans l'équipe Cloud, et maintenant comme lead developer des librairies client Java et Rust.

---
layout: :theme/post
title: "Mardi 6 février 2018 @ Sophia-Antipolis : soirée Hazelcast"
tags: event
author: stephane
---

# Mardi 6 février 2018 @ Sophia-Antipolis : soirée Hazelcast

Le Riviera JUG organise une rencontre **gratuite** sur le thème de Hazelcast le mardi 6 février 2018 à partir de 18h dans les locaux d’[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

« Commandant, la base de donnée n’avance pas assez vite, comment va-t’on faire ? »

« Pas de souci : [envoyez plus de chiens](https://www.youtube.com/watch?v=zq0eFkptu2c) ! »

Ah, c’était le bon temps. De nos jours on aurait tendance à répondre « z’avez qu’a tout foutre en RAM » et se poser des questions _après_.

Justement, on va en parler de la base de données en RAM, et des questions à se poser, grâce à Neil Stevenson, qui va nous parler d’[Hazelcast](https://hazelcast.com/products/).

Ne manquez pas cette soirée :)

# Réservation

<div id="eventbrite-widget-container-42003882744"></div>

<script src="https://www.eventbrite.com/static/widgets/eb_widgets.js"></script>

<script type="text/javascript">
var exampleCallback = function() \{
console.log('Order complete!');
};

window.EBWidgets.createWidget(\{
// Required
widgetType: 'checkout',
eventId: '42003882744',
iframeContainerId: 'eventbrite-widget-container-42003882744',

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
|18:30 - 19:15|[Hazelcast - Data Grids and Analytics](#HProgrammedE9taillE9)|
|19:15 - 19:45|Buffet, boissons|
|19:45 - 20:30|[Hazelcast - Data Grids and Analytics](#HProgrammedE9taillE9)|

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

## Hazelcast - Data Grids and Analytics

In this talk we'll take a tour of Hazelcast, what is, what does and how it might be useful to you.

Few of us have the luxury of a greenfield project, so what we'll do here is look at how we can re-architect an existing system to make it faster, scalable and to add new features.

To do this, we'll take an example of an online shop using a relational database.

What we'll do to begin with is lift the content from disk to memory, simple stuff and performance improves. Then we'll add scaling and resiiience. Then we'll go for reactive processing, checking stock levels dynamically as orders come in. And finally we'll add some analytics, looking to see which customers are ordering what items and what sort of discounts we might wish to offer. Finally we'll see if there's a way to retire the relational database and move to a different long term store, following the event sourcing model. What we'll have by the end is a fast, scalable, resilient online shop, and have found a way to remove the relational store and the costs associated.

As an added bonus, we'll look at containers too, converting the project to Docker images and running a swarm. As you might expect, this brings some extra complications which are easily overcome, and now our system is suitable for control by a PAAS.

# À propos des intervenants

## Neil Stevenson

<img style='float: right; margin: 1em; width: 120px' src='neil-stevenson.jpg'/>

Neil is a solution architect for Hazelcast, the world's leading open source in-memory data grid.
In more than 25 years of work in IT, Neil has designed, developed and debugged a number of software systems for companies large and small.

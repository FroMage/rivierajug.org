---
layout: :theme/post
title: "Vendredi 11 mars 2011 @ Sophia-Antipolis : soirée files de messages"
tags: event
author: stephane
---

# Vendredi 11 mars 2011 @ Sophia-Antipolis : soirée files de messages

Le Riviera JUG organise une rencontre *gratuite* sur le thème des files de messages (message queues) le vendredi 11 mars 2011 dans les locaux de [l’INRIA Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

Bon, alors j´ai une application qui reçoit des requêtes plus vite qu´elle ne peut les consommer, et donc je dois les sauvegarder quelque part en attendant de pouvoir les traiter. Ah ben je sais je vais les mettre en base le temps de les traiter. Bon finalement on me donne un deuxième serveur et donc faut que je les synchronise pour que les deux ne piochent pas le même élément à traiter dans la base au même moment…

Pfff, et en plus maintenant il faut que je contacte un serveur distant pour lui envoyer des messages mais un seul à la fois et comme il plante souvent (c´est pas du Java) il faut réessayer jusqu´à 5 fois de suite mais à 3 minutes minimum d´intervalle (ils mettent de ces choses dans les specs plutôt que faire des implémentations qui marchent, je vous jure).

Là, je craque et j´appelle les mecs du Riviera JUG, qui me disent que ce que je cherche c´est un système de files de messages (_message queues_) qui gère tout ça, et que **justement** ça tombe bien, ils font une soirée sur ce thème le vendredi 11 mars. Parlez d´une veine.

On va donc avoir ce soir là deux speakers de JBoss/Red Hat qui vont venir nous parler de deux systèmes de files de messages: HornetQ et AMQP/Apache Qpid.

Reservez votre soirée, ça va être l´occasion de tout apprendre sur le sujet :)

# Réservation

_Réservations fermées_



# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil — café|
|18:30 - 19:30|[HornetQ, Messaging & Web](#HHornetQ2CMessaging26Web), _par [Jeff Mesnil](#HJeffMesnil)_|
|19:30 - 20:00|Pause — buffet|
|20:00 - 21:00|[AMQP](#HAMQP), _par [Arnaud Simon](#HArnaudSimon)_|
|21:00 - 21:30|Fin/Rencontres — buffet|

# Sponsors

|Sponsor|Rôles|
|---|---|
|[![alt text]({site.page('Sponsors/index.md').image('avisto-150.png')})](http://www.avisto.com) | Sponsor annuel|
|[![alt text]({site.page('Sponsors/index.md').image('wallstreet-150.png')})](http://www.wallstreetsystems.com) | Sponsor de la soirée|
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

## HornetQ, Messaging & Web

HornetQ est un service de messaging qui a ses racines dans le monde Java mais qui s'ouvre aussi aux environnements Web.

Cette présentation introduira HornetQ et les notions de bases du Messaging et de JMS. HornetQ fournit une API REST pour envoyer et recevoir des messages de n'importe quel plate-forme avec HTTP. HornetQ adopte aussi HTML5 en fournissant le support des Web Sockets pour envoyer et recevoir des messages depuis la dernière génération de navigateurs Web. La présentation utilisera comme demonstration une application Web de géolocalisation interactive avec une topologie pub/sub démontrant la cohérence de cet ensemble. Le Web et le Messaging forment une combinaison puissante et cette présentation l'illustrera.

## AMQP

AMQP (pour Advanced Message Queuing Protocol) est une spécification open source qui vise à standardiser l'échange de messages entre applications. Un consortium international est à l'origine d'AMQP. Celui-ci inclut entre autres Red Hat, Cisco Systems, iMatix, Microsoft, etc.

AMQP n'a pas pour vocation de remplacer JMS mais a été conçu avec comme objectif de supporter JMS. La spécification AMQP définit, de même que JMS, les sémantiques d'échange des messages mais aussi le protocole d'échange. Cela permet une réelle inter-opérabilité des implémentations d'AMQP. Ainsi, toutes les implémentations d'AMPQP peuvent interagir entre elles, quels que soient les langages utilisés. Par exemple, il est possible à des applications JMS d'échanger des messages avec des applications Python, .Net ou C++.
Dans cette présentation, nous introduirons la dernière version d'AMQP. Nous nous appliquerons à faire le lien entre les concepts spécifiques à AMQP et ceux bien connus de JMS. Nous mettrons aussi en avant les avantages d'AMQP sur JMS. Une attention particulière sera portée au projet Qpid — qui est l'implémentation d'AMQP hébergée par Apache — et plus particulièrement à sa librairie JMS.

# À propos des intervenants

## Jeff Mesnil

<img style='float: right' src='jeff-mesnil.jpg'/>

Jean-Frédéric "Jeff" Mesnil écrit des logiciels de middleware liés au messaging, aux transactions distribuées et à la réplication de base de données depuis une décennie. Récemment, il a travaillé sur HornetQ, l'implémentation de messaging de JBoss et Red Hat. Il écrit maintenant des logiciels de data mining pour un éditeur de sites Web, Bestofmedia.

Il a obtenu un Msc en Mathématiques Appliquées et Informatique de l'université de Cranfield (Royaume-Uni) et un diplôme d'ingénieur en Génie Mathématique de l'INSA de Rouen (France). Il vit en France et écrit un weblog à http://jmesnil.net/weblog/.

## Arnaud Simon

<img style='float: right' src='arnaud-simon.jpg'/>

Arnaud Simon is senior solution architect for Red Hat middleware division. Arnaud joined Red Hat as a principal software engineer working for Red Hat middleware division on strategic messaging AMQP and ESB products. Arnaud contributed to write the AMQP specifications and is an Apache contributor for the Qpid project. Prior to that, he was an ESB, SOA architect for Innovation Process Technology IPT, a European systems integrator based in Switzerland. Prior to this Arnaud was leading the JMS Message Service Team for Arjuna Technologies Limited, a UK based spin-off from Hewlett-Packard where he was a senior research and development engineer, with a primary focus on the design and continual development of this product. Arnaud obtained a PhD in Computing Science from INRIA, University Nancy I (France) in 2000 and completed research posts with a primary focus on distributed computing and data mining at both INRIA and Newcastle University.

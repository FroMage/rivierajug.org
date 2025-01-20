---
layout: :theme/post
title: "Mardi 13 mai 2014 @ Sophia-Antipolis : soirée Lambda, Sex and Sun"
tags: event
author: stephane
---

# Mardi 13 mai 2014 @ Sophia-Antipolis : soirée Lambda, Sex and Sun

Le Riviera JUG organise une rencontre **gratuite** sur le thème des lambdas de Java 8 le mardi 13 mai 2014 à partir de 18h dans les locaux d´[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

On vous avait promis un retour en force, eh bien voilà une soirée brutale, avec le seul homme au monde capable de présenter les optimisations de HotSpot (la JVM d’Oracle) en nous montrant quand et comment tels constructions Java finissent en assembleur, avec de vrais bouts d’ASM, le tout sous les yeux médusés de centaines de personnes.

Rémi Forax, c’est à la fois un Top Chef du code à lui tout seul, combiné avec le style inimitable de Maïté :)

Ne le manquez pas, vous ne croiserez pas tous les jours un gars comme lui qui puisse vous expliquer comment marche le JIT compilateur de HotSpot.

Cette fois-ci il viendra nous parler des lambdas dans Java 8, et je suis sûr que ça va déchirer !

Inscrivez-vous vite !

<div class='warning'>Attention nous avons ENCORE changé de salle pour ce coup-ci exceptionnellement nous allons retourner en salle Euler, celle que nous occupions ces dernières années, à gauche en entrant à Inria.</div>

# Réservation

<div style="width:100%; text-align:left;" ><iframe  src="https://www.eventbrite.com/tickets-external?eid=10815929737&ref=etckt" frameborder="0" height="214" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:10px; padding:5px 0 5px; margin:2px; width:100%; text-align:left;" ><a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com/r/etckt">Online event registration</a><span style="color:#ddd;"> for </span><a style="color:#ddd; text-decoration:none;" target="_blank" href="https://www.eventbrite.com/e/mardi-13-mai-2014-sophia-antipolis-soiree-lambda-sex-and-sun-tickets-10815929737?ref=etckt">Mardi 13 mai 2014 @ Sophia-Antipolis : soirée Lambda, Sex and Sun</a> <span style="color:#ddd;">powered by</span> <a style="color:#ddd; text-decoration:none;" target="_blank" href="http://www.eventbrite.com?ref=etckt">Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:30|[Lambda, Sex and Sun : Pourquoi les lambdas ?](#HLambda2CSexandSun), _par [Rémi Forax](#HRE9miForax)_|
|19:30 - 20:00|Pause buffet — discussions|
|20:00 - 21:30|[Lambda, Sex and Sun : Comment les lambdas !](#HLambda2CSexandSun), _par [Rémi Forax](#HRE9miForax)_|

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

## Lambda, Sex and Sun

Ce talk est en deux parties. Dans un premier temps, j’expliquerai pourquoi il y a des lambda en Java, à quoi elles servent, pourquoi la syntaxe est ce qu’elle est, et comment les utiliser avec l’API du JDK. Puis je détaillerai dans un second temps comment les lambdas sont traduites par le compilateur et compilées en code natif par le compilateur JIT.

Et pour ceux qui se demandent pourquoi il y a « Sex » dans le titre, le mieux est de venir voir :)

# À propos des intervenants

## Rémi Forax

<img style='float: right; margin: 1em' src='remi-forax.jpg'/>

Maître de Conférence à L'UPEM (Université Paris Est Marne-la-Vallée), je suis tombé dans Java quand j’étais tous petit, même si j'ai pas bien grandi depuis. Je suis expert pour les JSR 292 (invokedynamic) et JSR 335 (les lambdas).

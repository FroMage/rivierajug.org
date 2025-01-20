---
layout: :theme/post
title: "Mercredi 20 septembre 2017 @ Sophia-Antipolis : soirée Keycloak"
tags: event
author: stephane
---

# Mercredi 20 septembre 2017 @ Sophia-Antipolis : soirée Keycloak

Le Riviera JUG organise une rencontre **gratuite** sur le thème de Keycloak le mercredi 20 septembre 2017 à partir de 18h dans les locaux d’[Inria Sophia-Antipolis](http://maps.google.fr/maps?f=q&source=s_q&hl=en&geocode=&q=inria,+sophia-antipolis&sll=47.15984,2.988281&sspn=20.81297,46.757813&ie=UTF8&t=h&ll=43.616722,7.067868&spn=0.005406,0.011415&z=17&iwloc=A).

La sécurité, c’est simple, pourtant. Je ne vois vraiment pas pourquoi tout le monde s’agite. Depuis qu’on est passé au Rot-13 pour stocker les mots de passes sur notre site en HTTP (pas en HTTPS parce que sinon pour débugger sous tcpdump c’est trop compliqué), nous en tout cas on n’a plus de problème. Enfin, à part se souvenir des mots de passes du serveur, mais là encore on a une super astuce : on utilise le nom du serveur à l'envers, pour tous les utilisateurs, et pour tous les services. Vous n’imaginez pas le temps gagné !

Enfin, il paraît que Sébastien Blanc a des conseils différents à donner pour la gestion de l’authentification, avec Keycloak, mais bon, je vous laisserai juger par vous même si c’est mon approche la meilleure ou la sienne. Ah, je dois vous laisser, je dois encore réinstaller le serveur, on dirait qu’on s’est re-fait pirater, pfff, pourtant ça fait bien 23 minutes que ça n’était pas arrivé…

Ne manquez pas cette soirée :)

# Réservation

<div style="width:100%; text-align:left;"><iframe src="//eventbrite.com/tickets-external?eid=37799791193&ref=etckt" frameborder="0" height="275" width="100%" vspace="0" hspace="0" marginheight="5" marginwidth="5" scrolling="auto" allowtransparency="true"></iframe><div style="font-family:Helvetica, Arial; font-size:12px; padding:10px 0 5px; margin:2px; width:100%; text-align:left;" ><a class="powered-by-eb" style="color: #ADB0B6; text-decoration: none;" target="_blank" href="http://www.eventbrite.com/">Powered by Eventbrite</a></div></div>

# Programme

<div class='warning'>Ce programme est susceptible de changer selon des imprévus prévisibles.</div>

|Horaire|Description|
|---|---|
|18:00 - 18:30|Accueil|
|18:30 - 19:15|[Mettre en place sa gestion de l'identité avec Keycloak](#HProgrammedE9taillE9)|
|19:15 - 19:45|Buffet, boissons|
|19:45 - 20:30|[Livecoding](#HProgrammedE9taillE9)|

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

## Mettre en place sa gestion de l'identité avec Keycloak

Bien que la sécurité soit un aspect crucial pour toute application sa mise en oeuvre peut s’avérer laborieuse. Pire, elle sera souvent négligée, mal implémentée et intrusive dans le code. S'ajoute à cela la gestion de ses utilisateurs, le tout dans un environnement de plus en plus hétérogène tant au niveau technique que fonctionnel.

Mais depuis quelques temps, une nouvelle tendance se dégage : externaliser et déléguer tous les aspects d'authentification et de gestion d'identité à une entité tierce (Auth0, KeyCloak ...). Ces serveurs intègrent également les nouveaux protocoles et standards comme OpenID et JWT qui ont désormais atteint leur maturation. En 2017, mettre en place sa sécurité passera par la.

Dans cette session, je vous propose de faire le point sur comment faire de la sécurité de façon moderne. Apres un rappel de ce qu'est OpenID et JWT, on verra concrètement comment sécuriser une appli Java EE "classique", un microservice Node.js, une Web App Angular standalone ou bien encore une application SpringBoot.

# À propos des intervenants

## Sébastien Blanc

<img style='float: right; margin: 1em; width: 120px' src='sebastien-blanc.jpg'/>

Sébastien Blanc a 13 ans d’expérience. Il a passé prés de 7 ans au pays des Bataves à écumer les compagnie d'assurances et les banques à base de Struts et de Websphere. Revenu depuis sur la cote d'azur se faire dorer, Sébastien travaille actuellement pour Red Hat, il fait partie de l’équipe KeyCloak qui délivre un serveur Open Source d'authentification et de gestion d'identité. Il aime également évangéliser les nerds en donnant régulièrement des conférences (Devoxx, SpringOne, GR8Conf). Vous pouvez réagir a ses trolls sur @sebi2706.

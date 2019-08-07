# API : Application Programming Interface

API signifie Application Programming Interface. Le mot le plus important est “interface”, et c’est le mot le plus simple, car nous utilisons tous des interfaces au quotidien.

## Mais qu’est-ce qu’une interface ?
Sans aller directement dans la programmation, parlons un peu des interfaces en général. 
Un exemple commun d’une interface est une télécommande pour votre télévision. Cette interface vous donne une manière d’interagir avec votre télévision, sans avoir besoin de plonger dans les fils et circuits de votre TV.

Un autre exemple d’interface est un menu de restaurant. Le menu est votre manière d’interagir avec la cuisine. Les choix vous sont présentés sur le menu, et vous sélectionnez une option.


# Pourquoi utiliser REST ?

Il y a de multiples types d’API et c’est à vous de choisir celle qui s’adapte le mieux à vos besoins.

REST signifie “Representational State Transfer”.

Les API REST sont basées sur HTTP. 
C’est un protocole qui définit la communication entre les différentes parties du web. 

L’échange est basé sur des requêtes client et serveur. Un client lance une requête HTTP, et le serveur renvoie une réponse. Ce sont des méthodes qui définissent les requêtes que le client peut effectuer, dont GET, PUT, POST, DELETE et d'autres.

## Exemple:

Instagram !!

L’API d’Instagram permet à votre application d’accéder aux comptes utilisateurs, aux photos, aux tags et plus encore. Voici ci-dessous les différentes méthodes qui permettent d’interagir avec un compte utilisateur:


![alt text](https://image.noelshack.com/fichiers/2019/31/5/1564735265-instagram.png
 "Logo Title Text 1")

Comme vous pouvez le voir, votre application peut accéder aux photos et vidéos récentes, celles qu’il a particulièrement aimées, aux likes et commentaires etc... Vous pouvez ensuite afficher ces informations dans votre application ou les utiliser à des fins de stockage de données.

## Les Methodes:


### Lires

   Requête de type GET sur http://bibliotheque/livre/ID_DU_LIVRE_A_LIRE


### Ecrires
   Requête de type POST sur http://bibliotheque/livre/. Le corps du message POST représente le contenu du nouveau livre à créer. A la charge de la bibliothèque d’affecter un identifiant à notre nouveau livre.

### Modifiers:
   Requête de type PUT sur http://bibliotheque/livre/ID_DU_LIVRE. Le corps du message PUT représente le contenu modifié du livre d’identifiant ID_DU_LIVRE.


### Supprimer :
 Requête de type DELETE sur http://bibliotheque/livre/ID_DU_LIVRE.


# Ce qu'il faut savoir:

- REST n’impose ni ne revendique un format d’échange entre client et serveur.
Vous êtes libre de représenter vos données en HTML, XML, JSON ...

- Une ressource REST peut être cacheable ou non cacheable.

- REST : REpresentational State Transfer
Style d’architecture pour des applications appartenant à un système distribué (Internet).

- Ne dépend pas d’un langage particulier
Utilise (notamment) le protocole HTTP.

- REST est stateless.
   * La requête contient toutes les informations nécessaires.


# Bonne pratique par le groupe de Seb:

   J'ai utilisé un article que Romain avait partagé en sujet de veille afin de réaliser la mise ne forme de ma page HTML selon des critères bien spécifiques.

​

![enter image description here](https://image.noelshack.com/fichiers/2019/31/5/1564735106-recape2.png)

​

Le but de ces critères, est que chaque composant est autonome, de façon a ce que l'on n'utilise pas le css pour les placer. 

Mais en utilisant la bibliothèque bootstrap qui le fait pour nous.

​

Exemple : 

​

    <body  class="container-fluid d-flex flex-column justify-content-between py-3">

​

`.container-fluid`

Définit un cadre de : `width: 100%`

​

`.d-flex` et `flex-column` 

Rend les éléments flexible et aligner en colonne verticalement.

​

`.justify-content-between` 

Définit la façon dont le navigateur distribue l’espace entre les objets flexibles. 

​

`.between` 

Dispose le premier objet au début de l’axe et le dernier à la fin de l’axe.

​

Résultat :

![resultat](https://image.noelshack.com/fichiers/2019/31/5/1564736929-recap3.png)

et sans les class :

![resultat sans](https://image.noelshack.com/fichiers/2019/31/5/1564736990-sansrecape.png)


# Bonne pratique par le groupe de Furkan:
Liste des bonnes pratiques lors de notre sprint 0
:
- Analyse des besoins du client via les vidéos et les captures d’écrans que le client nous à 
fournis
ainsi que les questions que nous leur avions posés.
On a listé toutes les fonctionnalités existante de l’application afin de les transcrire pour les 
schématiser sur MCD avec les informations que nous disposons.

- Une répartition des taches entre la préparations des maquettes et la conceptualisation du MCD et la
définition des routes utilisateurs.








# Ezycom

Cette application web a été réalisée pour Ezyperf par des étudiants de la Wild Code School de Reims (2019-2020).

Elle permet à ses utilisateurs de gérer les commissions de leurs équipes commerciales.
Les commerciaux : Peuvent visualiser leurs ventes/commissions
Les responsables : Peuvent créer des plan de rémunération, des comptes commerciaux, entrer les ventes de chaque commercial et visualiser toutes les ventes.

## Installation

**Les logiciels à installer pour utiliser le projet :**
* JavaSpring
* Maven
* Mysql

**Création de la base de données**
-   Créer une base de données et un utilisateur avec les privilèges

Via MySql en ligne de commande :

```
CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'newuser'@'localhost';

```

Ou via un gestionnaire de bases de données (Workbench).

-   Créer un fichier application.properties avec les informations de la base, en suivant application.properties.example.

## Lancement du projet

Via le terminal de commandes :

```
mvn spring-boot:run

```

Ou via votre IDE si celui-ci le permet (VS par exemple).

Le projet sera disponible sur votre navigateur à l'adresse  **[http://localhost:8080/](http://localhost:8080/)**

## [](https://github.com/WildCodeSchool/reims-1018-java-ezyperf#tests)Tests

Pour lancer les tests :

```
mvn test
```
## Auteurs

-   **Bryan Nuninger**  -  _Développeur_ ([[https://github.com/BryanNun](https://github.com/BryanNun)])
-   **Nicolas Huraux**  -  _Développeur_  - ([[https://github.com/NicolasHuraux](https://github.com/NicolasHuraux)])
-   **Carole Chevalier**  -  _Développeuse_  - ([[https://github.com/cakocako](https://github.com/cakocako)])
-   **Stéphane Thomin**  -  _Développeur_  - ([[https://github.com/StephaneThomin](https://github.com/StephaneThomin)])
-  **Anthony Lefevre**  -  _Développeur_  - ([https://github.com/lefevreanthony](https://github.com/lefevreanthony)])

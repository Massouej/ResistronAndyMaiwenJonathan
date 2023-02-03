# Résistron

<a href="https://zupimages.net/viewer.php?id=23/05/7wa5.jpg"><img src="https://zupimages.net/up/23/05/7wa5.jpg" alt="" /></a>

## Description

Résistron est une application qui permet de calculer la valeur et la tolérance d'une résistance en fonction des anneaux de couleur qu'elle présente.

## Exigences

L'application devra permettre de choisir la couleur des 4 anneaux d'une résistance de manière indépendante.
L'application devra être utilisable par les personnes daltoniennes.
L'application devra calculer la nouvelle valeur de résistance à chaque changement de couleur d'un des 4 anneaux.
Les champs qui affichent la valeur et la tolérance de la résistance ne doivent pas pouvoir être édités par l'utilisateur.
La tolérance devra être affichée en pourcentage.
L'application devra afficher la valeur de la résistance en ohms ou en multiple de ohms.
L'affichage de la valeur et de la tolérance devra se faire sur la droite de l'application.

## Utilisation

L'utilisateur choisit à l'aide des boutons de couleur correspondant aux anneaux de sa résistance, les couleurs dont il a besoin. Il est affiché sur les différents boutons de couleur le nom de la couleur correspondante afin qu'un utilisateur daltonien puisse aussi l'utiliser. Les valeurs choisies sont rappelées à l'utilisateur par la coloration automatique des anneaux de la résistance affichée sur l'application. Elles sont aussi rappelées en toutes lettres à l'intention des utilisateurs daltoniens.  On peut aussi voir la valeur correspondant à la couleur de l''anneau s'afficher. L'application calcule à partir de ses choix la valeur de sa résistance et sa tolérance. Cette valeur est affichée au préalable en ohms puis elle est convertie dans l'unité de mesure correspondante afin qu'elle soit le plus facile possible à lire. Tout changement de choix de couleur modifiera les valeurs affichées.

## Explications

Les différentes fonctions :

- onButton1ring1Action
- onButton2ring1Action
- onButton3ring1Action
- onButton4ring1Action
- onButton5ring1Action
- onButton6ring1Action
- onButton7ring1Action
- onButton8ring1Action
- onButton9ring1Action
- onButton10ring1Action

Ces 10 fonctions permettent de répercuter l'action quand l'utilisateur clique sur le bouton de la couleur voulue pour l'anneau 1.

- onButton1ring2Action
- onButton2ring2Action
- onButton3ring2Action
- onButton4ring2Action
- onButton5ring2Action
- onButton6ring2Action
- onButton7ring2Action
- onButton8ring2Action
- onButton9ring2Action
- onButton10ring2Action

Ces 10 fonctions permettent de répercuter l'action quand l'utilisateur clique sur le bouton de la couleur voulue pour l'anneau 2.

- onButton1ring3Action
- onButton2ring3Action
- onButton3ring3Action
- onButton4ring3Action
- onButton5ring3Action
- onButton6ring3Action
- onButton7ring3Action
- onButton8ring3Action
- onButton9ring3Action
- onButton10ring3Action
- onButton11ring3Action
- onButton12ring3Action

Ces 12 fonctions permettent de répercuter l'action quand l'utilisateur clique sur le bouton de la couleur voulue pour l'anneau 3.

- onButton1ring4Action
- onButton2ring4Action
- onButton3ring4Action
- onButton4ring4Action
- onButton5ring4Action
- onButton6ring4Action
- onButton7ring4Action
- onButton8ring4Action

Ces 8 fonctions permettent de répercuter l'action quand l'utilisateur clique sur le bouton de la couleur voulue pour l'anneau 4.

<a href="https://zupimages.net/viewer.php?id=23/05/e35m.jpg"><img src="https://zupimages.net/up/23/05/e35m.jpg" alt="" /></a>

Ces fonctions affichent des valeurs définies selon ladite fonction aux éléments précisés dans cette dernière. Elle permet la coloration de l'anneau associé, l'affichage de la couleur dans un tableau pour un rétrocontrôle et celui de sa valeur.
- fnres

Cette fonction permet d'assigner les valeurs récupérées préalablement pour la fonction CalculResi.

- CalculResi

Cette fonction réunit les deux fonctions de calcul pour le calcul de la valeur de la résistance et sa conversion.

<a href="https://zupimages.net/viewer.php?id=23/05/xmhj.jpg"><img src="https://zupimages.net/up/23/05/xmhj.jpg" alt="" /></a>

1. CalculResult

Cette fonction permet de calculer la valeur de la résistance. ((Valeur de l'anneau 1  X 10+ Valeur de l'anneau 2) X Valeur de l'anneau 3).

<a href="https://zupimages.net/viewer.php?id=23/05/dpv0.jpg"><img src="https://zupimages.net/up/23/05/dpv0.jpg" alt="" /></a>

2. convertResult(double resistance)

Cette fonction permet d'effectuer la conversion du résultat de CalculResult si besoin.

> Written with [StackEdit](https://stackedit.io/).

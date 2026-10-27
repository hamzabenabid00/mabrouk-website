Feature: Verif le produit dans le panier 
Scenario: ajout dans le panier
Given utlisateur est dans la page  produit CHEMISE À COL CLASSIQUE ET COUPE AMPLE
When lutilisateur est cliquer sur le couleur "ciell" et clique sur la taille "S" et cliquer sur ajout au panier
Then utlisateur est dirige vers la page panier et verifier lajout de produit "CHEMISE À COL CLASSIQUE ET COUPE AMPLE"


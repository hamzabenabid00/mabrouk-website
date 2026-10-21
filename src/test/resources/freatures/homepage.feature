Feature: verification  des menu de la page dacceuil 
Scenario: acceder le menu 
Given  lutilisateur est a la page dacceuil 
When  utilisatuer survole sur le menu "Femme"  et clique sur le submenu "Chemises & Blouses"
Then  utlisateur est dirige vers la page "Chemises & Blouses"

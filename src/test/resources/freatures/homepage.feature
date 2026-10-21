Feature: verification  des menu de la page dacceuil 
Scenario: acceder le menu 
Given  lutilisateur est a la page dacceuil 
When  utilisatuer survole sur le menu "femme"  et clique sur le submenu "chemis & blouses"
Then  utlisateur est dirige vers la page "chemis & blouses"

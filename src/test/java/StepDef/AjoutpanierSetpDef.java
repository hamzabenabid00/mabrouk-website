package StepDef;

import org.openqa.selenium.firefox.FirefoxDriver;

import Helper.Config;
import Helper.Utlis;
import Page.AjoutPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutpanierSetpDef {
	@Given("utlisateur est dans la page  produit CHEMISE À COL CLASSIQUE ET COUPE AMPLE")
	public void utlisateur_est_dans_la_page_produit_chemise_à_col_classique_et_coupe_ample() throws Exception {
		Config.driver = new FirefoxDriver();
		Config.maxwin();
		Config.driver.get(Utlis.getProperty("ajoutpanier"));
	}
	@When("lutilisateur est cliquer sur le couleur {string} et clique sur la taille {string} et cliquer sur ajout au panier")
	public void lutilisateur_est_cliquer_sur_le_couleur_et_clique_sur_la_taille_et_cliquer_sur_ajout_au_panier(String ccouleur, String ttaille) {
		//AjoutPanier  panier = new AjoutPanier();
		
	}
	@Then("utlisateur est dirige vers la page panier et verifier lajout de produit {string}")
	public void utlisateur_est_dirige_vers_la_page_panier_et_verifier_lajout_de_produit(String ttext) {
	    
	}
}

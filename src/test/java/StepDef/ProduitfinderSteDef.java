package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utlis;
import Page.Produitfinder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProduitfinderSteDef {
	@Given("utilisateur el sur la page chemis & blouses")
	public void utilisateur_el_sur_la_page_chemis_blouses() throws Exception {
		Config.driver = new ChromeDriver();
		Config.maxwin();
		Config.driver.get(Utlis.getProperty("produithome"));
	   
	}
	@When("lutilisateur est cliquer sur le prduit {string}")
	public void lutilisateur_est_cliquer_sur_le_prduit(String produit) {
		Produitfinder  produits = new Produitfinder();
		produits.findproduct(produit);
	
	    
	}
	@Then("utlisateur est dirige vers la page  produit {string}")
	public void utlisateur_est_dirige_vers_la_page_produit(String string) {
		Produitfinder  produits = new Produitfinder();
		produits.verification(string);
		Config.driver.quit();
	 
	}

}

package StepDef;

import org.openqa.selenium.firefox.FirefoxDriver;

import Helper.Config;
import Helper.Utlis;
import Page.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepDef {
	@Given("lutilisateur est a la page dacceuil")
	public void lutilisateur_est_a_la_page_dacceuil() throws Exception {
		Config.driver = new FirefoxDriver();
		Config.maxwin();
		Config.driver.get(Utlis.getProperty("homepage"));
	}
	@When("utilisatuer survole sur le menu {string}  et clique sur le submenu {string}")
	public void utilisatuer_survole_sur_le_menu_et_clique_sur_le_submenu(String menu, String submenu) {
	   Homepage page =new Homepage();
	   page.verifmenu(menu, submenu);
	}
	@Then("utlisateur est dirige vers la page {string}")
	public void utlisateur_est_dirige_vers_la_page(String titre) {
		Homepage page =new Homepage();
		   page.verification(titre);
		   Config.driver.quit();
	    
	}
}

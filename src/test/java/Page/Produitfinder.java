package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Produitfinder {
	@FindBy(xpath="/html/body/div[5]/div[3]/div[4]/main/div/div[4]/div/ul/li[2]/div/div[2]/div[4]/div[1]/h6/a")
	WebElement produit;
	@FindBy(xpath="/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/h1")
	WebElement lientext;
	public Produitfinder() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void findproduct(String nomproduit) {
		Config.attent(5);
		if (produit.getText().contains(nomproduit)) {
			produit.click();
		}
		
	}
	public void verification(String titre) {
		Assert.assertEquals(lientext.getText(), titre);
	}
	
}

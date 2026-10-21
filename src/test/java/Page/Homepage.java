package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Homepage {
	@FindBy(xpath="/html/body/div[5]/header/div/div/div[2]/nav/div/div[2]/div[1]/ul/li")
	List<WebElement> menus ;
	@FindBy (xpath="/html/body/div[5]/header/div/div/div[2]/nav/div/div[2]/div[1]/ul/li[2]/div/ul/li")
	List<WebElement> submenus ;
	@FindBy(xpath="/html/body/div[5]/div[3]/div[2]/div[2]/div/h1")
	WebElement textverif ;
	
	public Homepage() {
		PageFactory.initElements(Config.driver, this);
		}
	
	public void verifmenu(String menutitle , String submenutitle) {
		Config.attent(5);
		Actions action = new Actions(Config.driver);
		try {
			for(WebElement menu:menus) {
				if (menu.getText().contains(menutitle)) {
					action.moveToElement(menu).perform();
					for(WebElement submenu:submenus) {
						if (submenu.getText().contains(submenutitle)) {
							submenu.click();
						}
						
					}
						
				}
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void verification(String titre) {
		Assert.assertEquals(textverif.getText(), titre);
	}
	
	
	
	
}

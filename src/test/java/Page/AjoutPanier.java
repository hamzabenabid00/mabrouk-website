package Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutPanier {

    @FindBy(xpath = "/html/body/div[5]/div[4]/div[2]/div/div/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/span")
    List<WebElement> couleurs;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[4]/div[2]/a")
    WebElement ajoutbtn;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div[2]/div/div/div/div/div[2]/div/div/div/form/div/div[1]/div[3]/span/ul/li/div")
    List<WebElement> tailles;
    @FindBy(xpath="/html/body/div[4]/div[3]/div[4]/div/div/main/article/div/div/div/div/div/div/div[1]/div/div/div[1]/div/form/div[1]/div/div[2]/div[1]/div/a")
    WebElement veriftext ;
    
    public AjoutPanier() {
		PageFactory.initElements(Config.driver, this);
    	
    }
  
    

  
    }

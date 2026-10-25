package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AjoutPanier {

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[1]/div[3]/span/ul/li[1]/div/span")
    WebElement couleur;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[4]/div[2]/a")
    WebElement btn;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[1]/div[3]/span/ul/li")
    List<WebElement> tailles;

    WebDriverWait wait;

    public AjoutPanier() {
        PageFactory.initElements(Config.driver, this);
        wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));
    }

    public void choisirproduit(String t) {

        WebDriverWait wait = new WebDriverWait(
            Config.driver, Duration.ofSeconds(15)
        );

        
        wait.until(ExpectedConditions.elementToBeClickable(couleur));
        couleur.click();

        
    } 
}
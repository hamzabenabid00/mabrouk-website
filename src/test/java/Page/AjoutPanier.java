package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutPanier {

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[1]/div[2]/div[3]/span")
    List<WebElement> couleurs;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[4]/div[2]/a")
    WebElement ajoutbtn;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[1]/div[3]/span/ul/li/div/span")
    List<WebElement> tailles;
    @FindBy(xpath="/html/body/div[4]/div[3]/div[4]/div/div/main/article/div/div/div/div/div/div/div[1]/div/div/div[1]/div/form/div[1]/div/div[2]/div[1]/div/a")
    WebElement veriftext ;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[4]/div[2]/a[2]")
    WebElement  view_cart_btn;
    
    public AjoutPanier() {
		PageFactory.initElements(Config.driver, this);
    	
    }
    public void select_color_and_size(String product_color, String product_size) throws Exception {
        try {
            for(WebElement color:couleurs) {
                if(product_color.equalsIgnoreCase(color.getDomAttribute("data-option"))) {
                    color.click();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            for(WebElement size:tailles) {
                if(size.getText().contains(product_size)) {
                    size.click();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        Config.attent(10);

        ajoutbtn.click();
    }

    public void open_cart() {
        Config.attent(3);
        view_cart_btn.click();
    }
  public void verifcation(String text) {
      Assert.assertTrue(veriftext.getText().contains(text));
  }
    

  
    }

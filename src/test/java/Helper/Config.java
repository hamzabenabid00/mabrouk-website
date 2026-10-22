package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	public static WebDriver driver ;

	public static void maxwin() {
		driver.manage().window().maximize();
	}


	public static void attendreElementCliquable(WebElement element, int s) {
	    WebDriverWait wait = new WebDriverWait(
	        driver, Duration.ofSeconds(s)
	    );

	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}

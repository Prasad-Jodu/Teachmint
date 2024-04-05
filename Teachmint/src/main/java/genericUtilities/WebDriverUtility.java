package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

public void implicitWait(WebDriver driver,int duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
public void waitUntilElementToBeClickable(WebDriver driver,int duration,WebElement element) {
    	
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
    	 wait.until(ExpectedConditions.elementToBeClickable(element));
     }

 public void moveToElementAndClick(WebDriver driver,WebElement element)  {
	   Actions act=new Actions(driver);
	   act.moveToElement(element);
	   act.click().perform();
	   act.click().perform();
   }
public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+");", element);
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
	}

}

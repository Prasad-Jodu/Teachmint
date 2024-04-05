package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
@FindBy(xpath = "//span[text()='Owner']")
private WebElement owntext;

public  AccountPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getOwntext() {
	return owntext;
}


}

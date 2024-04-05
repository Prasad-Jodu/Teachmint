package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	@FindBy(xpath = "//a[@class='QuickActions_quickActionsIcon__3Isni' and @href='/institute/dashboard/certificate-templates/student/']")
	private WebElement generateCetificateBtn;
	
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getGenerateCetificateBtn() {
		return generateCetificateBtn;
	}

	public void clickOnGenerateCertificate(WebDriver driver) {
		WebElement ele = driver.findElement(By.xpath("//a[@class='QuickActions_quickActionsIcon__3Isni' and @href='/institute/dashboard/certificate-templates/student/']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele);
		act.click().perform();
		act.click().perform();
	}
}

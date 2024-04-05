package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateSchoolLeavingCertificatePage {

	@FindBy(xpath = "//div[text()='Generate']")
	private WebElement generateLeavingertificate;
	
	

	

	

	public GenerateSchoolLeavingCertificatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getGenerateLeavingertificate() {
		return generateLeavingertificate;
	}
}

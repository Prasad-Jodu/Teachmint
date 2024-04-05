package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatePreviewPage {

	@FindBy(xpath = "//div[text()='Generate']")
	private WebElement generateBtn;
	
	public CertificatePreviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getGenerateBtn() {
		return generateBtn;
	}

	

	
	
}

package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatesAndDocumentsPage {
@FindBy(xpath = "//div[@class='Cards_cardDetails__WsZ-E']/h6[text()='School leaving certificate']")
private WebElement schoolLeavingCertificate;

public CertificatesAndDocumentsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getSchoolLeavingCertificate() {
	return schoolLeavingCertificate;
}
}

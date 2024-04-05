package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.PropertiesUtility;
import genericUtilities.WebDriverUtility;

public class LoginPage extends WebDriverUtility {
@FindBy(id= "user-input")
private WebElement mobileNumber;

@FindBy(id = "send-otp-btn-id")
private WebElement nextBtn;

@FindBy(xpath = "//input[@class='otp-digit-input']")
private WebElement enterOtp;

@FindBy(id = "submit-otp-btn-id")
private WebElement sendOtpBtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(WebElement mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public WebElement getNextBtn() {
	return nextBtn;
}

public void setNextBtn(WebElement nextBtn) {
	this.nextBtn = nextBtn;
}

public WebElement getEnterOtp() {
	return enterOtp;
}

public void setEnterOtp(WebElement enterOtp) {
	this.enterOtp = enterOtp;
}

public WebElement getSendOtpBtn() {
	return sendOtpBtn;
}

public void setSendOtpBtn(WebElement sendOtpBtn) {
	this.sendOtpBtn = sendOtpBtn;
}

	public void loginToApp(PropertiesUtility pUtil) throws Throwable {
		mobileNumber.sendKeys(pUtil.getPropertyKeyValue("mobileNumber"));
		Thread.sleep(3000);
		nextBtn.click();
		Thread.sleep(3000);
		enterOtp.sendKeys(pUtil.getPropertyKeyValue("otp"));
		Thread.sleep(3000);
		sendOtpBtn.click();
		
		
		
	}
}



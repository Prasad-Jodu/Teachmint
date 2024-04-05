package genericUtilities;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.LoginPage;

public class BaseClass {

	public WebDriverUtility wUtil=new WebDriverUtility();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	public WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void configBC() throws Throwable {
		String BROWSER = pUtil.getPropertyKeyValue("browser");
		if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("chrome")) {

			driver=new ChromeDriver();
		} else {
			System.out.println("Invalid browser");
		}
        // sdriver=driver;
		wUtil.maximizeWindow(driver);
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void configBM() throws Throwable {
//		LoginPage lp=new LoginPage(driver);
//		lp.loginToApp(pUtil);
		String URL = pUtil.getPropertyKeyValue("url");
		String MOBILENUMBER = pUtil.getPropertyKeyValue("mobileNumber");
		String OTP = pUtil.getPropertyKeyValue("otp");
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.id("user-input")).sendKeys(MOBILENUMBER);
		driver.findElement(By.id("send-otp-btn-id")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='otp-digit-input']")).sendKeys(OTP);
		Thread.sleep(2000);
     	driver.findElement(By.id("submit-otp-btn-id")).click();
		System.out.println("--login Successfully--");
	}

	@AfterMethod(alwaysRun = true)
	public void configAM() {
		
		//System.out.println("--Logout successfully--");
	}
	
	@AfterClass(alwaysRun = true)
	public void condigAC() {
//		driver.quit();
//		System.out.println("---browser closed--");
	}
}

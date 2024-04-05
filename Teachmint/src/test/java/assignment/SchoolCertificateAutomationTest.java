package assignment;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.WebDriverUtility;
import objectRepository.AccountPage;
import objectRepository.CertificatePreviewPage;
import objectRepository.CertificatesAndDocumentsPage;
import objectRepository.DashBoardPage;
import objectRepository.DetailsPage;
import objectRepository.GenerateSchoolLeavingCertificatePage;
import objectRepository.VerificationPage;

public class SchoolCertificateAutomationTest extends BaseClass{
	
	@Test
	public void schoolCertificateAutomationTest() throws Throwable {
		AccountPage ap=new AccountPage(driver);
		Thread.sleep(4000);
		ap.getOwntext().click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[@class='QuickActions_quickActionsIcon__3Isni' and @href='/institute/dashboard/certificate-templates/student/']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele);
		act.click().perform();
		act.click().perform();

		CertificatesAndDocumentsPage cad=new CertificatesAndDocumentsPage(driver);
		cad.getSchoolLeavingCertificate().click();
		driver.findElement(By.xpath("//div[text()='Generate']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("Sams");
		Thread.sleep(4000);
		WebElement generate = driver.findElement(By.xpath("//div[text()='Generate']"));
		act.moveToElement(generate).click().perform();
		driver.findElement(By.id("download")).click();
		driver.navigate().back();
		WebElement sam = driver.findElement(By.xpath("(//p[text()='Sam'])[1]"));
		int y=sam.getLocation().getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+");", sam);
		String actText=sam.getText();
		System.out.println(actText);
		String exptText="Sam";
		Assert.assertEquals(actText, exptText);
	}
	
}

package practiceOnNeo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import baseStudy.NewBase;
import commonMethod.UtilityStudy;
@Listeners(listener.Listener.class)
public class TestForNeostox 
{	
	WebDriver driver;
	loginPage log;
	PasswordPage passwo;
	handelPopUp popUp;
	ValidatingUserandbalance Un;
	@BeforeClass
	public void launchingBrowser() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		Reporter.log("launching the browser", true);
		Reporter.log("Launching the browser",true);
		log=new loginPage(driver);
		passwo=new PasswordPage(driver);
		popUp=new handelPopUp(driver);
		Un=new ValidatingUserandbalance(driver);
	}
	@BeforeMethod
	public void loginpage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		UtilityStudy.wait(driver, 1000);
		log.loginOnPage(driver, UtilityStudy.readDataFromPropertiyfile("MobileNum"));
		UtilityStudy.wait(driver, 500);
		passwo.enterpass(driver, UtilityStudy.readDataFromPropertiyfile("password"));
		Thread.sleep(3000);
		passwo.enterSubmit(driver);
		Thread.sleep(4000);
		popUp.PopUpHandel(driver);
	}
	@Test
  public void ValidatingUN() throws  IOException
	{
		Assert.assertEquals(Un.validatingUN(driver), UtilityStudy.readDataFromPropertiyfile("UserName"));
		Reporter.log("UserName are valid TC is passed", true);
		
	}
	@Test
	public void checkingbal()
	{
		Assert.assertNotNull(Un.checkingbalance(),"Balance is null");
		Reporter.log("Checking account balance",true);
	}
	@AfterMethod
	public void logOut()
	{
		
		Un.logginOut(driver);
		Reporter.log("logging out",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		UtilityStudy.wait(driver, 3000);
		driver.close();
	}
}

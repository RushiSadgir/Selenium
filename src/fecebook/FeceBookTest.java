package fecebook;

import java.io.IOException;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonMethod.UtilityStudy;
@Listeners(listener.Listener.class)
public class FeceBookTest extends BrowserLaunch 
{
	loginePage login;
	FBHomePage home;
	LogOutPage out;
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		launchTheBrowser();
		login=new loginePage(driver);
		home=new FBHomePage(driver);
		out=new LogOutPage(driver);	
	}
	@BeforeMethod
	public void loginOnFb() throws IOException, InterruptedException
	{
		
		login.enterUserName(UtilityStudy.readDataFromPropertiyfile("MobileNum"));
		Thread.sleep(1000);
		login.enterpassword(UtilityStudy.readDataFromPropertiyfile("FBpassword"));
		UtilityStudy.wait(driver, 1000);
		login.clickOnLoginButton();
	}
  @Test
  public void ValidatingUserName() throws IOException
  {
	  String actualName = home.getactualName();
	  Assert.assertEquals(actualName, UtilityStudy.readDataFromPropertiyfile("ExUn"));
	  Reporter.log("Validating actal and Ex userName",true);
  }
  @AfterMethod
  public void loggingOut() throws InterruptedException
  {
	  Thread.sleep(3000);
	  out.clickOnLogOut(driver);
	  Reporter.log("Logging out in the fb", true);
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.close();
	  Reporter.log("Closing The browser",true);
  }
  
}

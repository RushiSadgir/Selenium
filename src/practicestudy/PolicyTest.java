package practicestudy;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethod.UtilityStudy;

public class PolicyTest extends LaunchBrowser
{
	HomePage Home;
	ClaimAssistent claim;
	Plans pl;
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		
		launchTheBrowser();
		Reporter.log("Launching The Browser", true);
		Home=new HomePage(driver);
		claim=new ClaimAssistent(driver);
		 pl=new Plans(driver);
		
	}
	@BeforeMethod
	public void enterDetails() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Home.lifeinsurance();
		Reporter.log("Click On Life Insurance", true);
		UtilityStudy.wait(driver, 2000);
		claim.enterDetails(driver, UtilityStudy.exelReading(0, 0), UtilityStudy.exelReading(0, 1));
		Reporter.log("Entering Name and Dob", true);
		UtilityStudy.wait(driver, 2000);
		claim.enterMoNo(driver, UtilityStudy.exelReading(0, 2));
		Thread.sleep(5000);
		pl.clickOnPopUp(driver);
		
		
	}
  @Test
  public void f()
  {
  }
}

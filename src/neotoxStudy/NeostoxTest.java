package neotoxStudy;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseStudy.Base;
import commonMethod.UtilityStudy;

public class NeostoxTest extends Base
{
	NeostoxHome home;
	NeostoxUserName username;
	PopUpHandels pop;
	@BeforeClass
	public void launchingbrouser() throws InterruptedException
	{
		launchingbrowser();
		home=new NeostoxHome();
		username=new NeostoxUserName(driver);
		pop=new PopUpHandels(driver);
	}
	@BeforeMethod
	public void loginonNeostox() throws EncryptedDocumentException, IOException
	{
		home.entermobile(driver, UtilityStudy.exelReading(0, 0));
		Reporter.log("Entering mobile no",true);
		UtilityStudy.wait(driver, 2000);
		home.enterpass(driver, UtilityStudy.exelReading(0, 1));
		Reporter.log("Entering password", true);
		UtilityStudy.wait(driver, 2000);
		pop.handePOPup(driver);
	}
  @Test
  public void f() {
  }
}

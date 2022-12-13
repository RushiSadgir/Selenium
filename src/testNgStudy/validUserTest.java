package testNgStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import PomStudyOnN.PopUpHandel;
import PomStudyOnN.enterPasword;
import PomStudyOnN.logOut;
import PomStudyOnN.login;
import PomStudyOnN.validateusername;
import commonMethod.UtilityStudy;
import neotoxStudy.PopUpHandels;

public class validUserTest 
{
	Sheet mysheet;
	WebDriver driver;
	login l;
	enterPasword pass;
	validateusername valid;
	logOut out;
	PopUpHandels pop;
	
	@BeforeClass
	public void openthebrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		File myfile=new File("C:\\Selenium\\rushi.xlsx");
		mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		l=new login(driver);
		pass=new enterPasword(driver);
		valid=new validateusername(driver);
		out=new logOut(driver);
		pop=new PopUpHandels(driver);
		Reporter.log("launching browser", true);
	}
	@BeforeMethod
	public void loginthepage() throws InterruptedException
	{
		l.entermobilenp(mysheet.getRow(0).getCell(0).getStringCellValue());
		l.clickonsignIn();
		
		UtilityStudy.wait(driver, 2000);
		pass.enterpass(mysheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		pass.clickonsub();
		UtilityStudy.wait(driver, 5000);
		pop.handePOPup(driver);
			
	}
  @Test
  public void validateusername() throws IOException
  {
	  valid.validateuser(driver, mysheet.getRow(0).getCell(2).getStringCellValue());
  }
  @AfterMethod
  public void loggingout() throws InterruptedException
  {
	
	  
  }
}

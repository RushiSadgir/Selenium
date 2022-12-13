package PomStudyOnN;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethod.UtilityStudy;

public class testClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		File myfile=new File("C:\\Selenium\\rushi.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		login lo=new login(driver);
		lo.entermobilenp(mysheet.getRow(0).getCell(0).getStringCellValue());
		lo.clickonsignIn();
		UtilityStudy.wait(driver, 4000);
		enterPasword pass=new enterPasword(driver);
		UtilityStudy.wait(driver, 1000);
		pass.enterpass(mysheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(3000);
		pass.clickonsub();
		UtilityStudy.wait(driver, 3000);
		PopUpHandel pop=new PopUpHandel(driver);
		pop.handelpopup(driver);
		UtilityStudy.wait(driver, 1000);
		validateusername valid=new validateusername(driver);
		String expUserName = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		valid.validateuser(driver, expUserName);
		System.out.println(expUserName);
		Thread.sleep(2000);
		logOut out=new logOut(driver);

		out.clicklogout();
		

	}

}

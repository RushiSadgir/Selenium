package pomStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		logingpage login= new logingpage(driver);
		File myfile=new File("C:\\Selenium\\rushi.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		Thread.sleep(3000);
		login.enterUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
		
		login.enterPass(mysheet.getRow(0).getCell(1).getStringCellValue());
		
		login.clickonlogin();
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

}

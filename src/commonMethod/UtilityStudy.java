package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityStudy {
	public static void screenshot(WebDriver driver, String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File trget= new File("C:\\Users\\hp\\Pictures\\Saved Pictures"+name+".png");
		FileHandler.copy(src, trget);
		Reporter.log("Taking Screenshot", true);
	}
	
	public static void wait(WebDriver driver, int a)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(a));
		
	}
	public static void  scrollinto(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Scroll into view", true);
	}
	public static String exelReading(int row,int cell) throws EncryptedDocumentException, IOException
	{
		
		File myfile=new File("C:\\Selenium\\rushi.xlsx");
		 String value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
		 Reporter.log("Exel reading ", true);
		 return value;
		
	}
	public static String readDataFromPropertiyfile(String key) throws IOException
	{
		Properties prop=new Properties();
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\selenium\\NeoStox.properties");
		prop.load(myFile);
		
		String value = prop.getProperty(key);
		Reporter.log("Reading "+key+" from property File", true);
		return value;
	}
	

}

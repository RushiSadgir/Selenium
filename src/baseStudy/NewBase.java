package baseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class NewBase {
	protected static WebDriver driver;

	public static void launchingbrowser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		Reporter.log("launching the browser", true);
	}

}

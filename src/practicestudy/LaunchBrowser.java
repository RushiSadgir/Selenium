package practicestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser
{
	 static WebDriver driver;
	 
	public static void launchTheBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(1000);
	}

}

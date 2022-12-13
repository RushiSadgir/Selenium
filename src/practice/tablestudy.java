package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonMethod.UtilityStudy;

public class tablestudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
//		driver.findElement(By.linkText("Start Selenium Practice")).click();
//		CommenlyUseMethod.emplicitwait(driver, 3000);
//		int rows = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
//		System.out.println(rows);
		
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==1)
				{
				String tabledata = driver.findElement(By.xpath("(//table[@id='product']//tr)["+i+"]//th["+j+"]")).getText();
				System.out.print(tabledata+" ");
				}
				else
				{
					String tabledata = driver.findElement(By.xpath("(//table[@id='product']//tr)["+i+"]//td["+j+"]")).getText();
					System.out.print(tabledata+" ");
				}
			
			}
			System.out.println();
			
		}
		System.out.println("================================");
		Actions act=new Actions(driver);
		WebElement iframe = driver.findElement(By.id("courses-iframe"));
		act.moveToElement(iframe).perform();
		driver.switchTo().frame("courses-iframe");
		
		String iframetext = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']")).getText();
		System.out.println(iframetext);
		driver.switchTo().parentFrame();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		act.moveToElement(dropDown).perform();
		Select s=new Select(dropDown);
		s.selectByIndex(2);
		System.out.println("================================");
		
	
	}

}

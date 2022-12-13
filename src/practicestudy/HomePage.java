package practicestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath = "//i[@class='icon-bg homeIconsBg term-life']")private WebElement clickOnlife;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void lifeinsurance() 
	{
		clickOnlife.click();
	}

}

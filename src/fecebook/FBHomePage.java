package fecebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FBHomePage 
{
	@FindBy(xpath = "(//div[@class='x78zum5 xdt5ytf xz62fqu x16ldp7u'])[1]") private WebElement actualName;
	
	@FindBy(xpath = "(//span[@class='x1n2onr6'])[2]") private WebElement Friends;
	
	public FBHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	public String getactualName()
	{
		String Name = actualName.getText();
		Reporter.log("Geting Actual name",true);
		Reporter.log("Getting Actuaal name is "+Name, true);
		return Name;
	}

}

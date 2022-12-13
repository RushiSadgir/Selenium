package neotoxStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class PopUpHandels 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement clickonOK;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement clickonClose;
	
	public PopUpHandels(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void handePOPup(WebDriver driver)
	{
		
		clickonOK.click();
		UtilityStudy.wait(driver, 2000);
		clickonClose.click();
		Reporter.log("Handeling POPup", true);
	}
}

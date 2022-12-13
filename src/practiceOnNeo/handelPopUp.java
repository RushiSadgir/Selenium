package practiceOnNeo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class handelPopUp
{
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement clickonOK;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement clickonClose;
	
	public handelPopUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void PopUpHandel(WebDriver driver) throws InterruptedException
	{
		if(clickonOK.isDisplayed())
		{
		UtilityStudy.wait(driver, 1000);
		
		clickonOK.click();
		UtilityStudy.wait(driver, 1000);
		clickonClose.click();
		Reporter.log("Handeling POPup", true);
		}
		else
		{
			Reporter.log("Their is No PopUp", true);
			Thread.sleep(1000);
		}
	}

}

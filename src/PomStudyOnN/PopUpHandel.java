package PomStudyOnN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class PopUpHandel 
{
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement closebutoon;
	
	public PopUpHandel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void handelpopup(WebDriver driver)
	{
		Reporter.log("Handeling POpUp", true);
		UtilityStudy.wait(driver, 1000);
		closebutoon.click();
	}

}

package fecebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class LogOutPage
{
	@FindBy(xpath = "(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]") private WebElement personalinfo;

	@FindBy(xpath = "(//div[@class='x78zum5 xdt5ytf xq8finb x1xmf6yo x1e56ztr x1n2onr6 xqcrz7y'])[5]") private WebElement logOut;
	
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnLogOut(WebDriver driver)
	{
		UtilityStudy.wait(driver,1000);
		personalinfo.click();
		UtilityStudy.wait(driver,1000);
		logOut.click();
		Reporter.log("logging out the fb", true);
		
	}
}

package practiceOnNeo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class PasswordPage
{
	@FindBy(xpath = "//input[@type='password']") private WebElement enterpassword;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement clickOnSubmit;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpass(WebDriver driver,String pass)
	{
		UtilityStudy.wait(driver, 1000);
		enterpassword.sendKeys(pass);
		Reporter.log("Submiting the password",true);
	}
	public void enterSubmit(WebDriver driver)
	{
		UtilityStudy.wait(driver, 4000);
		clickOnSubmit.click();
		Reporter.log("clicking on Submit button",true);
	}
}

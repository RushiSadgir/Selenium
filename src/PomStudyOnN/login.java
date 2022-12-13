package PomStudyOnN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class login
{
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement MobileNo;
	
	@FindBy(id = "lnk_signup1") private WebElement clickOnSignUp;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void entermobilenp(String moNo)
	{
		MobileNo.sendKeys(moNo);
	}
	
	public void clickonsignIn()
	{
		Reporter.log("clicking on sign in", true);
		clickOnSignUp.click();
	}
	
}

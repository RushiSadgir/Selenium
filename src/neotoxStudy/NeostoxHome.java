package neotoxStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class NeostoxHome 
{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signIn;
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement MobileNo;
	@FindBy(id = "lnk_signup1") private WebElement clickOnSignUp;
	@FindBy(xpath = "//input[@type='password']") private WebElement enterpassword;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement clickOnSubmit;
	
	
	public void entermobile(WebDriver driver,String num)
	{
		signIn.click();
		UtilityStudy.wait(driver, 3000);
		MobileNo.sendKeys(num);
		UtilityStudy.wait(driver, 1000);
		clickOnSignUp.click();
		Reporter.log("Sign in on Neostox", true);
	}
	public void enterpass(WebDriver driver,String pass)
	{
		UtilityStudy.wait(driver, 1000);
		enterpassword.sendKeys(pass);
		UtilityStudy.wait(driver, 3000);
		clickOnSubmit.click();
		Reporter.log("Submiting the password",true);
	}
	
}

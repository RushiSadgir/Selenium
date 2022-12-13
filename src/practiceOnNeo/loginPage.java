package practiceOnNeo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class loginPage 
{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signIn;
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement MobileNo;
	@FindBy(id = "lnk_signup1") private WebElement clickOnSignUp;
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void loginOnPage(WebDriver driver,String num)
	{
		signIn.click();
		UtilityStudy.wait(driver, 1000);
		MobileNo.sendKeys(num);
		UtilityStudy.wait(driver, 1000);
		clickOnSignUp.click();
		Reporter.log("Sign in on Neostox", true);
	}
}

package neotoxStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class NeostoxUserName
{
	
	@FindBy(xpath = "(//span[text()='Hi Rushikesh Sadgir'])[1]") private WebElement UserName;
	@FindBy(id = "lbl_curbalancetop") private WebElement accountbalance;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logout;
	
	public NeostoxUserName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validatingusername(WebDriver driver,String expecteduser)
	{
		Reporter.log("Validating User name",true);
		String actualUser = UserName.getText();
		UtilityStudy.wait(driver, 1000);
		Assert.assertEquals(actualUser, expecteduser,"username are not matching TC is failled");
	}
	public void checkaccbal(WebDriver driver)
	{
		Reporter.log("Checking account balance", true);
		 String accbal = accountbalance.getText();
		 UtilityStudy.wait(driver, 1000);
		 Assert.assertNotNull(accbal,"account balance is null TC is failled");
		 Reporter.log("Actual balance is"+accbal,true);
	}
	
	public void logout(WebDriver driver)
	{
		UtilityStudy.wait(driver, 1000);
		UserName.click();
		UtilityStudy.wait(driver, 1000);
		logout.click();
		Reporter.log("Logiing out from neostox",true);
	}
}

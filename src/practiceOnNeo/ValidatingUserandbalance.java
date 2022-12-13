package practiceOnNeo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class ValidatingUserandbalance 
{
	@FindBy(id = "lbl_username") private WebElement userName;
	@FindBy(id = "lbl_curbalancetop") private WebElement accBalance;
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logOutButton;
	
	 public ValidatingUserandbalance(WebDriver driver) 
	 {
		PageFactory.initElements(driver, this);
	 }
	 
	 public String validatingUN(WebDriver driver) throws IOException
	 {
		 String actualUN = userName.getText();
		 Reporter.log("Getting actual UserNAme",true);
		 String RealName = actualUN.substring(3);
		 Reporter.log("Real Name is"+RealName, true);
		 UtilityStudy.screenshot(driver, RealName);
		 return actualUN;
	 }
	 public String checkingbalance()
	 {
		 String actualbalance = accBalance.getText();
		 Reporter.log("Checking actual balance", true);
		 Reporter.log("actual balance is"+actualbalance, true);
		 return actualbalance;
	 }
	 public void logginOut(WebDriver driver)
	 {
		 userName.click();
		 UtilityStudy.wait(driver,3000);
		 logOutButton.click();
	 }
}

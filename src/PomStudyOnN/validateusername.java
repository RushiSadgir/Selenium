package PomStudyOnN;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class validateusername
{
	@FindBy(xpath = "(//span[text()='Hi Rushikesh Sadgir'])[1]") private WebElement userName;
	
	public validateusername(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateuser(WebDriver driver,String expUserName) throws IOException
	{
		Reporter.log("Validating user name", true);
		String actualUserName = userName.getText();
		UtilityStudy.screenshot(driver, actualUserName);
		if(actualUserName.equals(actualUserName))
		{
			System.out.println("User Name are valid");
		}
		else
		{
			System.out.println("User Name are not validate");
		}
	}
	
	
}

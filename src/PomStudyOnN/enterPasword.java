package PomStudyOnN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class enterPasword 
{
	@FindBy(id = "txt_accesspin") private WebElement enterpassword;
	
	@FindBy(xpath = "//a[text()='Submit']") private WebElement clickOnSubmit;
	
	public enterPasword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpass(String pass)
	{
		Reporter.log("Entering password", true);
		enterpassword.sendKeys(pass);
	}

	public void clickonsub()
	{
		clickOnSubmit.click();
	}
}

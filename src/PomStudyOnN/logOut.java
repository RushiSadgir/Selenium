package PomStudyOnN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut
{
	
	@FindBy(xpath = "(//span[text()='Hi Rushikesh Sadgir'])[1]") private WebElement userName;
	@FindBy(id = "lnk_logout") private WebElement clickOnLogout;
	public logOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogout()
	{
		clickOnLogout.click();
	}
}

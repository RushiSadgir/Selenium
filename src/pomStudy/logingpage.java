package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logingpage 
{
	@FindBy(name = "email") private WebElement UserID;
	@FindBy(name = "pass") private WebElement password;
	@FindBy(id = "loginbutton") private WebElement logIn;
	
	public logingpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String UseRI)
	{
		UserID.sendKeys(UseRI);
	}	
	public void enterPass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickonlogin()
	{
		logIn.click();
	}
}

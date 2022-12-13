package fecebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginePage
{
	@FindBy(css = "input#email") private WebElement userName;
	
	@FindBy(id = "pass") private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']") private WebElement LogIn;
	
	public loginePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName(String Un)
	{
		userName.sendKeys(Un);
	}

	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}

	public void clickOnLoginButton()
	{
		LogIn.click();
	}
}

package practicestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import commonMethod.UtilityStudy;

public class Plans {
	@FindBy(xpath = "//a[@class='close ng-star-inserted']") private WebElement handelPopUp;
	
	public Plans(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnPopUp(WebDriver driver)
	{
		UtilityStudy.wait(driver, 1000);
		handelPopUp.click();
		Reporter.log("Handeling Pop Up",true);
	}
}

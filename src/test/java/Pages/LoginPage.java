package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="inputUsername")
	WebElement userNameField;
	
	@FindBy(name="inputPassword")
	WebElement passwordField;
	
	public void inputUserDetails(String userName,String password)
	{
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
	}

}

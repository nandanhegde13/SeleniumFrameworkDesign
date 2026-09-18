package Package1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Base.BaseTest;
import Base.DriverManager;
import Pages.LoginPage;

import Utilities.DataUtil;
import Utilities.ScreenshotUtil;

import org.apache.commons.io.FileUtils;
public class TakeScreenshot extends BaseTest {
	
	
	@Test(dataProvider="Test", dataProviderClass = DataUtil.class)
	public void screenshot(String userName,String password) throws IOException
	{
		
		DriverManager.getDriver().get("https://rahulshettyacademy.com/locatorspractice/");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.inputUserDetails(userName,password);
		
		
		
	}
	
	
}

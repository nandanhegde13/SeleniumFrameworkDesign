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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import Base.DriverManager;
import Pages.CalenderPage;
import Pages.LoginPage;

import Utilities.DataUtil;
import Utilities.ScreenshotUtil;

import org.apache.commons.io.FileUtils;

                                	
public class TakeScreenshot extends BaseTest{
	
	
	@Test(dataProvider="Test", dataProviderClass = DataUtil.class)
	public void screenshot(String userName,String password) throws IOException
	{
		
		DriverManager.getDriver().get("https://rahulshettyacademy.com/locatorspractice/");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.inputUserDetails(userName,password);	
		
	}
	
	@Test
	public void calenderHandle()
	{
		DriverManager.getDriver().get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		CalenderPage calender = new CalenderPage(DriverManager.getDriver());
		calender.chooseDate("13","March","2027");
	}
	
	
}

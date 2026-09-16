package Package1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.ScreenshotUtil;

import org.apache.commons.io.FileUtils;
public class TakeScreenshot extends BaseTest {

	@Test
	public void screenshot() throws IOException
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("Test"));
		
		
		
	}
	
	
}

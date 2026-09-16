package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Package1.BaseTest;

public class ScreenshotUtil extends BaseTest {

	public static String screenshotMethod() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File src = 	ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./pictures/image"+System.currentTimeMillis()+".png"));
		return System.getProperty("user.dir")+"./pictures/image\"+System.currentTimeMillis()+\".png";
	}
}

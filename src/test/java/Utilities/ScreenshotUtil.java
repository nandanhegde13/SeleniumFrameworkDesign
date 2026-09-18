package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;
import Base.DriverManager;

public class ScreenshotUtil {

	public static String screenshotMethod() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
	    File src = 	ts.getScreenshotAs(OutputType.FILE);
	    String filePath = System.getProperty("user.dir")
                + "/pictures/"      
                + "_Thread-"
                + Thread.currentThread().getId()
                + "_"
                + System.currentTimeMillis()
                + ".png";
		FileUtils.copyFile(src, new File(filePath));
		return filePath;
	}
}

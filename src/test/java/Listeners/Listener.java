package Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.ScreenshotUtil;

public class Listener extends ScreenshotUtil implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result)
	{
		try {
			screenshotMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

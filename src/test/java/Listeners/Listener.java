package Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.ScreenshotUtil;

public class Listener implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result)
	{
		try {
			ScreenshotUtil.screenshotMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			ScreenshotUtil.screenshotMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

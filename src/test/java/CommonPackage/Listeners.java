package CommonPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.Utilsjava;

import java.io.IOException;

import org.testng.ITestContext;

public class Listeners extends Utilsjava implements ITestListener{
	
	
	public void onTestStart(ITestResult result) 
	{System.setProperty("org.uncommons.reportng.title","TitleTest");	
		Reporter.log("Method name is - "+result.getName());
		System.out.println("TC Satrting");
	}
	

	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Status of Execution is -"+result.getStatus());
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
	System.out.println("TC failed, screenshot caprtured");
	
		try 
		{
			getScreenShot();
		} catch (IOException e)
		{e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\Arun\\eclipse-workspace\\Webportal\\screenshot\\Tue-Feb-27-19-02-36-EST-2024.png\">Test Results</a>");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}
	
}

package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonPackage.BaseTest;

public class ListenerScreenshotCapture extends BaseTest{

	
	@Test
	public void launchApp()
	{
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
		
	}
	
	
	
	
}

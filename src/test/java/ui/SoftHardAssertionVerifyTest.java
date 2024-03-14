package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftHardAssertionVerifyTest {
	@Test
	public void titleTest()
	{
		//SoftAssert - run all the lines in the test even if the frst line fails.
		
		
		SoftAssert softassert = new SoftAssert();
	String Expectedtitle = "Electronics, Carsss, Fashion, Collectibles & More | eBay";
	String ExpectedText = "Search1111";
	WebDriverManager.chromedriver().setup(); 
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	String actualtitle = driver.getTitle();
	System.out.println("verify title");
	
	 String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("Value");
			softassert.assertEquals(actualtitle, Expectedtitle, "Title failed");
			System.out.println("verifying text");
			softassert.assertEquals(actualtext, ExpectedText, "searchText  failed");
			System.out.println("closing browser");
			driver.close();
			//Assertall method Reports failed asserts
			softassert.assertAll();
	
	}
	
}
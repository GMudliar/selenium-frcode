package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBrowserIfElseTest {
	
	//public static String browser = "edge"; //External config xls, csv file
public static WebDriver driver;

@Parameters({"browser"})
@Test
public  void launchApplication(String browser)
{         
		
		
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
		
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
driver.close();

		
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		// driver.findElement(By.id("user-name")).sendKeys("standard_user");
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("secret_sauce");
//driver.findElement(By.xpath("//*[@id="login-button"]").click();
//driver1.manage().window().maximize();
		//driver.manage().window().maximize();
		//String currenturl = driver1.getCurrentUrl();
		//System.out.println(currenturl);

		//String currenturl1 = driver.getCurrentUrl();
		//System.out.println(currenturl1);

		//String title = driver1.getTitle();
		//System.out.println(title);
		
		////String title1 = driver.getTitle();
		//System.out.println(title1);
/*
driver1.findElement(By.id("user-name")).sendKeys("standard_user");
driver1.findElement(By.id("password")).sendKeys("secret_sauce");
driver1.findElement(By.xpath("//input[@id='login-button']")).click();
		List<WebElement> webelements = driver1.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);*/
		
		
		/*
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements); 

		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);

driver.navigate().to("https://www.amazon.com");
	String windowhandle = driver.getWindowHandle();
	System.out.println(windowhandle);
	driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_3']")).click();
	
	Set<String> windowhandles = driver.getWindowHandles();
	System.out.println(windowhandles);
//driver.close();
 * 
 */
		
		

	}



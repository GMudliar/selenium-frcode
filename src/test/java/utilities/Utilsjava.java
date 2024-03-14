package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonPackage.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilsjava extends BaseTest{
	
	public  void getScreenShot() throws  IOException {
		
		Date currentDate = new Date();
		String screenshotfilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/" + screenshotfilename + ".png"));

	
	}
}

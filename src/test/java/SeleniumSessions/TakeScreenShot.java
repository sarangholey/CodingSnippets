package SeleniumSessions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		takeScreenshot("facebookScreenshot");
		
		
	}
	
	public static void takeScreenshot(String fileScreenshotName) throws IOException
	{
		// 1. Take a screenshot and save it in file type format
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("../JanSeleniumTraining/src/main/java/SeleniumSessions/screenshotOutput/"+fileScreenshotName+".jpg"));
	}

}

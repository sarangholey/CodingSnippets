package SeleniumSessions.ScreenshotOfFailedTestCaes;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	static WebDriver driver;

	public void initilization()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void failedTestScreenshot(String methodName)
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Vision\\eclipse-workspace\\JanSeleniumTraining\\src\\main\\java\\SeleniumSessions\\ScreenshotOfFailedTestCaes\\Screenshots\\failTestScreenshot"+methodName+".png"));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}

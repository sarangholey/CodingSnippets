package SeleniumSessions;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptErrorsFindingViaSelenium
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		LoggingPreferences loggingPreferences = new LoggingPreferences();
		loggingPreferences.enable(LogType.BROWSER, Level.ALL);
		capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingPreferences);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(capabilities);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	public void extractJSLogsInfo()
	{
		LogEntries logentries = driver.manage().logs().get(LogType.BROWSER);
		for(LogEntry entry : logentries)
		{
			System.out.println(new Date(entry.getTimestamp() + " " + entry.getTimestamp() + " " + entry.getTimestamp()));
		}
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		extractJSLogsInfo();
	}
}



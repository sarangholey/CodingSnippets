package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PushNotificationHandle
{

	public static void main(String[] args) 
	{
		disableChromeOptions();
		//disableFireFoxOptions();
	}
	
	public static void disableChromeOptions()
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
	}
	
//	public static void disableFireFoxOptions()
//	{
//		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
//		FirefoxOptions options = new FirefoxOptions();
//		options.addPreference("dom.webnotifications.enabled", false);
//		WebDriver driver  = FirefoxDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("https://www.redbus.in");
//	}

}

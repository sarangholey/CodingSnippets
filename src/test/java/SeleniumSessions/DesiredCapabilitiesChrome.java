package SeleniumSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitiesChrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		// To disable Info bar saying - Chrome is being controlled By Automated Software
		options.addArguments("--disable-infobars");
		
		// To add specific Extentions on Automated Browser cnotrolled via selenium at fresh Instance ex - AddBlockerPlus
		
		options.addExtensions(new File("../JanSeleniumTraining/AddBlockerPlus.crx"));
		options.addExtensions(new File("../JanSeleniumTraining/AddBlock.crx"));
		
		// To set SSL Cerificated as True which is not available with some WebSites
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");

	}

}

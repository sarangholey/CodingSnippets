package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless 
{

	public static void main(String[] args) 
	{
		
		
		FirefoxBinary firefoxbinary = new FirefoxBinary();
		firefoxbinary.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxbinary);
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
	}

}

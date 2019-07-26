package Testimonials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author Sarang
* @version 1.0
* @since   2014-03-31 
* @
*/
public class DesiredCapabilitiesSSLCertificate {

	/**
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "geckodriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new FirefoxDriver();
		
		
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.cacert.com");

	}

}

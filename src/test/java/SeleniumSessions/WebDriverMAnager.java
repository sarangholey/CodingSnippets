package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Sarang
 * Created on 16/04/2019
 *
 */

public class WebDriverMAnager
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		// Dependency
//		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
//			<dependency>
//		<groupId>io.github.bonigarcia</groupId>
//		<artifactId>webdrivermanager</artifactId>
//		<version>3.4.0</version>
//		</dependency>
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
}

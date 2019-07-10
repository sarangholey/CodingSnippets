package drivers;

import java.lang.reflect.Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ParabankLoginViaIncognito
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--headless");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(capabilities);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println(driver.getTitle());
//		driver.findElement(By.name("username")).sendKeys("john");
//		driver.findElement(By.name("password")).sendKeys("demo");
//		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		

	}
}

package temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tc_hubspot 
{
	WebDriver driver;
	@BeforeMethod
	public void open1()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	@Parameters({"url"})
	public void open(@Optional("https://www.google.com") String url)
	{
		
		driver.get(url);
		
	}
	
}

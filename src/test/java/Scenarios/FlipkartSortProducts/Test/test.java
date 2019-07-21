package Scenarios.FlipkartSortProducts.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test 
{
	static WebDriver driver;
	
//	@BeforeMethod
//	public void setUp()
//	{
//		System.setProperty("wendriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//	}
	
	@Test
	public void openchrome()
	{
		
		//String regex = "[^a-zA-Z0-9]";
		String data = "dsajksajsjdbvlasdbv";
		data = data.replaceAll("saj", "#");
		System.out.println(data);
		//System.out.println(data.matches(regex));
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
}

package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeInvoking {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		
		System.out.println("launching Microsoft Edge browser");
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.co.in");
		
		
		
		
	}

}

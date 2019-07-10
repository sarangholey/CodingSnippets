package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\drivers\\chromedriver.exe");
		// Setting up browser driver path
		
		WebDriver driver = new ChromeDriver();
		// Upcasting and creating the ChromeDriver class
		
		driver.get("https://www.google.com");
		// launching the url
		String pageTitle = driver.getTitle();
		//getiing page title
		System.out.println(pageTitle);
		//printing page title
		if(pageTitle.equals("Google"))
		{
			System.out.println("Page title is correct");
		}
		else 
		{
			System.out.println("Page title is incorrect");
		}
		//validating title is correct
		
		System.out.println(driver.getCurrentUrl());
		//printing current page url
		
		// System.out.println(driver.getPageSource());
		//printing page source
		
		driver.quit();
		//quitting the browser
		
	}

}

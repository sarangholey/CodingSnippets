package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations 
{
	public static void main(String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "..\\JanSeleniumTraining\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.freecrm.com");
		WebElement termsText = driver.findElement(By.linkText("Terms of Use"));
		termsText.click();
		
		driver.navigate().to("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Hello");
		
		driver.navigate().refresh();
		
		searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Hello");
		
		
	}
	
	
}

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserAlert 
{
	static WebDriver driver;
	 
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// Setting up browser driver path
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		
		// Upcasting and creating the ChromeDriver class
		
		//wait = new WebDriverWait(driver, 5);
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.0_3");
		
		WebElement goButton =  driver.findElement(By.xpath("//button[@onclick='JSalert()']"));
		goButton.click();
		
		
		//wait.until(ExpectedConditions.visibilityOf(goButton));
		
		// Click on OK botton on Alert
		WebElement okButton =  driver.findElement(By.xpath("//button[@class='confirm']"));
		okButton.click();
		
	}
}

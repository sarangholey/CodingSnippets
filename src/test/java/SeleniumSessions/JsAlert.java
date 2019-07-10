package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlert 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\drivers\\chromedriver.exe");
		// Setting up browser driver path
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Upcasting and creating the ChromeDriver class
		
		// Example 1
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		if(alertText.equals("Please enter a valid user name"))
		{
			System.out.println("Alert is ok");
			alert.accept();
			//alert.dismiss();// to dismiss the alert
		}
		
		// Example 2
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.0_3");
		driver.findElement(By.xpath("//button[@onclick='JSalert()']")).click();
		Alert fancyJsAlert = driver.switchTo().alert();
		fancyJsAlert.accept();
				
	}
		
	
		
}

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Sarang
 * Created on 16/04/2019
 *
 */

public class AuthenticationURL {

	
	public static void main(String[] args) {
		
		// WebDriver Configuration
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Here inside URL USername and Password is being sent
		// Username - admin
		// Password - admin
		// after text http://username:password@Url is to be the syntax
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		// Validation Check Point
		WebElement successfulAuthText = driver.findElement(By.xpath("//div[@id='content']//p"));
		System.out.println(successfulAuthText.getText());
		String ActualText ="Congratulations! You must have the proper credentials.";
		
		if(successfulAuthText.equals(ActualText))
		{
			System.out.println("Authentication is successful");
		}
		else
		{
			System.out.println("Authentication is Unsuccessful");
		}
	}

}

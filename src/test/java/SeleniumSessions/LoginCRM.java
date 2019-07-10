package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginCRM {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\drivers\\chromedriver.exe");
		// Setting up browser driver path
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// Upcasting and creating the ChromeDriver class
		
		driver.get("https://classic.crmpro.com/index.html");
		// launching the url
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
		  WebElement un = driver.findElement(By.name("username"));
		  un.sendKeys("naveenautomation"); WebElement pw =
		  driver.findElement(By.name("password")); pw.sendKeys("test@123"); WebElement
		  signinBtn =
		  driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.
		  xpath("//input[@type='submit' and @value='Login']")));
		 
		//Thread.sleep(2000);
		//JavaScriptUtil.clickElementByJS(signinBtn, driver);
		//signinBtn.click();
		//System.out.println(driver.getTitle());
		//JavaScriptUtil.scrollPageDown(driver);
	
	}

}

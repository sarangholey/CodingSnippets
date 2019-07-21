package seleniumLectures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect11_Xpath_1 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		
		// simple xpath without any property
		// ideally it should be true and size should be 3 for above url
		System.out.println("By putting //input in xpath locator output is " + driver.findElement(By.xpath("//input")).isDisplayed());
		System.out.println("By putting //input in xpath locator size is " + driver.findElements(By.xpath("//input")).size());
		
		// finding element by - //input[@id='username']
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test");
		Thread.sleep(2000);
		
		//clearing the username field
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		Thread.sleep(2000);
		
		// finding elemetn by - //input[@id='username'][1]
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test123");
		Thread.sleep(2000);
		
		//clearing the username field
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		Thread.sleep(2000);
		
		// finding elemetn by - //input[@type='email'] and //input[@type='email'][1] is also valid
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test456");
		
		
		// also following xpath also valid for the field
		//input[@type='email' and @id='username'] - 1 fields
		//input[@type='email' or @id='username'] - 1 fields
		//input[@type='email' and @id] - 1 fields
		//input[@type='email' or @id] - 1 fields
		//input[@class='form-control private-form__control login-email'] - 1 fields -  is contains compound classes 
		//input[@type] - 3 fields
		
		// xpath with contains() xpath - where we send a partial part of a attribute in xpath
		// when any attribute field in DOM is changing with slightly alteration
		//<input id=test_123>
		//<input id=test_456>
		//<input id=test_143>
		//<input id=test_4578>
		//so xpath for such type of attribute in DOM 
		//driver.findElement(By.xpath("//input[contains(@id,'test_')"));
		//driver.findElement(By.xpath("//input[contains(@id,'test')"));
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("test789456");
	}

}

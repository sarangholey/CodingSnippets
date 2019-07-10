package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 * @author Sarang
 * Created on 19/04/2019
 *
 */

public class KeyPressEventInSelenium {

	static WebDriver driver;
	
	@Test
	public void keyPressEventSpace() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		

		Actions action = new Actions(driver);
		action.sendKeys(Keys.SPACE).build().perform();;
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You entered: SPACE");
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void keyPressEventEnter() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();;
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You entered: ENTER");
		
		Thread.sleep(2000);
		driver.quit();
	}

}

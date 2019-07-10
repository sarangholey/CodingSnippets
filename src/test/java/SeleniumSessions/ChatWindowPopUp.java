package SeleniumSessions;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChatWindowPopUp 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void loginByClosingChatWindowModelPopUp() throws InterruptedException
	{
		driver.get("https://classic.crmpro.com");
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(7000);
		driver.switchTo().frame(driver.findElement(By.name("intercom-notifications-frame")));
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='intercom-chat-snippet-card']"))).build().perform();
		
		driver.findElement(By.xpath("//button[@class='intercom-notifications-dismiss-button']")).click();
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	
}

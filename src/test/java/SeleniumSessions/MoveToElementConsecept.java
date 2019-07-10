package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConsecept {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://vision//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.mrbool.com/how-to-create-menu-with-submenu-suing-css-html/26146");
		
		WebElement content = driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		action.moveToElement(content).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("COURCES")).click();
		
	}

}

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickConsecept {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickImage = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement clickOnCopy = driver.findElement(By.className("context-menu-icon-copy"));
		 Actions action = new Actions(driver);
		 action.contextClick(rightClickImage).build().perform(); // contextClick(WebElement); will click exactly at middile of WebElement
		 Thread.sleep(2000);
		 action.click(clickOnCopy).build().perform();
		 System.out.println(clickOnCopy.getText());
		 Thread.sleep(2000);
		 Alert jsAlert = driver.switchTo().alert();
		 Thread.sleep(2000);
		 jsAlert.accept();
		 
		 
	}

}

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		
		Actions action = new Actions(driver);
		// this method is available in selenium 3 
		action.dragAndDrop(source, destination).build().perform();
		
		
		// Second Secnario
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source1 = driver.findElement(By.id("draggable"));
		WebElement destination1 = driver.findElement(By.id("droppable"));
		
		Actions action1 = new Actions(driver);
		action1.clickAndHold(source1).moveToElement(destination1).
		release().
		build().
		perform();
		
		// perform actions via single line only applicable for single WebElement
		new Actions(driver).dragAndDrop(source, destination).build().perform();
		
		
		
		
	}

}

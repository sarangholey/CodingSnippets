package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame' ]"));
		driver.switchTo().frame(frame);
//		WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']/p"));
//		WebElement dropMe = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement resizeME = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		//Action class
		
		//myAction.dragAndDrop(dragMe, dropMe).build().perform();
		
		Actions myAction = new Actions(driver);
		myAction.dragAndDropBy(resizeME, 500, 500).build().perform();;
		
		
		
		
	}
	
	
	
	
	
}

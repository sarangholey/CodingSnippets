package Scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickAction
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action = new Actions(driver);
		action.contextClick(btn).build().perform();
		
		List<WebElement> afterRightClickList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		System.out.println("The Items in List are :");
		for(int i=0;i<afterRightClickList.size();i++)
		{
			System.out.println(afterRightClickList.get(i).getText());
		}
		
	}
}

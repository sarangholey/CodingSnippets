package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserWindowHandling
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		WebElement popUp3 = driver.findElement(By.xpath("//a[text()='Good PopUp #3']"));
		popUp3.click();

		 Set<String> handles = driver.getWindowHandles();
		 
		 Iterator<String> it = handles.iterator();
		 
		 String parentWindowId = it.next();
		 System.out.println("Parent Window Id is :" + parentWindowId);
		 
		 String childWindowId = it.next();
		 System.out.println("Child Window Id is :" + childWindowId);
		 
		 driver.switchTo().window(childWindowId);
		 System.out.println(driver.getTitle());
		 
		 driver.close();
		 driver.switchTo().window(parentWindowId);
		 System.out.println(driver.getTitle());
	}

}

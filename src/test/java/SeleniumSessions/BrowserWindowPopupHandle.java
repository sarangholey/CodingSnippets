package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopupHandle {

	public static void main(String[] args)
	{
		// This code is to demonstrate how to handle model popup (Chat popup)
		// these model popup are not java script popup or browser window popup
		// so there is no method for it to handle driver.switch.alert() or driver.switchto.window()
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set<String> handles =  driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent Window ID is : " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child Window Id is : " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("Child Window Title is :" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title is :" + driver.getTitle());
		
	}

}

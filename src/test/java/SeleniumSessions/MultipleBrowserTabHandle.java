package SeleniumSessions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserTabHandle 
{
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Vision\\\\drivers\\\\chromedriver.exe");
		
		//1 Create Driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//Navigate and click on the link
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		WebElement lnk_try_it_urself = driver.findElement(By.partialLinkText("Try it Yourself"));
		
		//this link will open new tab because of its implementation of <a target= "_blank">
		lnk_try_it_urself.click();
		
		//Get windows handles
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		//Two handle will be returned
		System.out.println(tabs.size());
		
		//Switch to 2nd tab
		driver.switchTo().window(tabs.get(1));
		
		//perform a click operation on the 2nd tab to check the switch is completed
		WebElement btn_save = driver.findElement(By.xpath("//a[@title = 'Save']"));
		btn_save.click();
		
		Thread.sleep(5000);
		
		//This will close only the current tab.
		//This is a basic difference between driver.quit and driver.close
		//driver close will only close the current window or tab
		//where as driver quit will quit all the windows open under the driver
		driver.close();
		
		//Return to default window
		driver.switchTo().window(tabs.get(0));
		
		//driver quit
		//driver.quit(); //will close all the windows
 
	}
}

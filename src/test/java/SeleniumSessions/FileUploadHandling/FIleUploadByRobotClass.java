package SeleniumSessions.FileUploadHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIleUploadByRobotClass
{

	public static void main(String arge[]) throws InterruptedException
	{
		System.setProperty("wendriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@id='imagesrc' and @type='file']")).click();
		Thread.sleep(3000);
		try {
			// Creating object of Robot class
			Robot robot = new Robot();
			// Setting up the path of file to be uploded by creating StringSelection Object
			StringSelection stringSelection = new StringSelection("C:\\Vision\\eclipse-workspace\\JanSeleniumTraining\\pom.xml");
			// Coping the path of file to clipboard 
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			// Click n holding Control and V key 
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			// Releasing the keys Control and V
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			Thread.sleep(2000);
			// Clicking on Enter key
			robot.keyPress(KeyEvent.VK_ENTER);
			// Releasing the Enter key
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}

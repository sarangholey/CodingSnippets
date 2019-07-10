package SeleniumSessions.FileUploadHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadByAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("wendriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@id='imagesrc' and @type='file']")).click();
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec("C:\\Vision\\eclipse-workspace\\JanSeleniumTraining\\src\\main\\java\\SeleniumSessions\\FileUploadHandling\\fileuploadAutoIt.exe");
		
	}

}

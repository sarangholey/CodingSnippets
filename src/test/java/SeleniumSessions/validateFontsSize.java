package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateFontsSize {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String IAmFeelingText = driver.findElement(By.name("btnI")).getCssValue("font-size");
		String IAmFeelingTextFontStyle = driver.findElement(By.name("btnI")).getCssValue("font-family");
		String IAmFeelingTextFontColour = driver.findElement(By.name("btnI")).getCssValue("color");
		
		System.out.println("The Font Size for I am feeling lucky Button Text is: " + IAmFeelingText);
		System.out.println("The Font Size for I am feeling lucky Button Font Style is: " + IAmFeelingTextFontStyle);
		System.out.println("The Font Size for I am feeling lucky Button Font Colour is: " + IAmFeelingTextFontColour);
	}

}

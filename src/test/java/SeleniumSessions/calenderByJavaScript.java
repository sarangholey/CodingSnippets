package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderByJavaScript {

	static WebDriver driver;
	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\drivers\\chromedriver.exe");
		// Setting up browser driver path
		
		driver = new ChromeDriver();
		// Upcasting and creating the ChromeDriver class
		
		driver.get("https://www.spicejet.com/");
		WebElement calender = driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']"));
		//calender.click();
		//WebElement date = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']"));
		String dateVal = "30-04-2019";
		selectDateByJS(driver, calender, dateVal);
	}

	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("agruments[0].setAttribute('value','"+dateVal+"');", element);
	}
}

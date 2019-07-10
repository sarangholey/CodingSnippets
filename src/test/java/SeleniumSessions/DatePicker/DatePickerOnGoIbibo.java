package SeleniumSessions.DatePicker;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Sarang
 * @Date - 21/05/2019
 */

public class DatePickerOnGoIbibo {
	WebDriver driver;
	String URL = "https://www.goibibo.com/";
	String MonthToBeSelected = "September 2020";
	String DAY = "15";

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void datePicker() throws InterruptedException {
		// passing URL
		driver.get(URL);
		// Clicking on Departure Date Picker Box
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Departure']")).click();
		// Logic for Expected Date Picker
		while (true) 
		{
			String monthOnPage = driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']")).getText();
					
			if (monthOnPage.equals(MonthToBeSelected)) 
			{
				break;
			} else
			{
				driver.findElement(
						By.xpath("//span[@role='button' and @class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}

		}
		
		// Clicking over the DAY variable date
		driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/div[text()=" + DAY + "]")).click();
		
		// Printing selected date on Console
		WebElement departDate = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Departure']"));
		System.out.println(departDate.getAttribute("value"));
	}

	@AfterMethod
	public void teardown() 
	{
		driver.close();
	}

}

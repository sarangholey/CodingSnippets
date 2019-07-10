package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21838"
				+ "/sur-vs-mdx-south-group-england-domestic-one-day-cup-2019");
		
		 List<WebElement> playerNames = driver.findElements(By.xpath("//div[@class='cb-col cb-col-27 ']/a[@class='cb-text-link']"));
		 System.out.println("playerNames "+playerNames.size() + "\n");
		 
		 for(int i=0;i<playerNames.size();i++)
		 {
			 System.out.println(playerNames.get(i).getText());
		 }
	}

}

package SeleniumSessions.Log4J;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs 
{
	public static void main(String[] args) 
	{
		Logger log = Logger.getLogger(GenerateLogs.class);
		// GenerateLogs.class - comes from Log4J dependency
		WebDriver driver = new ChromeDriver();
		
		log.info("launching browser");
		
		driver.get("https://www.google.com");
		log.info("google url has been launched");
		
		String title = driver.getTitle();
		System.out.println("Title value is :" + title );
		
		log.info("Title value is :" + title );
		
		if(title.equals("Google"))
		{
			System.out.println("correct title is Google");
			log.info("Correct title is Google and test case is passed");
		}
		else
		{
			System.out.println("correct title is not Google");
			log.info("Correct title is not Google and test case is failed");
		}
		
		driver.quit();
		log.info("driver closed");
	}
}

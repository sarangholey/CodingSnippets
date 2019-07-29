package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrokenLinksFinding 



{
		
	public static void main(String[] args) throws MalformedURLException, IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",args[0]);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// http://the-internet.herokuapp.com/broken_images - another demo broken link site
		driver.get("https://www.makemysushi.com");
		//driver.get("http://demo.automationtesting.in/Register.html");
		
		//driver.findElement(By.name("username")).sendKeys("naveenautomation");
		//driver.findElement(By.name("password")).sendKeys("test@123");
		//WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		//signInBtn.click();
		
		// 1. Get list of all links and images - ex 500
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img"))); // adding images in the list - apending
	
		List<WebElement> activeLinks = new ArrayList<WebElement>(); // ex - 450
		
		// 2. Itrate linkList : excluding all the links/images - donesnt have any href attribute 
		for(int i=0;i<linksList.size();i++)
		{
			if(linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript")))
			{
				System.out.println(linksList.get(i).getAttribute("href"));
				activeLinks.add(linksList.get(i));
			}
		}
		
		// get the size of activeLink List
		System.out.println("Size of active links and images--->" + activeLinks.size());
		
		// 3. check the href url, with http connection api
		// Response code
		// 200 - ok
		// 404 - not found
		// 500 - intrnal error
		// 400 - bad request
		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection connection  = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "----->" + response);
			
		}
	}
	
	
	
	
	
}

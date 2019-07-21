package seleniumLectures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lect11_VerifyElementOnPage
{
	// In this program by suing findElements method we verify the element is present on the page
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		
		List<WebElement> forgot_pwd_Link = driver.findElements(By.linkText("Forgot my password"));
		
		// printing link size
		System.out.println("Current Link Size available on the page is : ->" + forgot_pwd_Link.size());
		
		// verification of the Link presence on page
		if(forgot_pwd_Link.size()>0)
		{
			System.out.println("Link is available on the page with text : -> " + forgot_pwd_Link.get(0).getText());
		}
		
		driver.close();
		
	}

}

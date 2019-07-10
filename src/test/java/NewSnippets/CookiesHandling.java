package NewSnippets;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling 
{
	static WebDriver driver;
	static String URL = "https://www.facebook.com";
	
	// get the Set of Available cookies on the given URL
	public static Set<Cookie> CookiesAvailable(String URL)
	{
		driver.get(URL);
		Set<Cookie> getAllCookies =  driver.manage().getCookies();
		return getAllCookies;
	}
	
	// get the all parameters available in cookies on given URL
	public static void printAllCookiesDetails(String URL)
	{
		Set<Cookie> getAllCookies = driver.manage().getCookies();
		for(Cookie cookie : getAllCookies)
		{
			System.out.println("========================================");
			System.out.println("The cookie Name is : " + cookie.getName());
			System.out.println("The cookie Domain is : " + cookie.getDomain());
			System.out.println("The cookie Path is : " + cookie.getPath());
			System.out.println("The cookie Value is : " + cookie.getValue());
			System.out.println("The cookie Expiry is : " + cookie.getExpiry());
			System.out.println("The cookie is secure : " + cookie.isSecure());
			System.out.println("The cookie having HTTP connection is : " + cookie.isHttpOnly());
			System.out.println("========================================");
		}
	}
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Available cookies on "+URL+" is : " + CookiesAvailable(URL).size());
		printAllCookiesDetails(URL);
	}
}

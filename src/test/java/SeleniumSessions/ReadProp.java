package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import SeleniumSessions.constatnts.ConstantsVariables;

public class ReadProp {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
		Properties prop = new Properties();
		try 
		{
			FileInputStream ip = new FileInputStream( System.getProperty("user.dir") +  "/src/main/java/SeleniumSessions/config.properties");
			//this FileInputStream will connect the .properties file with java code
			prop.load(ip);
			// loading all the properties form .properties file to an object prop 
		} 
		catch (FileNotFoundException e) 
		{
			// FileNotFoundException thrown when the file is not present at its given path
			e.printStackTrace();
		} catch (IOException e) {
			// IOException will occur if by any chance the file got  it throws the exception 
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		String headLess = prop.getProperty("headless");
		System.out.println(prop.get("username"));
		System.out.println(prop.get("commentedProperty"));
		System.out.println(prop.getProperty("sarang"));
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
			 if(headLess.equalsIgnoreCase("yes"))
			 {
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--headless");
				 driver = new ChromeDriver(options);
			 }
			 else
			 {
				 driver = new ChromeDriver();
			 }
				
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println(ConstantsVariables.NO_BROWSER_FOUND);
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.id(prop.getProperty("login_btnById"))).click();
	}

}

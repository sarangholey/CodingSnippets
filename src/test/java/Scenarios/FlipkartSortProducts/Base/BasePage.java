package Scenarios.FlipkartSortProducts.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasePage
{
	WebDriver driver;
	Properties prop;
	
	public WebDriver initialize_driver(Properties prop)
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			if(prop.getProperty("headlessmode").equals("yes"))
			{
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			}
			else
			{
			driver = new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
//			if(prop.getProperty("fullscreenmode").equals("yes"))
//			{
//				driver.manage().window().maximize();
//			}
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			if(prop.getProperty("headlessmode").equals("yes"))
			{
			FirefoxBinary firefoxbinary = new FirefoxBinary();
			firefoxbinary.addCommandLineOptions("--headless");
			
			FirefoxOptions fo = new FirefoxOptions();
			fo.setBinary(firefoxbinary);
			
			driver = new FirefoxDriver(fo);
			}
			else
			{
			driver = new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			if(prop.getProperty("fullscreenmode").equals("yes"))
			{
				driver.manage().window().maximize();
			}
		}
		else 
		{
			System.out.println("Unable to initialize driver, please provide a valid browser name in config file");
		}
		return driver;
	}
	
	public Properties initialize_properties()
	{
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("../Codingsnippets/src/test/java/Scenarios/FlipkartSortProducts/config/config.properties");
			prop.load(ip);
			ip.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("Config file is not available, please create a file or check the path for properties file");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("IOException while loading the config file");
		}
		return prop;
	}
//	
//	public static void main(String[] args) {
//		WebDriver driver;
//		Properties prop;
//		
//		Base base = new Base();
//		prop = base.initialize_properties();
//		driver =  base.initialize_driver();
//		
//		driver.get(prop.getProperty("url"));
//	}
}

package SeleniumSessions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableImageOptionOnChrome 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		disableImagesChrome(options);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.com");
	}
	
	public static ChromeOptions disableImagesChrome(ChromeOptions options)
	{
		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("images", 2);
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		options.setExperimentalOption("prefs", prefs);
		return options;
	}
}

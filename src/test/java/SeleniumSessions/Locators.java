package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\drivers\\chromedriver.exe");
		// Setting up browser driver path
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Upcasting and creating the ChromeDriver class
		
		driver.get("https://app.hubspot.com");
		// launching the url
		
		// locators - 8 types
		// 1.id
		// 2.name
		// 3.className
		// 4.cssSelector
		// 5.linkText
		// 6.partialLinkText
		// 7.tagName
		// 8.xpath - XML HTML path
		
		
		/*
		 * // 1. id WebElement email = driver.findElement(By.id("username"));
		 * email.sendKeys("sarangsholey@gmail.com");
		 * 
		 * // 2. linkText - nothing related to href, but href should be present for the
		 * locator WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
		 * signUpLink.click(); driver.navigate().back();
		 * 
		 * // 3. partialLinkText - nothing related to href, but href should be present
		 * for the locator WebElement signUpLinkPartial =
		 * driver.findElement(By.partialLinkText("Sign")); signUpLinkPartial.click();
		 * driver.navigate().back();
		 * 
		 * // 4. xpath WebElement ssoButtonByXpath =
		 * driver.findElement(By.xpath("//button[@id='ssoBtn']"));
		 * ssoButtonByXpath.click(); driver.navigate().back();
		 * 
		 * // 5. cssSelector WebElement ssoButtonByCssSelector =
		 * driver.findElement(By.cssSelector("#ssoBtn"));
		 * ssoButtonByCssSelector.click(); driver.navigate().back();
		 * 
		 * WebElement password = driver.findElement(By.id("password"));
		 * password.sendKeys("92426122");
		 * 
		 * //email.clear(); WebElement emailByClassName =
		 * driver.findElement(By.className("login-email"));
		 * emailByClassName.sendKeys("abc@gmail.com");
		 * 
		 * //driver.quit(); //driver.findElement(By.id("loginBtn")).click();
		 */		
		
		// 6. tagname - with findElements - returns list of WebElelements
		driver.navigate().to("https://www.facebook.com");
		List<WebElement> tagsOnFaceBookPage = driver.findElements(By.tagName("a"));
		//System.out.println(tagsOnFaceBookPage);
		System.out.println("Total link count is " + tagsOnFaceBookPage.size());
		for (int i=0;i<tagsOnFaceBookPage.size();i++)
		{
			String linkText = tagsOnFaceBookPage.get(i).getText();
			
			System.out.println(i + "----->" + linkText);
			
		}
		
		List<WebElement> languageCountOnPageFB = driver.findElements(By.tagName("ul"));
		for(int i=0;i<languageCountOnPageFB.size();i++)
		{
			String languageNames = languageCountOnPageFB.get(i).getText();
			System.out.println("Language -->" + languageNames);
		}
		
		
	}

}

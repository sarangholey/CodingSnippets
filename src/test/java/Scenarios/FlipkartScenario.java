package Scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartScenario {

	static WebDriver driver;
	static int total = 0;
	static float averageOfItems = 0;
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com");
		WebElement closeBtn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		if(closeBtn.isDisplayed())
		{
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(closeBtn)).click();
		}

		WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchbox.sendKeys("iphone");
		searchbox.sendKeys(Keys.ENTER);

		List<WebElement> dispalyedPrice = driver.findElements(By.xpath("//div[@class=\"_1vC4OE _2rQ-NK\"]"));
		for(int i=0;i<=10;i++) //₹
		{
			String removed₹Text = dispalyedPrice.get(i).getText().replace("₹", "");
			String removedCommaText = removed₹Text.replace(",", "");
			System.out.println(removedCommaText);
			int temp = Integer.parseInt(removedCommaText);
			total = total + temp;
		}
		System.out.println("Total of all iphones is" + total);
		System.out.println("Average is " + total/(10));
		

	}

}



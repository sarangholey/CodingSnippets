package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguagePrinting 
{
	static JavascriptExecutor js;
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		List<WebElement> language_List = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println("Google offers language Count is: " +language_List.size() + "\n");
		
		for(int i=1;i<=language_List.size();i++) 
		{
			
			WebElement G_Click = driver.findElement(By.xpath("//div[@id='SIvCob']/a["+i+"]"));
			G_Click.click();
			driver.navigate().back();
			WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Google')]"));
			System.out.println(text.getText());
			language_List = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
	}
}
package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxContolGoogleSearch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("Testing");
		
		
		List<WebElement> googleSearchSuggesionList = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		WebDriverWait waitToDipalyList = new WebDriverWait(driver, 5);
		waitToDipalyList.until(ExpectedConditions.visibilityOfAllElements(googleSearchSuggesionList));
		System.out.println("List of Search items ==> " + googleSearchSuggesionList.size() + "\n"); 
		for(int i=0;i<googleSearchSuggesionList.size();i++)
		{
			System.out.println(googleSearchSuggesionList.get(i).getText());
			if(googleSearchSuggesionList.get(i).getText().contentEquals("testing life cycle"))
			{
				googleSearchSuggesionList.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}  
	}

}

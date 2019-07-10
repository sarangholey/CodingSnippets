package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithotSelectClassByXpath 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Vision\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
		List<WebElement> monthList = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		List<WebElement> yearList = driver.findElements(By.xpath("//select[@name='birthday_year']/option"));
		
		String dob = "10-Feb-1990";
		String dobVal[] = dob.trim().split("-");
		
		
		selectFromDropDown(dayList, dobVal[0]);
		selectFromDropDown(monthList, dobVal[1]);
		selectFromDropDown(yearList, dobVal[2]);
	}
	
	public static void selectFromDropDown(List<WebElement> listName, String value)
	{
		for(int i=0;i<listName.size();i++)
		{
			System.out.println("Values inside list are - " + listName.get(i).getText());
			String listValue = listName.get(i).getText();
			if(listValue.equals(value))
			{
				listName.get(i).click();
				break;
			}
		}
	}
	
	
}

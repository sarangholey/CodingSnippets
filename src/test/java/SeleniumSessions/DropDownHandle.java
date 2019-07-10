package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Vision\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "10-Feb-1990";
		String dobVal[] = dob.trim().split("-");
		
		selectDropdownValueByVisibleText(day, dobVal[0].trim());
		selectDropdownValueByVisibleText(month, dobVal[1].trim());
		selectDropdownValueByVisibleText(year, dobVal[2].trim());
		
		printDropDownListValues(month);
		
		
		
	
		
	}
	
	public static void selectDropdownValueByVisibleText(WebElement element, String value)
	{
		//htmltag = select
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectDropDownValueByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	//Printing all the values frm dropdown
	public static void printDropDownListValues(WebElement element)
	{
		
		Select select = new Select(element);
		List<WebElement> list = select.getOptions();
		System.out.println("Values Present in dropdown are - " + list.size());
		for(int i=1;i<list.size();i++)
		{
			String listValue = list.get(i).getText();
			System.out.println(listValue);
		}
	}
}

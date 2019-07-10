package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStapDropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement listClick = driver.findElement(By.xpath("//div[@id='msdd']"));
		
		List<WebElement> langList = driver.findElements(By.xpath("//ul[@class='ui-autocomplete "
				+ "ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
		//listClick.clear();
		langList.size();
	/*	for(int i=0;i<langList.size();i++)
		{
			
			System.out.println(langList.get(i).getText());
		}*/
		

	}

}

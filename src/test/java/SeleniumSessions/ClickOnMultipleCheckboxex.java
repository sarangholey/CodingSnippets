package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnMultipleCheckboxex {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\drivers\\chromedriver.exe");
		// Setting up browser driver path
		
		driver = new ChromeDriver();
		// Upcasting and creating the ChromeDriver class
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//input[@type='checkbox']
		//input[contains(@id,'checkbox')]
		clickOnCheckBoxes("//input[@type='checkbox']", "Hockey", "Hockey");
		
		

	}
	
	public static void clickOnCheckBoxes(String xpathList,String CheckboxTextXpath ,String checkBoxNameContent)
	{
		List<WebElement> mltiChebox = driver.findElements(By.xpath(xpathList));
		WebElement mltiCheboxName = driver.findElement(By.xpath("//label[contains(text(),'"+CheckboxTextXpath+"')]"));
		String nameOfCheckBox = mltiCheboxName.getText();
		System.out.println(nameOfCheckBox);
		for(int i=0; i<mltiChebox.size();i++)
		{
			if(nameOfCheckBox.contentEquals(checkBoxNameContent))
			
				mltiChebox.get(i).click();
				break;
			
			
			
			
			/*
			 * for(int j=0;j<validCheckboxname.size();j++) { String name =
			 * validCheckboxname.get(j); System.out.println(name);
			 * if(validCheckboxname.get(j).equalsIgnoreCase(checkBoxName))
			 * mltiChebox.get(i).click(); }
			 */
			
		}
	}

}

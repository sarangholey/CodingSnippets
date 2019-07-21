package Scenarios.FlipkartSortProducts.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Scenarios.FlipkartSortProducts.Base.BasePage;

public class Po_flipkartHomePage extends BasePage
{
	WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Flipkart']")
	WebElement flipkartLogo;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement signUpPopUp;
	
	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;
	
	//List<WebElement> listOfCommodity = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	
	public Po_flipkartHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, Po_flipkartHomePage.class);
	}
	
	public void closeSignUpPopUp()
	{
		
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(signUpPopUp)).click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean websiteLogoIsDisplayed()
	{
		return flipkartLogo.isDisplayed();
	}
	
	public void searchProduct(String productName)
	{
		
		searchBox.sendKeys(productName);
		searchButton.click();
	}
	
//	public List<String> listOfCommodity()
//	{
//		List<String> listOfCommodityText = new ArrayList<String>();
//		for(int i=0;i<listOfCommodity.size();i++)
//		{
//			listOfCommodityText.add(listOfCommodity.get(i).getText());
//		}
//		return listOfCommodityText;
//	}
	
	
}


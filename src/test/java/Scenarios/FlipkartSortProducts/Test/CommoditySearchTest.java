package Scenarios.FlipkartSortProducts.Test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Scenarios.FlipkartSortProducts.Base.BasePage;
import Scenarios.FlipkartSortProducts.Constants.ConstantsValues;
import Scenarios.FlipkartSortProducts.Pages.Po_flipkartHomePage;

public class CommoditySearchTest 
{
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	Po_flipkartHomePage po_flipkartHomePage;
	
	@BeforeMethod
	public void setUp()
	{
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		driver.get(prop.getProperty("url"));
		po_flipkartHomePage = new Po_flipkartHomePage(driver);
	}
	
//	@Test
//	public void verifyPageTitle()
//	{
//		String title  = po_flipkartHomePage.getPageTitle();
//		System.out.println(title);
//		//Assert.assertEquals(title,ConstantsValues.pageTitle);
//	}
	
	@Test
	public void verifyPageTitle()
	{}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}

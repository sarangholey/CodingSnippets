package SeleniumSessions.ScreenshotOfFailedTestCaes;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class ScreenShotTest extends BaseTest
{

	@BeforeMethod
	public void setup()
	{
		initilization();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void testCase1()
	{
		driver.get("https://www.google.com");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void testCase2()
	{
		driver.get("https://www.facebook.com");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void testCase3()
	{
		driver.get("https://www.flipkart.com");
		Assert.assertEquals(true, true);
	}
	
	
}

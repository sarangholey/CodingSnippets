package SeleniumSessions.RetryLogicFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MyTest {


//	@Test(retryAnalyzer = SeleniumSessions.RetryLogicFailedTestCases.RetryAnalyser.class)
//	public void Test1()
//	{
//		Assert.assertEquals(false, true);
//	}
	
	@Test
	public void Test()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(true, true);
	}
	
	
}

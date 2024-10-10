package framework;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testlisteners
{
	@Test
	public void login()
	{
		System.out.println("login");
		Assert.assertEquals(false, false);
	}
	
	
	@Test
	public void logout()
	{
		System.out.println("logout");

		Assert.assertEquals(false, true);
	}
	@Test(dependsOnMethods = "logout")
	public void closebrowser()
	{
		System.out.println("closebrowser");

		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	public void output(ITestResult r)
	{
		int status=r.getStatus();
		if(status==ITestResult.SUCCESS)
		{
			System.out.println("Test sucess or pass");
		}
		else if(status==ITestResult.FAILURE)
		{
			System.out.println("Test Failed");
		}
		else if(status==ITestResult.SKIP)
		{
			System.out.println("Test skipped");
		}
			
	}
	
}
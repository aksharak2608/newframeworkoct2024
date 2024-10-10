package day2;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tryex2 {

	
	 
	@Test(dataProvider="test")
	public void abac(int a, String name)
	{
			System.out.println(a);
			System.out.println(name);
		System.out.println("hello");
		//assertTrue(false);
		
	}
	
	@Test
	public void abac1()
	{
		System.out.println("hello1");
		
	}
	@BeforeMethod
	public void printclass()
	{
		
		System.out.println(this.getClass().getSimpleName());
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	
	@DataProvider(name="test")
	public static Object[][] data(){
		
		Object[][] obj= new Object[][] {{1,"ravi"},{2,"sita"},{3,"githa"}};
		
		return obj;
		
	}
	
	
	
}
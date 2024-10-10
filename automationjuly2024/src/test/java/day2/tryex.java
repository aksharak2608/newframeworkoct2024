package day2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tryex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	int a[]= {1,2,3};
	System.out.println(a[2]);
	final int a1=5;
	int b1=2;
	try {
		int c=a1/b1;
		System.out.println(c);
	}
	catch (ArithmeticException e) {
		System.out.println(e+"b1 value is 0 and we can not divide a number with 0");
		// TODO: handle exception
	}
	}

	@Test
	public void abac()
	{
		System.out.println("hello");
		
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
	
	
	
}
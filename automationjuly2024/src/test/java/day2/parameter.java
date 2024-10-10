package day2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	
	@Parameters({"number","name"})
  @Test
  public void f(String number, String name) {
	  System.out.println("test");
	  int a=Integer.parseInt(number);
	  System.out.println(++a);
	  
	  System.out.println(name);
  }
}

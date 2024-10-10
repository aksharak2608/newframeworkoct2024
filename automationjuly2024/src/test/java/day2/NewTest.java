package day2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void launch() {
	  System.out.println("f1");
	  System.out.println(Thread.currentThread().getPriority());
	  assertEquals(false, null);
  }
  @Test(dependsOnMethods ="launch" )
public void login() {
	  System.out.println("f2");
	  System.out.println(Thread.currentThread().getPriority());
  }
  @Test
public void f3() {
	  System.out.println("f3");
	  System.out.println(Thread.currentThread().getPriority());
}
}

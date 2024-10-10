package day2;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groups {
  @Test
  public void f1() {
	  
	  System.out.println("f1");
  }
  @Test
  public void f2() {
	  System.out.println("f2");
  }
  @Test(dependsOnGroups = "g2", enabled = false)
  public void f3() {
	  System.out.println("f3");
	  
  }
  @Test(dependsOnMethods = "f7")
  public void f4() {
	  System.out.println("f4");
  }
  @Test(groups = {"g1","g2"})
  public void f5() {
	  System.out.println("f5");
  }
  @Test(groups = "g1")
  public void f6() {
	  System.out.println("f6");
  }
  @Test(dependsOnGroups = "g1")
  public void f7() {
	  System.out.println("f7");
	  Assert.assertEquals(false, null);
  }
  @Test(groups = "g1")
  public void f8() {
	  System.out.println("f8");
	  Assert.assertEquals(false, null);
  }
  @BeforeGroups("g1")
  public void f9() {
	  System.out.println("before groups");
	  
  }
  @AfterGroups("g1")
  public void f91() {
	  System.out.println("After groups");
  }
}

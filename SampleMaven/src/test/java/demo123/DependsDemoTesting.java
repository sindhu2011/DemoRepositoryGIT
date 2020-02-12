package demo123;

import org.testng.annotations.Test;

public class DependsDemoTesting {
  @Test (priority=2, dependsOnMethods="m1")
  public void flipkart()
  {
	  System.out.println("code for login to flipkart");
  }
  @Test 
  public void m1()
  {
	  int a=10;
	  int b=0;
	  int c=a/b;
	  System.out.println("the final values are : " +c);
  }
  @Test (priority=1)
  public void flipkartReg()
  {
	  System.out.println("code for registration flipkart");
  }
}

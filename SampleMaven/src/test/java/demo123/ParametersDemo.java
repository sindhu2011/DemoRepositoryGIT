package demo123;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
  @Parameters({"tester","location"})
  @Test
  public void primeMembership(String tester,String location) 
  {
	System.out.println("code for primeMembership");
	System.out.println("it is executed by : "+ tester);
	System.out.println("its executed from : " + location);
  }
  @Test
  public void renewal()
  {
	  System.out.println("code for renewal");
  }
  @Parameters({"tester","location"})
  @Test
  public void termination(String tester,String location) 
  {
	System.out.println("code for termination");
	System.out.println("it is terminated by : "+ tester);
	System.out.println("its terminated from : " + location);
  }
}

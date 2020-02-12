package demo123;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
  @Test
  public void login()
  {
	  System.out.println("some 5 lines of code for login");
  }

  @BeforeMethod
  public void launch()
  {
	  System.out.println("some 3 lines of code for launching");
  }
  @Test
  public void register()
  {
	  System.out.println("some 20 lines of code for registration");
  }
  @AfterMethod
  public void closing()
  {
	  System.out.println("some 15 lines of code for closing");
  }
  @BeforeClass
  public void clear()
  {
	  System.out.println("some 23 lines of code for clear");
  }
  @AfterClass
  public void delete()
  {
	  System.out.println("some 16 lines of code for delete");
  }
  @BeforeTest
  public void browserconfig()
  {
	  System.out.println("some 25 lines of code for browserconfig");
  }
  @AfterTest
  public void browserdeconfig()
  {
	  System.out.println("some 24 lines of code for browserdeconfig");
  }
  
}

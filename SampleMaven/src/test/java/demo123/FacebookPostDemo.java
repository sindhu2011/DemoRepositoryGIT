package demo123;

import org.testng.annotations.Test;

public class FacebookPostDemo {
  @Test (groups= {"sanity","regression"})
  public void login() {
	  System.out.println("code for login");
  }
  @Test (groups= {"regression"})
  public void registration() {
	  System.out.println("code for registration");
  }
  @Test (groups= {"sanity"})
  public void sanity() {
	  System.out.println("code for sanity");
  }
}

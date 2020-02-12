package demo123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest5165 {
 
	  @Test(dataProvider = "credentials")
	  public void f(String name, String password) 
	  {
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://172.31.36.202:443/TestMeApp/login.htm");
		  	  System.out.println("the username this time is: " + name);
		  	  System.out.println("the password this time is: " + password);
		  	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(name);
		  	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password); 
		  	  
		  	  WebElement a = driver.findElement(By.name("Login"));
		  	  a.click();
		  	  String E_title = "Home";
		  	  String A_title = driver.getTitle();
		  	  Assert.assertEquals(A_title, E_title);	  
		  	  }
		    @DataProvider
		    public Object[][] credentials() {
		      return new Object[][] {
		        new Object[] { "Lalitha", "Password123" },
		        new Object[] { "Purba", "Password123" },
		      };
		    }
  }

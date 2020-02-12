package demo123;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class DemoWebShopRegister {
  @Test(dataProvider = "dp")
  public void f(String fn, String ln , String em , String pwd , String conpwd) throws InterruptedException {
	  WebDriver driver ;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("http://demowebshop.tricentis.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
	  WebElement fname = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
	  fname.sendKeys(fn);
	  WebElement lname = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
	  fname.sendKeys(ln);
	  WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
	  fname.sendKeys(em);
	  WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
	  fname.sendKeys(pwd);
	  WebElement confirm_pwd = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
	  fname.sendKeys(conpwd);
	  driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Yogi","Dewangan","yogi@gmail.com","yogi@123","yogi@123" },
      new Object[] { 2, "Sindhu","Patro","sindhu@gmail.com" , "sindhu@123","sindhu@123" },
      new Object[] { 3, "Mounika","Sai","mounika@gmail.com","mounika@123","mounika@123" },
    };
  }
}

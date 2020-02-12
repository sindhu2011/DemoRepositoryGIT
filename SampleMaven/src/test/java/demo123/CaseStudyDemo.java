package demo123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CaseStudyDemo 
{
  @Test (dataProvider="dp" , priority=4 , enabled=false)
  public void Testpayment(String name , String pwd) throws InterruptedException
  {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(name);
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
	  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	  Thread.sleep(2000);
	  WebElement wb= driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a"));
	  wb.click();
	  Thread.sleep(2000);
	 // Actions act=new Actions(driver);
	  //act.sendKeys(Keys.DOWN).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
	  WebElement wb1=driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"));
	  wb1.click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"swit\"]/div[2]/div/label/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123457");
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@457");
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@457");
	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	  
	 // act.moveToElement(wb1).build().perform();
	  
  }
  @DataProvider
  public Object[][] dp() {
	  return new Object[][] {
		  new Object[] {"lalitha","password123"},
	  };
  }
  
  @Test (priority=3,enabled=false)
  public void testCart() throws InterruptedException
  {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	  Thread.sleep(2000);
	  WebElement wb= driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a"));
	  wb.click();
	  Thread.sleep(2000);
	 // Actions act=new Actions(driver);
	  //act.sendKeys(Keys.DOWN).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
	  WebElement wb1=driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"));
	  wb1.click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  Thread.sleep(2000);
  }
  @Test(priority=1,enabled=true)
  public void testRegistration() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	  WebDriver driver;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("sindhu");
	  WebElement reg=driver.findElement(By.xpath("//*[@id=\"err\"]"));
	  String Name_ActualValue=reg.getText();
	  String Name_ExpectedValue="Available";
	  Assert.assertEquals(Name_ExpectedValue, Name_ActualValue);
//	  if (Name_ExpectedValue.equalsIgnoreCase(Name_ActualValue))
//	  {
//		  System.out.println("User can proceed further");
//	  }
//	  else
//	  {
//		  System.out.println("Username already exists.");
//	  }
	  //String Name_ExpectedValue="Actual";
	  WebElement firstname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
	  firstname.sendKeys("sindhuja");
	  WebElement lastname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	  lastname.sendKeys("patro");
	  WebElement pwd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	  pwd.sendKeys("sindhu123");
	  WebElement conf_pwd=driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]"));
	  conf_pwd.sendKeys("sindhu123");
	  WebElement gender=driver.findElement(By.xpath("//*[@id=\"gender\"]"));
	  gender.click();
	  WebElement email=driver.findElement(By.xpath("//*[@id=\"emailAddress\"]"));
	  email.sendKeys("sindhu@gmail.com");
	  WebElement number=driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]"));
      number.sendKeys("8984690535");
	  WebElement dob=driver.findElement(By.xpath("//*[@id=\"dob\"]"));
	  dob.sendKeys("05/31/1996");
	  WebElement address=driver.findElement(By.xpath("//*[@id=\"address\"]"));
	  address.sendKeys("hyderabad");;
	  WebElement security_que=driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]"));
	  Actions act=new Actions(driver);
	  Select se=new Select(security_que);
	  se.selectByIndex(2);
	  driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("dog");
	  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();  
  }
     @Test(priority=2,enabled=false)
     public void LoginTest() throws InterruptedException {

   	  WebDriver driver;
   	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
   	  driver=new ChromeDriver();
   	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
   	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
   	  Thread.sleep(2000);
   	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
   	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
   	  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
   	  Thread.sleep(2000);
     }
     
  }



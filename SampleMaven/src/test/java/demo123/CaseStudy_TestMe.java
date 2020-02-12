package demo123;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CaseStudy_TestMe {
 
	
	  @BeforeMethod
	  public void TestME_url() {
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  }
	
	  @Test (priority = 1)
     public void Registration() throws InterruptedException {
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
//		  if (Name_ExpectedValue.equalsIgnoreCase(Name_ActualValue))
//		  {
//			  System.out.println("User can proceed further");
//		  }
//		  else
//		  {
//			  System.out.println("Username already exists.");
//		  }
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

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeTest
  public void startReport(String OS, String browser) {
	    ExtentHtmlReporter htmlReporter;
	    ExtentReports extent;
	    //helps to generate the logs in test report.
	    ExtentTest test;
	    htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport_Sindhu.html");
	    extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        htmlReporter.config().setDocumentTitle("Extent Report Demo by Sindhu");
        htmlReporter.config().setReportName("Test Report for Demo");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
  }

  @AfterTest
  public void afterTest() {
  }

}

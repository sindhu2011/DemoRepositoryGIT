package demo123;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportListener {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
 // @Parameters({"OS" , "browser"})
  @BeforeTest
  public void startReport()
  {
	  htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+("/test-output"));
	  extent=new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  htmlReporter.config().setDocumentTitle("");
  }
}

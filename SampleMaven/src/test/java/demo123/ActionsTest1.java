package demo123;

import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest1 {
  @Test (enabled = false)
  public void f() throws InterruptedException 
  {
	  WebDriver driver ;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("https://www.google.com");
	  WebElement wb=driver.findElement(By.name("q"));
	  //wb.sendKeys("accenture");
	  Actions act=new Actions(driver);
	  act.keyDown(wb,Keys.ALT).sendKeys("accenture").keyUp(Keys.ALT).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }
  
  @Test (enabled = false)
  public void f1() throws InterruptedException
  {
	  WebDriver driver ;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("https://www.spicejet.com/default.aspx");
	  //WebElement wb=driver.findElement(By.name("q"));
	  Thread.sleep(3000);
	  WebElement e1=driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"));
	  Actions a2=new Actions(driver);
	  a2.moveToElement(e1).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
	  //a[@id='highlight-addons']
  }
  @Test (enabled = false)
  public void rightclick() throws InterruptedException
  {
	  WebDriver driver ;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("http://google.com");
	  Thread.sleep(3000);
	  WebElement e3=driver.findElement(By.xpath("//a[text()='Gmail']"));
	  Actions a3=new Actions(driver);
	  a3.contextClick(e3).build().perform();
	  
  }
  
	
	  @Test (enabled = false)
	  public void doubleclick() throws InterruptedException 
	  { 
		  WebDriver driver ;
		  driver=DriverClass.getDriver("CRM");
	      driver.get("http://demowebshop.tricentis.com/");
	      Thread.sleep(3000);
	    WebElement e2=driver.findElement(By.xpath("//*[@id=\"newsletter-subscribe-block\"]/span"));
	    Actions a4=new Actions(driver);
	    a4.doubleClick(e2).build().perform();
	    String sr = e2.getText();
	    System.out.println(sr);
	    
	  }
	  @Test 
	  public void dnd() throws InterruptedException 
	  { 
		WebDriver driver ;
		driver=DriverClass.getDriver("CRM");
	    driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement source=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
	    WebElement dest=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[2]"));
	    Actions a4=new Actions(driver);
	    a4.dragAndDrop(source, dest).build().perform();
	    WebElement w1= driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[2]"));
	    String A_val=w1.getText();
        String E_val="$3999";
        Assert.assertEquals(A_val, E_val);
	    System.out.println("Drag and Drop is success");
	    
	    
	  }
	 
}

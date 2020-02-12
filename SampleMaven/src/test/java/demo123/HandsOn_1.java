package demo123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandsOn_1 {
  @Test (enabled=false)
  public void computer() throws InterruptedException 
  {
	  WebDriver driver ;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("http://demowebshop.tricentis.com/");
	  Thread.sleep(3000);
	  WebElement wb=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	  Actions act=new Actions(driver);
	  act.keyDown(wb,Keys.ALT).sendKeys("computer").keyUp(Keys.ALT).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }
  @Test (enabled=false)
  public void TestMe() throws InterruptedException 
  {
	  WebDriver driver ;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span")).click();
	  Thread.sleep(2000);
	  WebElement wb=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	  wb.click();
	  Actions act=new Actions(driver);
	  act.moveToElement(wb).perform();
	  WebElement sub=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a"));
	  sub.click();
	  Thread.sleep(2000);
	  driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
	  String address;
	  address=driver.findElement(By.xpath("//[@id=\"demo3\"]")).getText();
	  System.out.println(address);
	  driver.switchTo().defaultContent();
	  //act.moveToElement(sub).perform();
	  //String city=sub.getText();
	 // System.out.println("The text is: "+city);
	  //WebElement wb1=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span"));
  }
  
  @Test (enabled=false)
  public void Naukri() throws InterruptedException
  {
	  WebDriver driver ;
	  driver=DriverClass.getDriver("CRM");
	  driver.get("https://www.naukri.com/");
	  Thread.sleep(3000);
	  String text= driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div/h3")).getText();
	  System.out.println(text);  
  }
  
  
}

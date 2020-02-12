package demo123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass {
	public static WebDriver getDriver(String br)
    {
        // TODO Auto-generated method stub
        if(br.equals("CRM"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
            return new ChromeDriver();        
        }
        else if(br.equals("IEE"))
        {
            System.setProperty("webdriver.ie.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
            return new InternetExplorerDriver();        
        }
        else if(br.equals("FF"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\geckodriver.exe");
            return new FirefoxDriver();        
        }
        else
        {
            return null;
        }
    }
}

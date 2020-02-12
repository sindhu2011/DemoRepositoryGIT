package demo123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelDemo {
  @Test
  public void f() throws IOException 
  {
	  WebDriver driver;
	  File myfl = new File("C:\\Users\\H2_9_19_User30\\Desktop\\SeleniumData.xlsx");
	  FileInputStream fis=new FileInputStream(myfl);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(0);
	  int rows=sh.getLastRowNum();
	  for (int i=1;i<=rows;i++)
	  {
		  String u_name= sh.getRow(i).getCell(0).getStringCellValue();
		  String pwd= sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("username this time : "+ u_name);
		  System.out.println("password this time : "+ pwd);
		 // String A_txt=driver.findElement(By.xpath("")).getTitle();
		  sh.getRow(0).createCell(2).setCellValue("Result");
		  sh.getRow(i).createCell(2).setCellValue("Login Success");
		  FileOutputStream fout= new FileOutputStream (new File("C:\\Users\\H2_9_19_User30\\Desktop\\SeleniumData.xlsx"));
		  wb.write(fout);
	  }
	  wb.close();
  }
}

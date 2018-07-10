import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.jdt.internal.compiler.lookup.MethodBinding;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	private void medhd() 
	{
	}
		@Test
		public void read() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		File fs= new File("‪C:\\Users\\cubic\\Desktop\\exe.xlsx");
		FileInputStream fis=new FileInputStream(fs);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet xs=wb.getSheet("Sheet1");
		for(int i=1;i<=xs.getLastRowNum();i++)
		{
		XSSFCell xc=xs.getRow(i).getCell(0);
		if(xc.getCellType()==XSSFCell.CELL_TYPE_STRING)
		{
		System.out.println(xc);
		driver.findElement(By.name("identifier")).sendKeys(xc.getStringCellValue());
		}
		else
		{
		    double d=	xc.getNumericCellValue();
		    String s=String.valueOf((int)d);
		    
		    System.out.println(s);
		    
		    driver.findElement(By.name("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(s);
		}
		Thread.sleep(2000);
		driver.findElement(By.name("//*[@id=\"passwordNext\"]/content/span")).clear();
		xs.getRow(1).createCell(2).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("‪C:\\Users\\cubic\\Desktop\\exe.xlsx");
		wb.write(fos);
		fos.close();
		}

		}
		

		
	}
	



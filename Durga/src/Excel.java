
	import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

public class Excel
{
	    @Test
		public void Exe() throws Exception
		{
	    	
	    	System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://github.com/login");
			
			File f =new File("‪C:\\Users\\cubic\\Desktop\\exe.xlsx");
			FileInputStream fis =new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			XSSFCell cell;
			int i;
			for(i=1;i<=sh.getLastRowNum();i++)
			{
				System.out.println(sh.getLastRowNum());
			cell=sh.getRow(i).getCell(0);
			System.out.println("1st data "+cell);
		
			
			if(cell.getCellType()==cell.CELL_TYPE_STRING)
			{
			driver.findElement(By.id("login_field")).sendKeys(cell.getStringCellValue());
			}
			else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			{
				int s= (int) cell.getNumericCellValue();
				driver.findElement(By.id("login_field")).sendKeys(String.valueOf(s));

			}
			cell=sh.getRow(i).getCell(1);
			System.out.println("2nd data "+cell);

			driver.findElement(By.id("password")).sendKeys(cell.getStringCellValue());
			}

		}
		
	}



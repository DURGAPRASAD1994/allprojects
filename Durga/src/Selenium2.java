import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium2
{
	@Test
	public void Exe() throws Exception
	{
		FileInputStream fis =new FileInputStream("http://webmail.cubicitsolution.co.in/logout/?locale=en");
		XSSFWorkbook Wb =new XSSFWorkbook(fis);
		XSSFSheet sh =Wb.getSheet("sheet1");
		XSSFCell cell;
		int i;
		for(i=1;i<sh.getLastRowNum();i++);
		{
			System.out.println(sh.getLastRowNum());
			cell=sh.getRow(i).getCell(0);
			System.out.println("1st data"+cell);
			System.setProperty("webdriver.chrome.driver", "D:\\Durga Selenium\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://accounts.google.com");
			if(cell.getCellType()==cell.CELL_TYPE_STRING)
			{
				driver.findElement(By.id("User")).sendKeys(cell.getStringCellValue());
			}
			
			else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			{
			int a =(int)cell.getNumericCellValue();
			driver.findElement(By.id("User")).sendKeys(String.valueOf(a));
			cell=sh.getRow(i).getCell(1);
			System.out.println("2nd data"+cell);
			if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			{
				int s=(int)cell.getNumericCellValue();
				driver.findElement(By.id("pass")).sendKeys(String.valueOf(a));
				driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
				Thread.sleep(2000);
			}
				else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
				{
					int s =(int) cell.getNumericCellValue();
					driver.findElement(By.id("pass")).sendKeys(String.valueOf(s));
					   driver.findElement(By.xpath("//*[@id='login_submit']")).click();
					    Thread.sleep(2000);
					}
	              //  driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
				  //  driver.findElement(By.xpath("//*[@id='login_submit']")).click();
				   // Thread.sleep(2000);
				    FileOutputStream fos=new FileOutputStream("D:\\Harish\\POI\\exceldata\\excelex.xlsx");
				    try
				   {
				    WebElement e=driver.findElement(By.xpath("//*[@id='lnkHeaderLogout']"));
				    if(e.isDisplayed())
				    {
				     e.click();
			         sh.getRow(i).createCell(2).setCellValue("pass");
			         sh.write(fos);
			        }
				   }
				   catch(Exception e)
				   {
					sh.getRow(i).createCell(2).setCellValue("Fail");
					sh.write(fos);
				   }
				  driver.close();
	             }			
	        }
	}

				
			
			
			
			
			}
			
		}
		
	}
	
		
	



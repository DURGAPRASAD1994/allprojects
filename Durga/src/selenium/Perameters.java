package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perameters {
	@Test
	public void frames()
	{
		
    	System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/Durga%20Selenium/HtmlTask1/WebContent/frames.html");
		
		java.util.List<WebElement> list = driver.findElements(By.tagName("frame"));
		
		
		int i=0;
		while(i<list.size())
		{
		try
		{

		    driver.switchTo().frame(i);
		    
	WebElement ele=	driver.findElement(By.xpath("/html/body/button"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	ele.click();
        if(ele.isDisplayed())
		      {
		              System.out.println("The element is found in Frame " + i +"Frame" );
		      }
		        else	   
		         {
		              System.out.println("The element is not found in  " + i + "Frame");
		         }
		}
		catch(Exception e)
		    {
		System.out.println("Element is not found in :  " + i + " Frame");
		}
		driver.switchTo().defaultContent();

		i++;
		
		 }
		
		
	}
}



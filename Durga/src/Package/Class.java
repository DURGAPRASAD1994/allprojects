package Package;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("\"webdriver.chrome.driver\",\"D:\\\\Durga Selenium\\\\chromedriver.exe\"", null);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
	    driver.navigate().forward();
        Thread.sleep(2000);	
        driver.navigate().back();
        driver.quit();
        

		
		
		
	}

}

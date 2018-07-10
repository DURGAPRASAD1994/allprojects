package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 
{
	private static final By By = null;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("ch.durgaprasad012@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("333143");
		driver.findElement(By.xpath("//*[@id=\"u_0_3\"]")).submit();
		
		
		
		
	}
	

}

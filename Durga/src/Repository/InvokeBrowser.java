package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser
{
	 static WebDriver driver;
public static void browser()
{
	System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://github.com/login");
}
public static void clo()
{
	driver.close();
}
}
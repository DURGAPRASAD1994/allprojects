import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Durga1 
{
	public static void main (String[]args)
	{
		int i=1;
		while(i<=2)
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Durga Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("harshag6@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("gowthamharsha");
		driver.findElement(By.id("u_0_2")).click();
		driver.get("https://accounts.google.com");
		i++;
		}
	}
	}
	



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Perameter {
	public WebDriver driver;

	  @Parameters("browser")

	  @BeforeTest


	  public void beforeTest(String browser) 
	  {


	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Durga Selenium\\chromedriver.exe");
		  driver = new FirefoxDriver();


	  }else if (browser.equalsIgnoreCase("Chrome")) 
	  { 


		  System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 

	  } 


	  driver.get("https://accounts.google.com/ServiceLogin/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");

	  }


	  @Test public void login() throws InterruptedException {

		  driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/content/form/div[1]/div/div[1]")).sendKeys("ch.durgaprasad012@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input//*")).sendKeys("94415645");
		    driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();

		}  

	  @AfterClass public void afterTest()
	  {


		}

	}



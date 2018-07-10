package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe" );
		WebDriver durga = new ChromeDriver();
		durga.get("https://www.amazon.in/");
		durga.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		durga.manage().window().maximize();
		
		System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe" );
		WebDriver durga1 = new ChromeDriver();
		durga.get("https://www.flipkart.com/?gclid=CjwKCAjw6djYBRB8EiwAoAF6oYW3e7YfciM81d1wIml2Fv852N2gAcunMcgTUSHZk77vqxD6dDwLcxoCeJkQAvD_BwE&semcmpid=sem_8024046704_brand_eta_goog&s_kwcid=AL!739!3!260704327909!e!!g!!flipkart&ef_id=Wqd6mQAAAM5PsFLW:20180605080253:s");
		durga.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		durga.manage().window().maximize();

		System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe" );
		WebDriver durga2 = new ChromeDriver();
		durga.get("https://www.snapdeal.com/offers/deal-of-the-day?utm_source=earth_brand_new&utm_campaign=BrandCat&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=e,snapdeal&utm_source=earth_brand_new&utm_campaign=brandcat_roas&utm_content=29617386122");
		durga.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		durga.manage().window().maximize();
		
		durga.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/section/div/span[2]/span[1]/a")).click();
		
		durga.close();
		
	
		
		{
		
		
			
		
		
		
	}
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}
}
		
		
		
		
		
		
	



		
		
		
	
	
			
	
	
		
		
	

			
			
		
		
	



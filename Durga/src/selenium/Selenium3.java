package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Durga Selenium\\chromedriver.exe" );
		WebDriver durga = new ChromeDriver();
		durga.get("https://www.google.com/");
		Thread.sleep(500);
		{
		durga.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=7c132c03-9b10-4d7a-a05d-0913001315b5&ie=UTF8");
		Thread.sleep(3000);
		{
		durga.get("https://www.google.co.in/search?q=flipkart&oq=flipkart&aqs=chrome..69i57j69i60l3j0l2.2972j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(4000);
		{
		}
		durga.get("https://www.google.co.in/search?q=flipkart&oq=flipkart&aqs=chrome..69i57j69i60l3j0l2.2972j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(5000);
		durga.close();
		
		
	}

}
	}
}

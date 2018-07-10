package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InspectElements extends InvokeBrowser
{
  static By email= By.xpath("//*[@id=\"login_field\"]");
 static By pwd = By.xpath("//*[@id=\"password\"]");
  
  public static WebElement mail()
  {
	 return driver.findElement(email);
	
  }
  public static WebElement pwd()
  {
	 return driver.findElement(pwd);
  }
}

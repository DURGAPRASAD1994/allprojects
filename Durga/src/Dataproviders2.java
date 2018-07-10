import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataproviders2 {
	@Test(timeOut="Getdata")
	public void setData(String username, String password)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
	}

	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="ch.durgaprasad012@gmail.com";
	data[0][1] = "abcdef";

	// 2nd row
	data[1][0] ="dfsdgfdsgf";
	data[1][1] = "0123";
	
	// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "pass123";

	return data;
	}
}

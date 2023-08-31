package Day14;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgworking {
	
	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("1 Browser Launched");
	}

	@AfterTest
	public void closebrowser()
	{
		System.out.println("5 Browser Closed");
	}
	
	@BeforeMethod
	public void deletecookies()
	{
		System.out.println("2 Cookies deleted");
	}
	
	@Test
	public void loginvalidations()
	{
		System.out.println("3 Test case for login is validated ");
	}
	
	@AfterMethod
	public void generatereport()
	{
		System.out.println("4 Report Genearated");
	}
}

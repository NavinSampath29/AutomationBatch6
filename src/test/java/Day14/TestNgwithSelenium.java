package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgwithSelenium {
	
	WebDriver driver ;
	
	@BeforeTest
	public void intilizebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void geturl()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginvalidation()
	{
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void logincheck() {
		String url = "https://www.saucedemo.com/inventory.html";
		String cururl = driver.getCurrentUrl();
		if(url.equals(cururl))
		{
			System.out.println("Yu have logged in sucess");
		}
		else
		{
			System.out.println("Login Failure");
		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}

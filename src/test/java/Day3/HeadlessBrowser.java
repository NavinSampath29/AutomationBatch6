package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		// Service Based company - Client is coming and asking u to do autoamtion testing for their website 
		
		// He should not see anything visible but he needs results 
		
		// Headless Browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.saucedemo.com/");
		
		//  CSS Selector
		
		// Tagname[attribute name = 'Attribute value'];
		
		WebElement username = driver.findElement(By.cssSelector("input[id='user-name']"));
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement login = driver.findElement(By.cssSelector("input[data-test='login-button']"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
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

}

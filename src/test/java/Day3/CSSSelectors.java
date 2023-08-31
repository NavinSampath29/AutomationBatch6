package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");
		
		//  WebDriver is an interface 
		
		// We cant create an object for interface 
		
		// We are creating an object for chrome driver class and refering to the webdriver interface 
		
		WebDriver driver = new ChromeDriver();
		
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

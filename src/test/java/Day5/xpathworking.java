package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathworking {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// Relative xpath 
		
		// Using contains
		
			// //TAGNAME[contains(@Attributename , 'AttributeValue')]
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		// Using text 
		
			// //TAGNAME[text() = 'text']
		
			//a[text() = 'LinkedIn']
		
		WebElement link = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		link.click();
		
		
	}

}

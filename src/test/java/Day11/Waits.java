package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		
		//  Wait 
		
		// Two types of wait 
		
		// Implicit wait 
		
		// Explicit wait 
		
		//  Implicit Wait - Will wait for a period of time before it throws no such element expection 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		

		WebElement link = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		link.click();
		
		
	}

}

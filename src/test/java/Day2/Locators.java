package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		// Locators - which is used to find out web element 
		// Diffrent types of locators [are coming from By class]
		
		// ID = user-name
		// Name = password
		// Linktext = LinkedIn
		// Partial Link Text = Twi
		// Classname 
		// CSS selector 
		// Xpath
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		String un = "standard_user" ;
		String pwd = "secret_sauce" ;
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		//WebElement linkin =  driver.findElement(By.linkText("LinkedIn"));
		//linkin.click();

		WebElement twiter = driver.findElement(By.partialLinkText("Twi"));
		twiter.click();
		
		driver.close();
		
		//driver.quit();
	}

}

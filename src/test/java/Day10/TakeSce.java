package Day10;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSce {

	public static void main(String[] args) throws IOException {
		
		// Take Screen SHot Interface
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		
		// Source 
		
		// Destination 
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		String currenttab = driver.getWindowHandle();
		
		WebElement link = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		link.click();
		
		File Source = ss.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\target\\tc.png");

		
		FileHandler.copy(Source, dest);
		
	}

}

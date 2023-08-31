package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//  WIndows Handling - Handling the tabs (windows)
		
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
		
		String currenttab = driver.getWindowHandle();
		
		WebElement link = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		link.click();
		
		// We are going to switch to the tabs using index
		
		Set<String> allwin =  driver.getWindowHandles();
		
		// As we dont have indexing or get method in set we are going to convert this set
		
		// Into a array list inorder to get the index
		
		List<String> setofwindows = new ArrayList<String>(allwin);
		
		String newtab1 = setofwindows.get(1);
		
		// In oder to switch the tab
		
		driver.switchTo().window(newtab1);
		
		Thread.sleep(5000);
		
		driver.close();
		
		driver.switchTo().window(currenttab);
		
		
	}

}

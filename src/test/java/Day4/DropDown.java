package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		
		// Select class to handle drop down 
		
		WebElement filter = driver.findElement(By.cssSelector("select[data-test='product_sort_container']"));

		Select s = new Select(filter);
		
		List<WebElement> p = s.getOptions();
		
		for(WebElement q : p) 
		{
			System.out.println(q.getText());
		}
		
		// Select by index 
		
		// s.selectByIndex(2);
	 
		// Select by visible text 
		
		// s.selectByVisibleText("Price (high to low)");
		
		// Select by value 
		
		s.selectByValue("lohi");
		
	}

}

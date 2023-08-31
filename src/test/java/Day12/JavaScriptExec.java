package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.page.model.NavigatedWithinDocument;

public class JavaScriptExec {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// Javascript executor is a interface
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		
		password.sendKeys("secret_sauce");
		
		js.executeScript("arguments[0].click()",login );
		
		// Javasript we cn scroll to the last 
		
		// we can scroll to the partiulcar web element 
		
		WebElement at = driver.findElement(By.xpath("//button[contains(@id ,'add-to-cart-sauce-labs-fleece-jacket')]"));
		
		// js.executeScript("arguments[0].scrollIntoView(true)", at);
		
		js.executeScript("window.scrollTo(0,700)");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}

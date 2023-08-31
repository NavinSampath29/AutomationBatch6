package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static void main(String[] args) {
		
		// Selenium : Is JAR file which is developed in the basis of Java by a company called thoughtworks 
		
		// Selenium is used to automate web applications starting with HTTPS
		
		//  Selenium is an open source  // It is avilable for free 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");
		
		//  Webdriver - Webdriver is a interface 
		
		// Chrome driver // Ie Driver // Safari Driver // Edge driver [Class]
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// To Maximize 
		
		driver.manage().window().maximize();
		
		//  To Minimize 
		
			driver.manage().window().minimize();
			
		
			// To Maximize 
		
				driver.manage().window().maximize();
				// to get the title 
				
				String titile =	driver.getTitle();
				System.out.println(titile);
				
				// to get the url 
				
			String url =	driver.getCurrentUrl();
			System.out.println(url);
		
				// To Close 
				
				driver.close();
				
				
			
		
		
		
		 

	}

}

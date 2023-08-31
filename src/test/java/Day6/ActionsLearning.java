package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsLearning {

	public static void main(String[] args) {
		
		// Actions Class - To perform right click drag and drop actions we will
		// be using actions class 
		// Actions class is an inbuild class in Selenium 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		Actions a = new Actions(driver);
		
		//  right click - context click 
		
		a.contextClick(rightclick).build().perform();
		
		List<WebElement> li = driver.findElements(By.xpath("//ul[contains(@class , 'context-menu-list context-menu-root')]/li"));
		
		for(WebElement e : li)
		{
			System.out.println(e.getText());
			
			if(e.getText().equals("Paste"))
			{
				e.click();
				break;
			}
		}
		
		driver.switchTo().alert().accept();
		
	}

}

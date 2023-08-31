package Day7;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions a = new Actions(driver);
		
	List<WebElement> drag =	driver.findElements(By.xpath("//div[contains(@id , 'dropContent')]/div"));

	List<WebElement> drop = driver.findElements(By.xpath("//div[contains(@id , 'countries')]/div"));
	
	List<String> capitals = new ArrayList<String>();
	capitals.add("Washington");
	
	List<String> countries = new ArrayList<String>();
	countries.add("United States");
	
	for(WebElement e : drag)
	{
		if(e.getText().endsWith("Washington"))
		{
			for(WebElement f : drop)
			{
				if(f.getText().equals("United States"))
				{
					a.dragAndDrop(e, f).build().perform();
					break ;
				}
			}
		}
	}
	
	
	
	for(WebElement e : drag)
	{
		if(e.getText().endsWith(capitals.get(0)))
		{
			for(WebElement f : drop)
			{
				if(f.getText().equals(countries.get(0)))
				{
					a.dragAndDrop(e, f).build().perform();
					break ;
				}
			}
		}
	}
	
	
	}

}

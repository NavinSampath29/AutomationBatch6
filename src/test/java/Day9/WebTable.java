package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().window().maximize();
		
		// table 
		
		
		//  TR - OVERALL Rows 
		
		// TH  - COLOUMN HEADER 
		
		// TD - ROW DATAS 
		
	List<WebElement> coloumnheader = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/th"));
	
	List<WebElement> rowdatas = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td"));

	for(WebElement e :coloumnheader )
	{
		System.out.println(e.getText());
	}

	System.out.println("******************************************");
	
	for(WebElement f : rowdatas)
	{
		System.out.println(f.getText());
	}
	
	
	
	List<WebElement> company = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td[1]"));
	List<WebElement> contact = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td[2]"));
	List<WebElement> country = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td[3]"));
	
	for(WebElement e :company )
	{
		System.out.println(e.getText());
	}
	System.out.println("******************************************");

	for(WebElement e :contact )
	{
		System.out.println(e.getText());
	}
	System.out.println("******************************************");

	for(WebElement e :country )
	{
		System.out.println(e.getText());
	}
	}

}

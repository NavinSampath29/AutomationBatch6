package Day10;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotoclass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// Robot class is coming from JAVA 
		
		Robot r = new Robot();
		
		// Dimesnsion Class in JAVA to get the screen size 
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		// Rectangle 
		
		Rectangle rr = new Rectangle(d);
		
		BufferedImage br = r.createScreenCapture(rr);
		
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\target\\robo.png");
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		String currenttab = driver.getWindowHandle();
		
		WebElement link = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		link.click();
		
		
		try {
			ImageIO.write(br, "png", f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

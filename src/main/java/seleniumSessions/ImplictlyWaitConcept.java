package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictlyWaitConcept {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
		// wait for 10 seconds
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("asha");
		
		// override timeout to 5 seconds.. this is applied to all the following elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		// wait for 5 seconds
		WebElement pwd = driver.findElement(By.id("123"));
		pwd.sendKeys("12345");
	
	
	}

}

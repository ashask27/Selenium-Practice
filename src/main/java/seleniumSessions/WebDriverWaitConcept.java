package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		//email.sendKeys("asha@123");
		
		//waitForElementPresence(emailId, 10).sendKeys("asha@123");
		
		waitForElementVisible(emailId, 10).sendKeys("asha@123");
		
		driver.findElement(pwd).sendKeys("qwert");
		
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
	public static WebElement waitForElementPresence(By locator, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
	}
	
	
	
	public static WebElement waitForElementVisible(By locator, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); 
	}
}

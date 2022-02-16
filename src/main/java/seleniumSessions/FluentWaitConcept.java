package seleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailId = By.id("input-email1");
		By password = By.id("input-password");
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//								.withTimeout(Duration.ofSeconds(10))
//								.pollingEvery(Duration.ofSeconds(2))
//								.ignoring(NoSuchElementException.class)
//								.ignoring(StaleElementReferenceException.class);
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test@123");
		
		waitForElementVisibleWithFluentWait(emailId, 10, 2).sendKeys("testing@123");
		driver.findElement(password).sendKeys("123");
		
	}

	
	public static WebElement waitForElementVisibleWithFluentWait(By locator, int duration, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(duration))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage(locator + " is not found within the given time ....");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement waitForElementPresenceWithWait(By locator, int duration, int pollingTime) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		
		wait.pollingEvery(Duration.ofSeconds(pollingTime))
			.ignoring(NoSuchElementException.class)
			.ignoring(StaleElementReferenceException.class)
			.withMessage(locator + " is not found within the given time ....");
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		
	}
}

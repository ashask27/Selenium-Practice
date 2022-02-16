package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitNonWebElement {

	
		static WebDriver driver;
		
		public static void main(String[] args) {
			 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://www.amazon.co.uk");
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			if(waitForPageTitle("Amazon", 10)) {
				System.out.println(driver.getTitle());
			}

		}
		
		public static boolean waitForPageTitle(String value, int duration) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
			return wait.until(ExpectedConditions.titleContains(value));
		}

}

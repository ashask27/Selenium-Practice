package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickSendKeys {

	
		static WebDriver driver;
		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://demo.opencart.com/index.php?route=account/register");

			By firstName = By.id("input-firstname");
			By lastName = By.id("input-lastname");
			By login = By.xpath("//input[@value='Continue']");
			
			Actions act = new Actions(driver);
			act.sendKeys(driver.findElement(firstName), "asha").perform();
			act.sendKeys(driver.findElement(lastName), "koli").perform();
			act.click(driver.findElement(login)).perform();
		}
	}



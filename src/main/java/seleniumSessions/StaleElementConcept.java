package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement fn = driver.findElement(By.id("Form_submitForm_Name")); // DOM v1
		fn.sendKeys("Asha");
		driver.navigate().refresh();
		fn = driver.findElement(By.id("Form_submitForm_Name"));  //DOM v2
		fn.sendKeys("Sudha");

	}

}

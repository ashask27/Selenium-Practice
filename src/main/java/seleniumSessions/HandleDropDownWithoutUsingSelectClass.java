package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithoutUsingSelectClass {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// html tag = select
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
	
		List<WebElement> cList = driver.findElements(country);
		
		for (WebElement e: cList) {
			if (e.getText().equals("India")) {
				e.click(); break;
			}
		}

		
		
	}

}

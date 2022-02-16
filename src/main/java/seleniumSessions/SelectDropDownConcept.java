package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownConcept {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// html tag = select
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		
//		WebElement con = driver.findElement(country);
//		WebElement sta = driver.findElement(state);
//		
//		Select select = new Select(con);
//		
//		select.selectByIndex(5);
//		select.selectByVisibleText("India");
//		// works on value attribute
//		//select.selectByValue("Australia");
//		
//		Select sel = new Select(sta);
//		sel.selectByVisibleText("Karnataka");
		
		
		doSelectValueByIndex(country, 5);
		Thread.sleep(2000);
		
		
		doSelectValueByVisibleText(country, "India");
		Thread.sleep(2000);
		doSelectValueByVisibleText(state, "Karnataka");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	
	public static void doSelectValueByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);		
	}
}

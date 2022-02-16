package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxSelection {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
		
		WebElement ele = driver.findElement(By.id("checkBoxOption1"));
		if (!ele.isSelected()) {
			System.out.println("Not selected");
			ele.click();
		} 
		
		System.out.println(ele.isSelected());
		
		
		WebElement rad = driver.findElement(By.name("radioButton"));
		rad.click();
		System.out.println(rad.isSelected());
	}

}

package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("Moncton, Canada"));
		
		String index = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		
		System.out.println(index);
		
		index = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(index);
		
		
		index = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(index);
		
		index = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(index);
		
		
		index = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(index);
	}

}

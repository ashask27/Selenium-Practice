package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithListOfElements {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[8]//a"));
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			list.get(i).click();
			driver.navigate().back();
			list = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[8]//a"));
		}

	}

}

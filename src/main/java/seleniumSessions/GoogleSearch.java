package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Naveen Automation Labs");
		
		Thread.sleep(3000);
		
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));
		
		for (WebElement e: suggList) {
			String text = e.getText();
			if (text.equals("Naveen Automation labs testing")) {
				e.click();
				break;
			}
		}
		
	}

}

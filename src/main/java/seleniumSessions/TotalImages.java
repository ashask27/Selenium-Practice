package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		// WAP:
		// 1. total images
		// 2. print the src
		// 3. print the alt

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://amazon.co.uk");
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("total images : " + imgList.size());
		
		for (WebElement e: imgList) {
			System.out.println(e.getAttribute("alt") + ":"+ e.getAttribute("src"));
			
		}
		
	}

}

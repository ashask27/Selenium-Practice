package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.espncricinfo.com/series/super-smash-2021-22-1289602/auckland-vs-wellington-26th-match-1289610/full-scorecard");
		
		driver.get("https://www.nyse.com/ipo-center/filings");
		Thread.sleep(5000);
		
		List<WebElement> eles = driver.findElements(By.xpath("//td[text()='Silver Spike Investment Corp.']/following-sibling::td"));
		
		//System.out.println(eles.length());
		for (WebElement e: eles) {
			System.out.println(e.getText());
		}
		//System.out.println(ele.getText());
	}

}

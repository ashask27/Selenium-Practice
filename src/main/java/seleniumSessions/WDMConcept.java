package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		
		// this always points to latest version of driver
		WebDriverManager.chromedriver().setup();
		
		// if you want to use specific version of exe use following commnand
		// but make sure u downgrade the browser version as that does not happen automatically
		//WebDriverManager.chromedriver().browserVersion("87.0").setup();;
		
		//WebDriverManager.firefoxdriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}

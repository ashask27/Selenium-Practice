package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testBasics {

	public static void main(String[] args) {
		
		// Key to Start the server -webdriver.chrome.driver (provided by selenium team)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asha.koli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// there is no path setup to see where the server is running
		WebDriver driver = new ChromeDriver(); // this line launches the browser

		
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		
		
		
		Select s = new Select();
		
		driver.quit();
	}

}

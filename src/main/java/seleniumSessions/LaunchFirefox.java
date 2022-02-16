package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		// Name Value
		//propertyName represents the name of the browser-specific driver, and the value points to the path of that browser driver.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\asha.koli\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		
		// top casting - automation steps

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit(); //close the browser
	}

}

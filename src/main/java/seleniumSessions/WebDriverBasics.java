package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// start the server using following command
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asha.koli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// top casting - automation steps
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		// verification
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title " + title);
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit(); //close the browser
	}

}

package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();  //server starts
		// top casting - automation steps
		WebDriver driver = new ChromeDriver();  // launch 
				
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
		
		//driver.quit(); //close the browser.. but the server is still up and running.. session id is null
		driver.close();  // Server is not closed.. Invalid session id
		
		System.out.println(driver.getTitle()); // NoSuchSessionException:
		
		//driver = new ChromeDriver();  // new session created
		//System.out.println(driver.getTitle());
		
		
	}

}

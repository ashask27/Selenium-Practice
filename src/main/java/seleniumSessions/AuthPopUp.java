package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// to avoid the popup, enter username and password in the link itself as below
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
		String u = "admin";
		String p = "admin";
		
		driver.get("https://"+u+":"+p+"@the-internet.herokuapp.com/basic_auth");
		
	}

}

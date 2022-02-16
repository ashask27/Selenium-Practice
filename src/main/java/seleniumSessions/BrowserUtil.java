package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of browsername
	 * @param browser
	 * @return webdriver
	 */
		
	public WebDriver launchBrowser(String browser) {
		System.out.println(" browser "+ browser);
		
		if (browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\asha.koli\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("Firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\asha.koli\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
		} 
		else {
			System.out.println("Invalid browser");
		}
		return driver;
	}
	
	/**
	 * This method is to enter Url
	 * @param url
	 *
	 */
	
	public void enterUrl(String url) {
		if (url.contains("http") || url.contains("https")) {
			driver.get(url);
		}
		else {
			System.out.println("Incorrect url");
			try {
				throw new Exception("Incorrect URl. Missig http/https");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}

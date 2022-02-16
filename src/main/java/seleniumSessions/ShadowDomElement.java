package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();

	    
	    driver.get("http://selectorshub.com/xpath-practice-page");
	    // Br- Page - iFrame - ShadowDOM - input
	    
	    driver.switchTo().frame("pact");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement tea = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
	    
	    tea.sendKeys("Green Tea");
	}

}

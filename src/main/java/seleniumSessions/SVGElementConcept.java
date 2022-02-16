package seleniumSessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();

	    /***** first example
	    driver.get("https://petdiseasealerts.org/forecast-map#/");
	
	    String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']";

	    List<WebElement> clist = driver.findElements(By.xpath(svgXpath));
	    Actions act = new Actions(driver);
	    for (WebElement e: clist) {
	    	act.moveToElement(e).perform();	
	    	System.out.println(e.getAttribute("name"));
	    	
	    	if (e.getAttribute("name").equals("Alaska")) {
	    		act.click(e).perform();
	    		break;
	    	}
	    }
	    **/
	    
	    // second example
	    driver.get("https://www.flipkart.com/");
	    String xx = "//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']";
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Dresses");
	    WebElement ele = driver.findElement(By.xpath(xx));
	    
	    Actions act = new Actions(driver);
	    act.click(ele).perform();
	}

}

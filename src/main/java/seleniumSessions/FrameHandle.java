package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/");
		
		// switch to the frame
		//driver.switchTo().frame(2);  //index
		//driver.switchTo().frame("main"); //name
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		
		System.out.println(header);
		
		// switch back to main page
		// but if the frame is within another frmae, this will take
		// to the parent frame.. in this case do the switch twice
		// to go back to main page
		driver.switchTo().defaultContent();
		
		
		//driver.switchTo().parentFrame(); // sel 4 go to immediate parent frame
		
		
	
	}

}
;
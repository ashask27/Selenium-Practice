package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RnM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://uat.passenger-recovery.amadeus.com/reportingandmonitoring/#/login");
		driver.get("https://1a.uat.accounts.amadeus.com/LoginService/authorizeAngular?response_type=header&client_id=&service=OPR&redirect_uri=https%3A%2F%2Fuat.passenger-recovery.amadeus.com%2Freportingandmonitoring%2F%23%2Fafterlogin");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//By username = By.id("userAliasInput");
		By username = By.cssSelector("#userAliasInput");
		//By officeId = By.xpath("//*[@id=\"officeIdInput\"]");
		By next = By.id("id_confirmButton");
		
		driver.findElement(username).sendKeys("AKOLI");
		//driver.findElement(officeId).sendKeys("LON1A0955");
		driver.findElement(next).click();
		
		
		
		//driver.close();
	}

}

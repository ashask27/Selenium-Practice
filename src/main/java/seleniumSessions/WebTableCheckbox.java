package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckbox {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://selectorshub.com/xpath-practice-page");
	
	    selectEmp("John.Smith");
	}
	
	public static void selectEmp(String empName) {
		//a[text()='Joe.Root']/parent::td/preceding-sibling::Td/child::input
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='"+empName+"']/parent::td/preceding-sibling::Td/child::input"));
		ele.click();
	}

	public static void getEmpDetails(String empName) {
		WebElement ele = driver.findElement(By.xpath("//a[text()='"+empName+"']/parent::td/preceding-sibling::Td/child::input"));
				
	}
}

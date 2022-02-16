package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		// WAP:
		// 1. total links
		// 2. print the text of each link (ignore the blanks/empty text)
		// 3. print the href value of each link
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://amazon.co.uk");
		
		//List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
//		List<WebElement> totalLinks = getElements(By.tagName("a"));
//		System.out.println(totalLinks.size());
//		
//		int cnt = 0;
//		for(WebElement e: totalLinks) {
//			String text = e.getText();
//			if (!text.isEmpty()) {
//				System.out.println(cnt + ":" + text);
//			}
//			
//			String hrefVal = e.getAttribute("href");
//			System.out.println(hrefVal);
//			
//			cnt++;
//		}
//		

//		for(int i=0; i < totalLinks.size(); i++) {
//			String text = totalLinks.get(i).getText();
//			if (text.isBlank()) {
//				System.out.println(i + ":" + text);
//			}
//			String hrefVal = totalLinks.get(i).getAttribute("href");
//			System.out.println(hrefVal);
//		}
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println(getElementCount(links));
		System.out.println(getElementCount(images));
		
		if (getElementsTextList(links).contains("Grocery")) {
			System.out.println("Grocery is present");
		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementCount(By locator) {		
		return getElements(locator).size();
	}
	
	public static void printElementsText(By locator) {
		List<WebElement> list = getElements(locator);
		for (WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	
	public static List<String>  getElementsTextList(By locator) {
		List<WebElement> list = getElements(locator);
		List<String> textList = new ArrayList<String>();
		
		for (WebElement e : list) {
			String text = e.getText();
			if (!text.isEmpty()) {
				textList.add(text);
			}
		}
		return textList;
	}
	
	
	public static List<String> getElementsAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		
		for (WebElement e: eleList) {
			String attrVal = e.getAttribute(attrName);
			eleAttrList.add(attrVal);
		}
		
		return eleAttrList;
	}

}

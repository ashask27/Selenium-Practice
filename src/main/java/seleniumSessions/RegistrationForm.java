package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationForm {

	public static void main(String[] args) {
		
		String browser = "chrome";
		BrowserUtil br = new BrowserUtil();	
		
		WebDriver driver = br.launchBrowser(browser);
		
		br.enterUrl("https://demo.opencart.com/index.php?route=account/login");
		
		ElementUtil util = new ElementUtil(driver);
		
		By registerLink = By.linkText("Register");
		util.clickOnLink(registerLink, "Register");
		
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.name("email");
		By telephone = By.xpath("//*[@id=\"input-telephone\"]");
		By password = By.id("input-password");
		By passwordConfirm = By.id("input-confirm");
		By subscribe = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By policy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
				
		
		util.doSendKeys(firstName, "Usha");
		util.doSendKeys(lastName, "Nair");
		util.doSendKeys(emailId, "useful@gmail.com");
		util.doSendKeys(telephone, "12345577");
		util.doSendKeys(password, "test123");
		util.doSendKeys(passwordConfirm, "test123");
		util.doClick(subscribe);
		util.doClick(policy);
		util.doClick(continueBtn);
		
	
		By text = By.xpath("//*[@id=\"content\"]/h1");
		String ss = util.doGetText(text);
		System.out.println(ss);
		if (ss.equals("Your Account Has Been Created!")) {
			System.out.println("Account created");
		}
		
		br.closeBrowser();

	}

}

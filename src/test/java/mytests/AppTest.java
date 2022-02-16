package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	/***
	 * 
	 * BS - create user
BT - connectWithDB
BC - launchBrowser
BM - login
TEST - homePageTest
AM - logout
BM - login
TEST - reportPageTest
AM - logout
BM - login
TEST - searchPageTest
AM - logout
AC - closeBrowser
AT - disconnectWithDB
AS - delete user

test are picked on alphabetic order
	 */
	
	
	@BeforeSuite
	public   void createUser() {
		System.out.println("BS - create user");
	}
	
	@BeforeTest
	public   void connectWithDB() {
		System.out.println("BT - connectWithDB");
	}	
	
	@BeforeClass
	public   void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}
	
	
	@BeforeMethod
	public   void login() {
		System.out.println("BM - login");
	}
		
	@Test
	public   void homePageTest() {
		System.out.println("TEST - homePageTest");
	}
	
	@Test
	public   void searchPageTest() {
		System.out.println("TEST - searchPageTest");
	}	
	
	@Test
	public   void reportPageTest() {
		System.out.println("TEST - reportPageTest");
	}
	
	
	@AfterMethod
	public   void logout() {
		System.out.println("AM - logout");
	}
		
	@AfterClass
	public   void closeBrowser() {
		System.out.println("AC - closeBrowser");
	}
	
	@AfterTest
	public   void disconnectWithDB() {
		System.out.println("AT - disconnectWithDB");
	}	
	

	@AfterSuite
	public   void deleteUser() {
		System.out.println("AS - delete user");
	}

	
	
	
	
}

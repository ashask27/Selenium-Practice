package mytests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	@DataProvider
	public Object[][] loginTestData() {
		return new Object [][] {
				{"asha", "test123"},
				{"test", "abcd"},
				{"tttt", "wewewe"},
				{"user", "45345£$%"},
				{null, null},
				{" ", " "}
		};
	}

	@Test (dataProvider = "loginTestData")
	public void loginTest(String username, String password) {
		Assert.assertTrue(doLogin(username, password));
	}
	
	
	public boolean doLogin(String userName, String password) {
		System.out.println(userName + " " + password);
		return true;
	}
}

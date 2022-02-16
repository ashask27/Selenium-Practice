package mytests;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	@Test
	public void loginTest() {
		System.out.println("loginTest");
		int i = 9/0;
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void cartTest() {
		System.out.println("cartTest");
	}
	
}

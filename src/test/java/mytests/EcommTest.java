package mytests;

import org.testng.annotations.Test;

public class EcommTest {
	
	@Test (priority = 0)
	public void loginTest() {
		System.out.println("loginTest");
	}

	
	@Test (priority = -1)
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@Test (priority = 2)
	public void cartTest() {
		System.out.println("cartTest");
	}
	
	@Test (priority = 3)
	public void paymentTest() {
		System.out.println("paymentTest");
	}
	
	
	
	@Test
	public void m1test() {
		System.out.println("M1test");
	}
	
	
	@Test
	public void m2test() {
		System.out.println("M2test");
	}
}

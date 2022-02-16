package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		String browser = "chrome";
		
		
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browser);
		
		br.enterUrl("https://www.google.com");
		System.out.println(br.getTitle());
		
		
		if(br.getPageUrl().contains("google")) {
			System.out.println("Correct");
		} else {
			System.out.println("InCorrect Url");
		}
		
		br.quitBrowser();
	
	}

}

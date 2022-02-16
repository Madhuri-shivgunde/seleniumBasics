package seleniumBasics1;

import org.openqa.selenium.WebDriver;

public class TestBrowserUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		BrowserUtil br=new BrowserUtil();
		br.launchBrowser("chrome");
		br.enterURL("https://www.google.com");
		br.getPageTitle();
		br.getPageURL();
		

	}

}

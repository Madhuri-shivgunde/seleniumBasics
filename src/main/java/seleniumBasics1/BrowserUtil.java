package seleniumBasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	
		private WebDriver driver;
		public WebDriver launchBrowser(String browser) {
			System.out.println("Browser to launch is: "+browser);
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("safari")) {
				
				driver=new SafariDriver();
			}
			else {
				System.out.println("Incorrct Browser : "+browser);
			}
			return driver;
		}
		
		public void enterURL(String url) {
			System.out.println("Url is: "+url);
			if(url.contains("http") || url.contains("https")) {
				driver.get(url);
				
			}
			else {
				System.out.println("Incorrect URL entered");
			}
		}
		public String getPageTitle() {
			return driver.getTitle();
		}
		public String getPageURL() {
			return driver.getCurrentUrl();
		}
		public void closeBrowser() {
			driver.close();
		}
		public void quitBrowserL() {
			driver.quit();
		}
		
		

	
}

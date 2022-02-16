package seleniumBasics1;


// selenium 4.0 jar files we are using to run script

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//there are two ways to launch server (BrowserDriver server) which is provided by respective vendor
		//1.
		// need to set system property for server path to run script here, server is nothing but chromedriver.exe path
		//download chromedriver.exe  compatible version for ur browser and provide path
		//download from selenium official site
		
		
		//System.setProperty("wedriver.chrome.driver", "set url of cheomedriver.exe which u need to save in machine");
		
		//2. using WebDriverManager library which is open source library supported by selenium
		//add WebDriverManager dependencies in pon.xml file
		//search on google "WebDriverManager maven repository"
		//here webdrivermanager takes care to download compatible version browser server,
		//it  checks the browser version installed in your system, and if browser is upgrading time to time no matters
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.edgedriver().setup();
		
		
		//topcasting
		
		WebDriver driver=new ChromeDriver();  //launching chrome 
		
		//WebDriver firefoxdriver=new FirefoxDriver();  //launching firefox
		//WebDriver edgedriver=new EdgeDriver();		//launching edge
		
		
		// how to run script in multiple browser
		
		driver.get("https://www.google.com");
		String url1=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		
		//verify title is correct or url is correctly hitted
		
		if((title.equalsIgnoreCase("google")) && (url1.equalsIgnoreCase("https://www.google.com/")) )
		{
			System.out.println("correct page is opened");
		}
		else
		{
			System.out.println(" incorrect page");
		
		}
		
		driver.quit();
		

}
}

package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumBasics1.BrowserUtil;

public class HeadlessNIncognitoChrome {

	//headless means program will run without launching browser physically
	/*
	 * What is a headless Chrome browser?
Headless Chrome is a way to run the Chrome browser in a headless environment without the full browser UI. ...
 Headless Chrome gives you a real browser context without the memory overhead of running a full version of Chrome.
	 * 
	 * 
	 * do not use headless mode case you are using Actions class methodsfor mouse input or Robot class methods for keybard input
	 *  Using 'Robot Class' we can simulate keyboard and mouse events in Selenium.
	 * */
		
		public static void main(String[] args)
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions co =new ChromeOptions();
			//co.addArguments("--headless");   //setting option to run in headless window
			co.addArguments("--incognito");   // setting option to run in incognito window
			
			WebDriver driver=new ChromeDriver(co);
			driver.get("https://www.google.com");
			String url1=driver.getCurrentUrl();
			String title=driver.getTitle();
			System.out.println(url1);
			System.out.println(title);
			
			
			
			
			
		}


	}

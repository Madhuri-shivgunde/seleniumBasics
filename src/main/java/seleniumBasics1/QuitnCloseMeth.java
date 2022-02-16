package seleniumBasics1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitnCloseMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//starting server
		WebDriverManager.chromedriver().setup();
		
		//launching chrome browser
		WebDriver driver =new ChromeDriver();
		
		// hitting url
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		String pageurl=driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(pageurl);
		System.out.println(driver.getWindowHandles());
		
		
		//1.
		//closing browser which has focus using close()
		driver.close();
		
		//after calling close(), if we try to request to browser which is closed
		//it gives runtimeException
		
		System.out.println(driver.getCurrentUrl()); //NoSuchSessionException: invalid session id
		
		
		//so launch browser again
		driver =new ChromeDriver();
		System.out.println(driver.getCurrentUrl());
		
		
		 // 2. quit()
		  
		//  if we want to close all browser initiated by selenium script use
		  
		 // driver.quit();
		
		//after quit again try to send request then gives runtime exception
		
		//System.out.println(driver.getCurrentUrl()); //NoSuchSessionException: session id is null
		 
	}

}

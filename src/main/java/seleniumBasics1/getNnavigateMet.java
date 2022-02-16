package seleniumBasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getNnavigateMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//starting server
				WebDriverManager.chromedriver().setup();
				
				//launching chrome browser
				WebDriver driver =new ChromeDriver();
				
				// hitting url
				driver.get("https://www.google.com");
				
				String title=driver.getTitle();
			
				System.out.println(title);
			
				 driver.navigate().to("http://www.amazon.com");  //navigate.to() methods calls internally get() method
				 
				 
				 // both the methods get() and navigate.to are same
				System.out.println(driver.getTitle());
				
				driver.navigate().back();
				System.out.println(driver.getTitle());
				
				driver.navigate().forward();
				System.out.println(driver.getTitle());
				
			

	}

}

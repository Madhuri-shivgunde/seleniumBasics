package seleniumAdavacnce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//whenever browser opens any window, a unique window id will get assigned to each window
		//called window Handle
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");  
		//one window is opened which is parentWindow
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//after clicking on link, second window gets open which is child window
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		//now two windows are opened in browser by selenium
		//currentlly driver is on parent window
		//if we need to switch driver on second opened window
		
		Set<String> windowHandle= driver.getWindowHandles();
		
		Iterator<String>it=windowHandle.iterator();
		
		String parentWindow=it.next(); 	//parentWindow Handler
		String childWindow=it.next();	//childWindow Handler
		
		driver.switchTo().window(childWindow); 	//driver switched from parent to child window
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		
		
		
		

	}

}

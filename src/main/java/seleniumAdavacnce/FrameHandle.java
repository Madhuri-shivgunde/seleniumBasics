package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//
		//
		
		//https://the-internet.herokuapp.com/basic_auth
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.londonfreelance.org/courses/frames/");
		
		driver.switchTo().frame("main");		// driver switches to frame whose name is main
		
		//driver.switchTo().frame(2);
	
		System.out.println(driver.findElement(By.xpath("/html/body/h2")).getText());
		  driver.switchTo().defaultContent();			//driver switche back to page
		  
		 // driver.switchTo().parentFrame(); //switches from child frame to parentframe  //sel4 new feature
		

	}

}

package seleniumAdavacnce;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentwaitConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailid=By.id("input-email");
		By email=By.id("input-email1111");
		By pwd=By.id("input-password");
//		
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
//							.withTimeout(Duration.ofSeconds(10))
//							.pollingEvery(Duration.ofSeconds(2))
//							.ignoring(NoSuchElementException.class)
//							.ignoring(StaleElementReferenceException.class);
//							
//							
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		
		// WeDriverwait waits for element to be located for given timeout time, 
		//if element not found within time then it throws TimeOutException and NoSuchElementException
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.pollingEvery(Duration.ofSeconds(2));	
		
		//WebDriverWait constructor overloaded with three parameters ---> driver,timeout,sleep/pollingtime
		//WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));  

	}
	public static WebElement waitForElmentPresenceWithFluentWait(By locator, int timeout, int pollingTime, String msg)
	{
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage(locator+" is not found within given timeout");
				
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}

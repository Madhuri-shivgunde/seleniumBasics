package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollingConceptWithWebDriverWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailid=By.id("input-email");
		By email=By.id("input-email1111");
		By pwd=By.id("input-password");
		
		// WeDriverwait waits for element to be located for given timeout time, 
		//if element not found within time then it throws TimeOutException and NoSuchElementException
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));	
		
		//WebDriverWait constructor overloaded with three parameters ---> driver,timeout,sleep/pollingtime
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));  
		
		
		// setting pollong time/ interval time to check for element on page, Here timeout is 10 sec, so at interval of 2sec driver will check for element
		// if we do not se polling time default polling time is 0.5 sec or 500 miliseconds
				
		//When to use Polling Time:
		// When the page has AJAX (Asynchronous Javascript XML) call. AJAX is used for dynamic updated on page without reloading/refreshing page
		
		
	
		
		//WebElement email_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(emailid));
		WebElement email_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(email));

		email_ele.sendKeys("madhuri@gmail");
		WebElement pass=wait.until(ExpectedConditions.visibilityOfElementLocated(pwd));
		pass.sendKeys("madhuri");

	}

}

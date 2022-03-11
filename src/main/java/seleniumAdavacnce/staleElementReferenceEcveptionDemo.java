package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staleElementReferenceEcveptionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		//DOM V1
		By fn=By.id("input-firstname");
		WebElement fname=driver.findElement(fn);
		// Every webelement, when it gets located, it will get assied a unique id, so letes say here id of fname=123 on DOM V1
		fname.sendKeys("Madhuri");
		Thread.sleep(1000);
		driver.navigate().refresh();
		//DOM V2 
		// After refreshing page if we try to refer same element which is alredy found, will throw exception as new version of DOM created
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException:
		//stale element reference: element is not attached to the page document
		fname.sendKeys("Anish");  // here fname id got expired as DOM gets updated with new Version V2
		
		
		//solution
		/*
		  in this case when page gets refreshed or navigated forward and  back all elements gets staled or rotten 
		  so we need to reinitialize all webelements again
		  
		 */
		fname=driver.findElement(fn);
		
		
	
	
				

	}

}

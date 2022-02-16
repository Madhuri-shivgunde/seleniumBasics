package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts1 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// Create a WebElemnet
		// By.locator
		// once webelement we get, apply action like click, sendkeys, isDisplayed.....

		//  Locating WebEement following approches are used 
		// 6th and 7th approch is preffered mostly by professional

		// ************************************ 1 st Approch  ****************************

		/*
		 * driver.findElement(By.id("input-email")).sendKeys("madhuri123@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("Madhuri123");
		 * 
		 */

		// **************************** 2nd approch: maintaining webelement seperately, so we can input data *******
		// multiple times easily

		/*
		 * WebElement emailid =driver.findElement(By.id("input-email")); WebElement
		 * password =driver.findElement(By.id("iinput-password"));
		 * 
		 * emailid.sendKeys("madhui@gmail.com"); password.sendKeys("madhuri123");
		 * 
		 * emailid.sendKeys("Rahul@gmail.com"); password.sendKeys("rahiul123");
		 * 
		 * emailid.sendKeys("Anishi@gmail.com"); password.sendKeys("Ani123");
		 * 
		 */

		// ***************************************** 3rd approch: maintaining By locator reference for webelement *******
		// seperately (this is preferred most of times)

		/*
		 * By email=By.id("input-email"); By pwd=By.id("iinput-password");
		 * 
		 * WebElement emailid =driver.findElement(email); WebElement
		 * password=driver.findElement(pwd);
		 * 
		 * emailid.sendKeys("madhuri2gmail.com"); password.sendKeys("Madhuri123");
		 * 
		 */

		// ********************************* 4th approch: By locator passing to generic methods getElement() *************

		/*
		 * 
		 * By email=By.id("input-email");
		 * 
		 * By pwd=By.id("iinput-password"); WebElement emailid=getElement(email);
		 * WebElement password=getElement(pwd);
		 * 
		 * emailid.sendKeys("madhuri2gmail.com"); password.sendKeys("madhuri123");
		 * 
		 */

		// **************************** 5th approch: By locator and String value passing to generic action method doSendkeys()

		/*
		 * String email_value="madhuri@gmail.com";
		
		String pass_value="madhuri2";
	
		By email=By.id("input-email");	
		By pwd=By.id("input-password");

		doSendKeys(email,email_value);
		doSendKeys(pwd,pass_value);
		
		*/

		// ************************************* 6th approch: save/move custom methods in another Utility class *********
		// and create object of utility class and call methods

		/*
		 * String email_value = "madhuri@gmail.com";
		 
		String pass_value = "madhuri2";

		By email = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtil el = new ElementUtil(driver);

		el.doSendKeys(email, email_value);
		el.doSendKeys(pwd, pass_value);
		
		*/
		
		// ********** ****************************  7th approch: maintaining String locatorType, String Locatorvalue, String value and calling custom method 
	
		String emailid="input-email";
		String pwd="input-password";
				
		String email_value = "madhuri@gmail.com";
		String pass_value = "madhuri2";
		
		doSendKeys("id",emailid,email_value);
		doSendKeys("id",pwd,pass_value);
		
	
	}
	
	public static By getBy(String LocatorType, String LocatorValue) {
		By locator =null;
		switch (LocatorType) {
		case "id":
			locator=By.id(LocatorValue);
				
			break;
		case "name":
			locator=By.name(LocatorValue);
				
			break;
			
		case "class":
			locator=By.className(LocatorValue);
				
			break;
		case "xpath":
			locator=By.xpath(LocatorValue);
				
			break;
		case "cssSelector":
			locator=By.cssSelector(LocatorValue);
				
			break;
		default:
			break;
		}
		return locator;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}
	
	public static void doSendKeys(String LocatorType, String LocatorValue, String value) {
		getElement(getBy(LocatorType,LocatorValue)).sendKeys(value);
	}
}

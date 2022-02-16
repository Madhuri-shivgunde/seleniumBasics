package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumBasics1.BrowserUtil;

public class ActionSendKeys
{

		static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BrowserUtil br=new BrowserUtil();
			driver=br.launchBrowser("chrome");
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			ElementUtil ele =new ElementUtil(driver);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
			ele.enterURL("https://demo.opencart.com/index.php?route=account/login");
			System.out.println("Title is:  "+ele.doGetTitle());
			
			By fn=By.xpath("//input[@id='input-email']");
			By pwd=By.xpath("//input[@id='input-password']");
			Actions act=new Actions(driver);
			act.sendKeys(ele.getElement(fn), "Madhuri@gmail.com").perform();
			act.sendKeys(ele.getElement(pwd), "Madhuri@123").perform();
			

}
		public static WebElement getElement(By locator) 
		{
			return driver.findElement(locator);
			
		}
		
		/**
		 * 
		 * @param locator
		 * @param value
		 */
		public static void doActionSendKeys(By locator, String value) {
			Actions act = new Actions(driver);
			act.sendKeys(getElement(locator), value);
		}
/**
 *Clicks in the middle of the given element. 
 *Equivalent to: Actions.moveToElement(onElement).click()
 *
 *Note: Actions class click() method is more effective while element that need to be clicked is overlapped with other element
 * @param locator
 */
		public static void doActionClick(By locator)
		{
				Actions act=new Actions(driver);
				act.click(getElement(locator)).perform();
		}
}



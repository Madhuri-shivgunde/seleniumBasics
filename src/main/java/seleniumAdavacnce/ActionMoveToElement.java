package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumBasics1.BrowserUtil;

public class ActionMoveToElement {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br=new BrowserUtil();
		driver=br.launchBrowser("chrome");
		ElementUtil ele =new ElementUtil(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		ele.enterURL("http://mrbool.com");
		System.out.println("Title is:  "+ele.doGetTitle());
		System.out.println("URL is:  "+ele.doGetURL());
		
		By Contentparent=By.className("menulink");
		By Crs=By.linkText("COURSES");
		
		Actions act=new Actions(driver);
		act.moveToElement(ele.getElement(Contentparent)).perform();      ///perform() internally calls build() function
		//act.moveToElement(ele.getElement(Contentparent)).build().perform();   //we can aslo write in this way, when multiple actions we perform and we need to perform once then use inthis way
		WebElement courses=wait.until(ExpectedConditions.visibilityOfElementLocated(Crs));
		
		act.click(courses).perform();
		
		
		
		

	}

}

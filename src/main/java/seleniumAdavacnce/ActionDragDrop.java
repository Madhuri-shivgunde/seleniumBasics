package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumBasics1.BrowserUtil;

public class ActionDragDrop {

	
		static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BrowserUtil br=new BrowserUtil();
			driver=br.launchBrowser("chrome");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			ElementUtil ele =new ElementUtil(driver);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			ele.enterURL("https://jqueryui.com/droppable/");
			System.out.println("Title is:  "+ele.doGetTitle());
			System.out.println("URL is:  "+ele.doGetURL());
			
			By source=By.xpath("//div[@id='draggable']");
			By target=By.xpath("//div[@id='droppable']");
			WebElement source_ele=(WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(source));
			WebElement target_ele=(WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(target));
		
			Actions act=new Actions(driver);
			//act.dragAndDrop(source_ele,target_ele).perform();
			act.clickAndHold(source_ele).moveToElement(target_ele).release().build().perform();

	}

}

package seleniumAdavacnce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumBasics1.BrowserUtil;

public class ActionContextClick {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br=new BrowserUtil();
		driver=br.launchBrowser("chrome");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		ElementUtil ele =new ElementUtil(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		ele.enterURL("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		System.out.println("Title is:  "+ele.doGetTitle());
		
		
		By btnRightClick=By.xpath("//span[text()='right click me']");
		By contectMenu=By.xpath("//ul[contains(@class,'context-menu-list')]/li");
		
		Actions act=new Actions(driver);
		act.contextClick(ele.getElement(btnRightClick)).perform();
		List<WebElement> Menu=ele.getElements(contectMenu);
		for(WebElement e : Menu) {
			String text=e.getText();
			System.out.println(text);
			
		}
		
		

	}

}

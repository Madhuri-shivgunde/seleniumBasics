package seleniumAdavacnce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchsuggestionDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		By search =By.xpath("//input[@name='q']");
		By suggBox=By.xpath("//div[@class='OBMEnb']//div[contains(@class,'wM6W7d')]/span");
		
		driver.findElement(search).sendKeys("computer");
		Thread.sleep(3000);
		List<WebElement> suggList=driver.findElements(suggBox);
		System.out.println(suggList.size());
		
		for(WebElement e : suggList)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Computer Science"))
			{
				e.click();
				break;
			}
		}
			
		
	}
	
	
	/*
	 * 
	 
	 driver.get("https://www.amazon.com");
		By searchBox= By.xpath("//input[@id='twotabsearchtextbox']");
		driver.findElement(searchBox).sendKeys("kids");
		searchItem("kids mask");
	 public static void searchItem(String item_name)
	  	{
		By searchkeyword=By.xpath("//div[@id='nav-flyout-searchAjax']//div[contains(@aria-label,'"+item_name+"')]");
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchkeyword)).click();
		//WebElement search=driver.findElement(searchkeyword);
		
		//search.click();
	}

	 
	  
	 */

}

package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpdownSuggestion {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		By searchBox= By.xpath("//input[@id='twotabsearchtextbox']");
		driver.findElement(searchBox).sendKeys("kids");
		searchItem("kids mask");
		
//		By searchkeyword=By.xpath("//div[@id='nav-flyout-searchAjax']//div[contains(@aria-label,'kids mask')]");
//		driver.findElement(searchBox).sendKeys("kids");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(searchkeyword));
//		WebElement search=driver.findElement(searchkeyword);
//		
//		search.click();
		
}
	public static void searchItem(String item_name)
	{
		By searchkeyword=By.xpath("//div[@id='nav-flyout-searchAjax']//div[contains(@aria-label,'"+item_name+"')]");
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchkeyword)).click();
		//WebElement search=driver.findElement(searchkeyword);
		
		//search.click();
	}

}

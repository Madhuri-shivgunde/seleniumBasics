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

/**
  Synchronization in selenium is achived by adding wait
  Two types of Wait
  1. Implicitly Wait
  2. Explicit Wait
  	2.a)  WebDriverWait
  	2.b)  fluentWait
		
		WebDriverWait class --> extends --> Fluentwait class --> implements -->wait interface
 */



public class WebDriverWaitDemo {
	
	
	static WebDriver driver;
	public static void main(String[] args)
	{	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email=By.id("input-email");
		
		
		waitForElementToBePresent(email,20).sendKeys("madhuri@gmail.com");
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static WebElement waitForElementToBePresent(By locator, long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static List<WebElement> waitForAllElementToBePresent(By locator, long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	public static WebElement waitForElementToBeVisible(By locator, long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static List<WebElement> waitForAllElementToBeVisible(By locator, long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static Boolean waitFotTitleContains(String title, long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleContains(title));
	}
	public static Boolean waitFotURLFractionContains(String urlFraction, long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}
}

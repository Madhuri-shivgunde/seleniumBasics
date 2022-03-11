package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramehandleWithWebDriver {
	static WebDriver driver;
	public static void main(String[] args)
	{
	//https://the-internet.herokuapp.com/basic_auth
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://www.londonfreelance.org/courses/frames/");
		
			waitForFrameByIndex(2,10);
			By frameMain= By.name("main");
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
			
			//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
			//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("navbar"));
			//driver.switchTo().frame("main");		// driver switches to frame whose name is main
			
			//driver.switchTo().frame(2);
		
			//System.out.println(driver.findElement(By.xpath("/html/body/h2")).getText());
	}
	public static WebDriver waitForFrameByIndex(int frameIndex, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static WebDriver waitForFrameByName(String fname, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fname));
	}
	public static WebDriver waitForFrameByLocator(By locator, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public static WebDriver waitForFrameByFrameElement(WebElement frameElement, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
}

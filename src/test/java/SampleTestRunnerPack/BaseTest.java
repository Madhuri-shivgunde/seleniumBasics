package SampleTestRunnerPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	WebDriverWait wait;
	@Parameters({"browser","url","timeout"})
	@BeforeTest
	public void setup(String browser,String url, String timeout) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		wait=new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(timeout)));
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
}

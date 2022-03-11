package myTestPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// When to call setUp() method to launch browser at @BeforeTest or at @BeforeMethod
public class OrangeHRMTest {
	WebDriver driver;
	WebDriverWait wait;
	
	
	@BeforeMethod
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	@Test(priority=2)
	public void logoTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='nav-logo']")).isDisplayed());
	}
	
	@Test(priority=3)
	public void headerTest()
	{
		String headerText=driver.findElement(By.xpath("//div[@class='try-it-text']/h1")).getText();
		Assert.assertTrue(headerText.contains("Your free trial"));
	}
	
	@Test(priority=1)
	public void pageTitleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM");
	}
	
	@Test(priority=4)
	public void contactSaleLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Contact Sales']")).isDisplayed());
	}
	
	
	//here as we have called setUp() @BeforeTest, 
	//so browser will get launched once and all @test methods will get executes

	/*
	  case study:1) calling setUp() @BeforeTest, and tearDown() @AfterTest
	  What if we wrote 100 Tests,
	   and while running tests browser gets crashed in middle 
	   suppose after 40 test, browser crashed, so remaining 60 tests will not get execute.
	   
	   so your test execution percentage =40%
	   
	   case study 2)calling setUp() @BeforeMethod and tearDown() @AfterMethod
	    In this case new Browser will get launch  before every TestMethod execution 
	    and will get closed after test method once finish
	    
	    so if we have 100 test methods to execute then 100 times browser will get launch n close
	    so even any browser crash happens during any test, other test will get execute
	 
	 */

}

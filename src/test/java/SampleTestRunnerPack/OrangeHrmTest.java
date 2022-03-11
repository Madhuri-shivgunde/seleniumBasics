package SampleTestRunnerPack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {
	//"https://www.orangehrm.com/orangehrm-30-day-trial/"
	
	@Test
	public void logoTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='nav-logo']")).isDisplayed());
	}
	
	@Test
	public void headerTest()
	{
		String headerText=driver.findElement(By.xpath("//div[@class='try-it-text']/h1")).getText();
		Assert.assertTrue(headerText.contains("Your free trial"));
	}
	
	@Test
	public void pageTitleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM");
	}
	
	@Test
	public void contactSaleLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Contact Sales']")).isDisplayed());
	}
	
	
	
}

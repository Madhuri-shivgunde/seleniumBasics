package SampleTestRunnerPack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	
	@Test
	public void logoTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
	}
	
	
	
	@Test
	public void pageTitleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test(enabled=false)  // if we write enabled=false then this test will not participate in execution
	public void searchBoxDisplayTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isDisplayed());
	}
	
	@Test
	public void gmailLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed());
	}
	
}

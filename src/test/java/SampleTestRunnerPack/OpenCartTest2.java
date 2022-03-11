package SampleTestRunnerPack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest2 extends BaseTest {
	//"https://demo.opencart.com/index.php?route=account/login"
	
	@Test
	public void logoTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed());
	}
	
	@Test
	public void newCustheaderTest()
	{
		String headerText=driver.findElement(By.xpath("//div[@class='well']/child::h2[text()='New Customer']")).getText();
		Assert.assertTrue(headerText.contains("New Customer"));
	}
	@Test
	public void returning_CustomerheaderTest()
	{
		String headerText=driver.findElement(By.xpath("//div[@class='well']/child::h2[text()='Returning Customer']")).getText();
		Assert.assertTrue(headerText.contains("Returning Customer"));
	}
	
	@Test
	public void pageTitleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test
	public void myAccountLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='list-group']/a[text()='My Account']")).isDisplayed());
	}
	
	
	
}

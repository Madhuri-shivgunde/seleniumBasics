package myTestPack;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	//	 global preconditions like envirment variable setup, connection to Db
	
	//	preconditions like initializing chromeDriver 
	
	//	test methods with validation logic ie. method contains assertions ie. actual vs expected. Every test method should contain one assertion
	
	//	post Condition like logout, closing broswer,closing db connection , deleting cookies etc
	
	
	
	@BeforeSuite
	public void createUserTest()
	{
		System.out.println("BS --- User Created");
	}
	
	@BeforeTest
	public void connectDBTest()
	{
		System.out.println("BT --- Connection to DB established");
	}
	
	@BeforeClass
	public void launchBrowserTest()
	{
		System.out.println("BC --- Launching Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("BM --- loginUser");
	}
	@Test
	public void homePageTest()
	{
		System.out.println("HomePage");
	}
	@Test
	public void searchPageTest()
	{
		System.out.println("searchPage");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("AM --- logoutUser");
	}
	
	@AfterClass
	public void closeBrowserTest()
	{
		System.out.println("AC --- closing Browser");
	}
	
	@AfterTest
	public void disconnectDBTest()
	{
		System.out.println("AT --- DisConnecting fron DB ");
	}
	@AfterSuite
	public void deleteUserTest()
	{
		System.out.println("AS --- User deleted");
	}
	
	
	

}

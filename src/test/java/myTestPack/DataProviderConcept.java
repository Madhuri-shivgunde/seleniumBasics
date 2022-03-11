package myTestPack;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderConcept {
	
	@DataProvider						// using @DataProvider annotation
	public Object[][] getLoginData()
	{
		Object data[][]= {				// create two dimentional array to store data username n password
				{"Madhuri","123"},
				{"Ani","345"},
				{"123Rahul","890"},
				{"","123"},
				{"",""},
				{"",null},
				{null,null},
				};
		return data;
		
	}
	
	
	@Test(dataProvider="getLoginData")		// specifying dataprovider method name
	public void loginTest(String username,String pass)
	{
		Assert.assertTrue(doLogin(username,pass));
	}
	
	public boolean doLogin(String usernm, String pwd)
	{
		System.out.println("Username : "+usernm);
		System.out.println("Password : "+pwd);
		System.out.println("Login Successful ");
		return true;
		
		
		/* if(!usernm.isEmpty() && !pwd.isEmpty())
		{System.out.println("Login Successful ");
		Assert.assertTrue(true);}
		else {
		System.out.println("Login UnnnnnSuccessful ");
		//Assert.assertTrue();}
		 * */
		 
	}
	

}

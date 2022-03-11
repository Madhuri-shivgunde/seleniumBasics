package myTestPack;

import org.testng.annotations.Test;


// here, SearchProductTest() and orderProductTest(), makePaymentTest()  method execution depends on LoginUserTest
//i.e. once user has loged in then only search and order amd do payment
// so need to use DependsOnmethod parameter in @Test annotation
public class DependsOnMethodConcept {

		@Test
		public void loginUserTest()
		{
			System.out.println("User Login");
		}
		
		@Test(dependsOnMethods="loginUserTest")
		public void searchProductTest()
		{
			System.out.println("Product Search");
		}
		@Test(dependsOnMethods="loginUserTest")
		public void orderProductTest()
		{
			System.out.println("Order Product ");
		}
		@Test(dependsOnMethods="loginUserTest")
		public void makePaymentTest()
		{
			System.out.println("Do Payment ");
		}
		
	// Point to be noted	
	//1.  it is recommended that, write every test independently ie. not depenedent on any other test
	//   try to avoid dependsOnmethods
		
	//	becoz 
		//what if test method on which other testmethod depends fails, other dependent method will get skipped, will not get execute
		// in case of parallel test execution, method should get execute in order then like liginTest-->searchTest
		
	//2. Try to avoid priority also
}

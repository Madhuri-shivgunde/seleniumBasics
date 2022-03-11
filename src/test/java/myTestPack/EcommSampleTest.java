package myTestPack;

import org.testng.annotations.Test;

public class EcommSampleTest {
	// here all tests will get execute in alphabetical order if we do not specify priority 
	//there is no meaning if it gets in nonsequential order of logic
	
	// Result will be as per following when you run
		/*
		 
		 Add to Cart Test
		Login Test
		make UPI PaymentTest
		Order Place Test
		Search Paroduct Test
		view Cart Test
		
		PASSED: addToCartTest
		PASSED: login
		PASSED: makePaymentByUPI
		PASSED: placeOrderTest
		PASSED: searchProductTest
		PASSED: viewCartTest

		 */
	
	// so in this case we need to prioritize tests
	
	
	@Test(priority=0)
	public void login()
	{
		System.out.println("Login Test");
	}
	
	@Test(priority=1)
	public void searchProductTest()
	{
		System.out.println("Search Paroduct Test");
	}
	
	@Test(priority=2)
	public void addToCartTest()
	{
		System.out.println("Add to Cart Test");
	}

	
	@Test(priority=3)
	public void viewCartTest()
	{
		System.out.println("view Cart Test");
	}

	
	@Test(priority=5)
	public void makePaymentByUPI()
	{
		System.out.println("make UPI PaymentTest");
	}

	@Test(priority=4)
	public void placeOrderTest()
	{
		System.out.println("Order Place Test");
	}

	/*
	 
	 Result after specifying priority
	 
	 Login Test
	Search Paroduct Test
	Add to Cart Test
	view Cart Test
	Order Place Test
	make UPI PaymentTest
	
PASSED: login
PASSED: searchProductTest
PASSED: addToCartTest
PASSED: viewCartTest
PASSED: placeOrderTest
PASSED: makePaymentByUPI
	 
	 */
	
}

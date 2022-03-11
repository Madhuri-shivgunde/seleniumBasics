package myTestPack;

import org.testng.annotations.Test;

public class ExcepectedExceptionConcept {
	/* @Test
	public void divisionTest()
	{
		int i=3/0;
		System.out.println(i);
	}
	
	
	/*
		test will get fail and it gives exception 
	 	FAILED: divisionTest
		java.lang.ArithmeticException: / by zero
		
		so to avoid this exception 
		you can declare exceptedExceptions from the Test method
	 
	 */
	
	@Test(expectedExceptions= {ArithmeticException.class, NullPointerException.class})
	public void divisionTest()
	{
		int i=3/0;
		System.out.println(i);
	}

}

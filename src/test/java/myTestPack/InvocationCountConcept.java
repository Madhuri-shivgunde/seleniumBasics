package myTestPack;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	int count=0;
	@Test(invocationCount=10)  //The method will get invoke/execute 10 times
	public void getUserTest()
	{
		count++;
		System.out.println("It gets exexcute 10 times :"+count);
	
	}
}

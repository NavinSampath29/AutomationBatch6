package Day17;

import org.testng.annotations.Test;

public class TestNGTAgs {
	
	// Invocationcount - If we want to a action multiple times invocationcount is used 
	
	@Test(invocationCount =  100 , invocationTimeOut = 1000)
	public void click()
	{
		System.out.println("Click 5 times");
	}
	
	
}

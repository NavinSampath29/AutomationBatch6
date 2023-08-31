package Day16;

import org.testng.annotations.Test;

public class TestNgTags {
	
	@Test
	public void logintc()
	{
		System.out.println("Login TC Executed");
		throw new RuntimeException();	
	}
	
	@Test(dependsOnMethods = "logintc")
	public void hometc()
	{
		System.out.println("hometc TC Executed");
	}

	@Test(dependsOnMethods = "hometc")
	public void logouttc()
	{
		System.out.println("logouttc TC Executed");
	}
	
	

}

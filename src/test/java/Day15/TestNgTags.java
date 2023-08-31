package Day15;

import org.testng.annotations.Test;

public class TestNgTags {
	
	// FirstTc01
	// SecondTc02
	// ThirdTc03
	// FourthTC04
	
	@Test(priority =1)
	public void FirstTc01()
	{
		System.out.println("First Tc has been executed");
	}
	@Test(priority =2)
	public void SecondTc02()
	{
		System.out.println("Second Tc has been executed");
	}
	
	@Test(priority =3)
	public void ThirdTc03()
	{
		System.out.println("Third Tc has been executed");
	}
	
	@Test(priority =4)
	public void FourthTC04()
	{
		System.out.println("Four Tc has been executed");
	}
	
	
	
	

}

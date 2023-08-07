package ecommerce;

import org.testng.annotations.Test;

public class Mobile {
	
	@Test(enabled=false)
	public void mobilesamsung()
	{
		System.out.println("s22");
	}
	@Test
	public void mobileiphone()
	{
		System.out.println("15 pro");
	}
	@Test(groups= {"smoke"})
	public void mobileonepluse()
	{
		System.out.println("11r");
	}

}

package ecommerce;

import org.testng.annotations.Test;

public class Ac {

	@Test(timeOut= 4000)
	public void lg()
	{
		System.out.println("gggg lg");
	}
	@Test(groups= {"smoke"})
	public void voltas()
	{
		System.out.println("volt ass");
	}
}

package ecommerce;


import org.testng.annotations.Test;

public class Product {

	
	@Test
	public void tv()
	{
		System.out.println("tv");
	}
	@Test(groups= {"smoke"})
	public void laptop()
	{
		System.out.println("laptop");
	}
	@Test
	public void mobile()
	{
		System.out.println("mobile");
	}
	@Test
	public void fridge()
	{
		System.out.println("fridge");
	}
	
}

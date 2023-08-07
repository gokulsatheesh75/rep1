package ecommerce;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Bankng {
	
	@Test
	public void cod()
	{
		System.out.println("cash no delivery");
	}
	@Test
	public void creditcard()
	{
		System.out.println("credit card");
	}
	@Test(groups= {"smoke"})
	public void debitcard()
	{
		System.out.println("debit card");
	}
	//@Parameters({"url"})
	@Test
	public void giftcard()//String uname
	{
		System.out.println("gift card");
		//System.out.println(uname);
	}

}

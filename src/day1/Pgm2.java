package day1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Pgm2 {

	@Test
	public void m1()
	{
		System.out.println("hi");
	}
	@Test
	public void m2()
	{
		System.out.println("hello");
	}
	
	@BeforeSuite
	public void m3()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void mr()
	{
		System.out.println("aftr suit");
	}
	
}

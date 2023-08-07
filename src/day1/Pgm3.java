package day1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pgm3 {
	
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
		System.out.println("after suit");
	}
	@BeforeTest
	public void m5()
	{
		System.out.println("before test");
	}
	@AfterTest
	public void m6()
	{
		System.out.println("after test");
	}

}

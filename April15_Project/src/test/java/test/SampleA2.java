package test;

import org.testng.annotations.Test;

public class SampleA2 {
	
	@Test(priority = 1)
	public void test01()
	{
		System.out.println("Test Case 01");
	}
	
	@Test(priority = 5)
	public void test02()
	{
		System.out.println("Test Case 02");
	}
	
	@Test(priority = 2,enabled = false)
	public void test03()
	{
		System.out.println("Test Case 03");
	}
	
	@Test(priority = 4)
	public void test04()
	{
		System.out.println("Test Case 04");
	}
	
	@Test(priority = 3)
	public void test05()
	{
		System.out.println("Test Case 05");
	}

}

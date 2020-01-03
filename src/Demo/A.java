package Demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class A 
{
	@BeforeClass
	void add1()
	{
		System.out.println(1);
	}
	@BeforeTest
	void add2()
	{
		System.out.println(2);
	}
	@BeforeGroups
	void add3()
	{
		System.out.println(3);
	}
	@BeforeMethod
	void add4()
	{
		System.out.println(4);
	}
	@BeforeSuite
	void add5()
	{
		System.out.println(5);
	}
	@Test
	void test()
	{
		System.out.println("test");
	}
}

package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonPackage.CommonDataSetup;

public class Grouping2TCbyClasslLevelandMethodLevel2 extends CommonDataSetup {

	@Test(priority=1,groups="regression")
	public void aTest1()
		{
		System.out.println("Test1");
	}
	
	
	@Test(priority=2,groups ="regression")
	public void aTest2()
	{
		System.out.println("Test2");
	}

	
	@Test(priority=3,groups= {"regression","bvt"})
	public void aTest3()
	{
		System.out.println("Test3");
	}
	
	@Test(priority=4,groups= "bvt")
	public void aTest4()
	{
		System.out.println("Test4");
	}
	
	
	@Test(priority=5, groups = {"regression","bvt"})
		public void aTest5()
	{
		System.out.println("Test5");
	}

	
	
}

package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import CommonPackage.BaseTest;

public class DependencyTest{
	
	@Test
	public void  userRegistrationTest()
	{
	
		System.out.println("This is test1");
		Assert.assertTrue(false);
	}
		
		
	@Test(dependsOnMethods="userRegistrationTest", alwaysRun=true)
	public void userSearchTest()
	{
		Reporter.log("This is Test2 Report");
		System.out.println("This is Test2");
		
		}
		
	@Test
	public void reporterTest3()
	{
		System.out.println(" This iS Test3");
	}
	

	@Test
	public void reporterTest4()
	{
		System.out.println(" This iS Test4");
	}
	
	
	
	
}

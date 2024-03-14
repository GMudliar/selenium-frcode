package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogintTest {
	@BeforeTest
	public void LogintoApplication()
	{
		System.out.println("login to application");
	
	}
	
	@AfterTest
	public void logoutfromapplication()
	
	{
		System.out.println("This logout from application");
		}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
		}
	@AfterMethod
	public void didconnectFromDB()
	{
		System.out.println("DB disConnected");
		}
	
	@Test(priority=2,description="This is a login test",groups="regression")
	public void aTest1()
	
	{
		System.out.println("Test1");
	}
	@Test(priority=1,description="This is a logout test")
	public void aTest2()
	{
		System.out.println("Test2");
	}

}

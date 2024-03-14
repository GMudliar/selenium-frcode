package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class DataproviderTest {
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderDiffFile.class)
	public void test(String username, String password)
	
	{
		System.out.println(username + " " +password);
		
	}
	
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderDiffFile.class)
	public void test1(String username, String password, String test)
	
	{
		System.out.println(username + " " +password+ " "+test);
		
	}
	
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderDiffFile.class)
	public void test2(String username, String password, String test, String test1)
	
	{
		System.out.println(username + " " +password+ " "+test+ "" +test1);
		
	}
	
	
	
	
	/*@DataProvider(name= "create")
	public Object[][] dataset1()
	{
	
	return new Object[][]
			{
		{"username","password","test"},
		{"username1","password1","test1"},
		{"username2","password2","test2"}
			};
			
	}

	
	
	@DataProvider
	public Object[][] dataSet()
	
	{
		Object[][] dataset = new Object[4][2];
	
		// 1st row , 1st col
		dataset[0][0] = "user1";
		dataset[0][1]= "pass1";
		
		//2nd row , 2nd col
		dataset[1][0] = "user2";
		dataset[1][1]= "pass2";
		
		//3rd row, 3rd col
		dataset[2][0] = "user3";
		dataset[2][1]= "pass3";
		
		
		//4th row, 4th column
		dataset[3][0] = "user4";
		dataset[3][1]= "pass4";
		
		return dataset;
		
		
		
	}
	*/
	
	
	
	
	
	
	
	

}

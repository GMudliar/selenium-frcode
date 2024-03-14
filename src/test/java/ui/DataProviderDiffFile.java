package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDiffFile {
	
	@DataProvider(name= "create")
	public Object[][] dataSet1(Method m)
	{
	Object[][]testdata =null;
	
	if(m.getName().equals("test"))
	{
		testdata = new Object[][]
				{
		{"username","password",},
		{"username1","password1",},
		{"username2","password2",}
			};
	}
			
			
			else if (m.getName().equals("test1"))
			
		{
		testdata = new Object[][]
		
				{
			{"username","password","third"},
			{"username1","password1","third1"},
			{"username2","password2","third2"}
				
					};
				}
			else if (m.getName().equals("test2"))
				
			{testdata = new Object[][]
					{
				{"username","password","third","fourth"},
				{"username1","password1","third1","fourth"},
				{"username2","password2","third2","fourth"}
					
						};
			}
			
	return testdata;
			}
	}
	
			
	
	

	
	
/*	@DataProvider
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
	



package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestcase {
	
	Boolean datasetup =false;
		
	
	@Test(enabled=false)
	public void skiptest1()
	{
		System.out.println("This is a Skip test");
		
	}
		@Test
		public void skiptest2()
		{
			System.out.println("This is a Skip test forcefully");
			throw new SkipException("Skipping this test");
		}

		@Test
		public void skiptest3()
		{
			
			
			System.out.println("This is a Skip testbased on condition");
			if(datasetup ==true)
			{
				
				System.out.println("Execute test");
			}
			else {
				System.out.println("Do not execute further test");
				throw new SkipException("Do no execute further steps");
			}
			
		}

		
	

}

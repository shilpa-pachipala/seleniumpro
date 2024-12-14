package testNGpractice1;

import org.testng.annotations.Test;

public class Prioritytestng {
	
	@Test(priority=1)
	void openURL() 
	{
		System.out.println("open Webpage");
	}
	@Test (priority=2)
	void correctlogins()
	{
		System.out.println("enter login details");
	}
	@Test(priority=5)
	
	void submitlogin()
	{
		System.out.println("click on login button");
	}
	@Test (priority=9)
	
	void dashboard()
	{
		System.out.println("dashboard shows");
	}

}

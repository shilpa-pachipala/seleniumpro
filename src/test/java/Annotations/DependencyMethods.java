package Annotations;

import org.testng.annotations.Test;

public class DependencyMethods {
	@Test(priority=2)
	void Openapp()
	{
		
		System.out.println("Open the application ");
	}
	@Test(priority=1)
	void login()
	{
		System.out.println("login to application");
	}

	@Test(priority=3)
	void search()
	{
		System.out.println("Search for customers");
	}
	
	@Test(priority=4)
	void Advsearch()
	{
		System.out.println("search with Advance search bar");
	}
	@Test (priority=5)
	void logout()
	{
		System.out.println("logout from app");
	}
}

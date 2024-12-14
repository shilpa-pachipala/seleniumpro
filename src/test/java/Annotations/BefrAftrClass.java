package Annotations;


import org.testng.annotations.*;

public class BefrAftrClass {
	
	
	@BeforeClass
	void login()
	{
		System.out.println("test Login");
	}
	
	@Test(priority=2)
	void Search()
	{
		System.out.println("Test Search");
	}
	@Test(priority=3)
	void Advancedsearch()
	{
		System.out.println("test Advsearch");
	}
@AfterClass
void logout()
{
	System.out.println("Test logouts123");
}
}

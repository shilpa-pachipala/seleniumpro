package testNGpractice1;

import org.testng.annotations.Test;

public class GroupingTest {
//signup by email,facebook,twitter,payments
	//login by email, facebook, twitter, payments
	
	@Test(priority=6,groups= {"Sanity","regression"})
	void loginByEmail()
	{
		System.out.println("test login by email");
	}
	@Test(priority=5,groups= {"Sanity","exploratory"})
	void loginbyFacebook()
	{
		System.out.println("test login by facebook");
		
	}
	@Test(priority=4,groups= {"Sanity","regression"})
	void loginByTwitter()
	{
		System.out.println("test login by twitter");
	}
	@Test(priority=3,groups= {"explratory"})
	void signupByemail()
	{
		System.out.println("test signup by email");
	}
	
	@Test(priority=2,groups= {"exploratory","regression"})
	void signupbyfacebook()
	{
		System.out.println("test sign up by fb ");
	}
	@Test(priority=1,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("Test signupby twitter");
	}
}

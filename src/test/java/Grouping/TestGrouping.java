package Grouping;

import org.testng.annotations.Test;

public class TestGrouping {
	/*
	1.login by email (Sanity&Regression)
	2.login by fb (Sanity)
	3.login by twitter(Sanity)
	4.signup by email (Regression)
	5.signup by fb (Sanity&Regression)
	6.signup by twitter (Regression)
	7.payment by rs   (Regression)
	8.payment by dollar (Sanity&Regression)
	9.payment by cash  (Sanity)
	*/
	
	@Test(priority=1 , groups={"Sanity","Regression"})
	void loginbyemail()
	{
	System.out.println("this is login from email");
	}
	
	@Test(priority=2, groups= {"Sanity"})
	void loginbyfb()
	{
		System.out.println("login by fb");
	}
	@Test(priority=3,groups= {"Sanity"})
	void loginbytwitter()
	{
		System.out.println("login by twitter");
	}
	
	@Test(priority=4,groups= {"Regression"})
	void signupbyEmail()
	{
		System.out.println("sign up by email");
	}
	@Test(priority=5,groups= {"Sanity","Regression"})
	void signUpByFb()
	{
		System.out.println("Sign up by fb");
	}
	@Test(priority=6,groups= {"Regression"})
	void SignupByTwitter()
	{
		System.out.println("Sign up by twitter");
	}
	@Test(priority=7,groups= {"Regression"})
	void paymentinRs()
	{
		System.out.println("payment in rs");
	}
	@Test(priority=8,groups= {"Sanity","Regression"})
	void PaymentinDollars()
	{
		System.out.println("payment in dollars");
	}
	
	@Test (priority=9, groups= {"Sanity"})
	void paymentbycash()
	{
		System.out.println("payment by cash");
	}

}

package Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertndependsOn {
	
	@Test(priority=1)
	void Url()
	{
		Assert.assertTrue(true);
		
	}
	@Test (priority=2)
	void login()
	{
		Assert.assertTrue(false);
	}
	@Test (priority=3,dependsOnMethods= {"login"})
	void Search()
	{
		Assert.assertTrue(true);
	}
	@Test (priority=4,dependsOnMethods= {"login","Search"})
	void AdvSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}

}

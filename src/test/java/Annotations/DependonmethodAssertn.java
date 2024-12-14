package Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependonmethodAssertn {
	@Test(priority=0)
	void openurl()
	{
	Assert.assertTrue(true);
	}
	@Test(priority=2)
	void search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=1)
	void login()
	{
		Assert.assertTrue(true);
		
	}
	@Test(priority=3)
	void logout()
	{
		Assert.assertTrue(true);
	}
}

package testNGpractice1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencytest {
	@Test(priority=1)
	void openUrl()
	{
		Assert.assertTrue(true);
	}

	@Test(priority=2)
	void login()
	{
		Assert.assertTrue(true);
		
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void dashboard()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods= {"login","dashboard"})
	void Advsearch()
	{
		Assert.assertTrue(true);
	}
}


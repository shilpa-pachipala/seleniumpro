package testNGpractice1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEquals {

	@Test()
	void testa()
	{
		int x=10;
		int y=25;
		
		Assert.assertEquals(x, y);
		
	}
	@Test(priority=2)
	void atestB()
	{
		int a=40;
		int b=40;
		Assert.assertEquals(a, b);
	}
	//Assert.assertEquals method will verify the info and make the test pass/fail
	
}


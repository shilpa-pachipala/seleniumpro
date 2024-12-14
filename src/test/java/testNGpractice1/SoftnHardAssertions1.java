package testNGpractice1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftnHardAssertions1 {

	@Test()
	void HardAssertions()
	{
		System.out.println("testA");
		System.out.println("testX");
		System.out.println("testC");
		System.out.println("testM");
		System.out.println("testP");
		Assert.assertEquals(5,1,"Assertion RESULTS");
		System.out.println("testZ");
	}
}


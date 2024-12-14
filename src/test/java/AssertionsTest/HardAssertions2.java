package AssertionsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions2 {
	
	@Test
	void test()
	{
		int a=10;
		int b=10; //if we compare 10=20 then fails as we used assertions, if else will always pass this condtion
		
		Assert.assertEquals(a,b, "a values is less than b");
	}
}

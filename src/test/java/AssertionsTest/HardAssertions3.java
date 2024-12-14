package AssertionsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions3 {
	
	@Test
	void test1() 
	{
		String s1="shilpa";
		String s2="shilpa";
		
		Assert.assertEquals(s1, s2);
	}

}

package testNGpractice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test()
	void Softassert()
	{
		System.out.println("test abc");
		System.out.println("test abc");
		System.out.println("test abc");
		SoftAssert sa=new SoftAssert();
				sa.assertEquals(1,2);
				System.out.println("softassertion done");
				
	}

}

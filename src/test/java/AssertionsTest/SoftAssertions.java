package AssertionsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	void testa()
	{
		System.out.println("Google");
		System.out.println("Microsoft");
		System.out.println("Wipro");
		SoftAssert sa=new SoftAssert();
				
		
		sa.assertEquals(10, 10);  
		System.out.println("best companies");
		sa.assertEquals(5, 1);
		System.out.println("testing companies");
	}

}

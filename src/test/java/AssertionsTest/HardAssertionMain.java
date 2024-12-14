package AssertionsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionMain {
	
	@Test
	void testa()
	{
		System.out.println("shilpa");
		System.out.println("Vamshi");
		System.out.println("shiva");
		System.out.println("Ramani");
		Assert.assertEquals(1,1); //(1,2) failes and rest of the statements not executing to overcome this
		//use softassertions
		System.out.println("test continue with HardAssertion");
	}

}

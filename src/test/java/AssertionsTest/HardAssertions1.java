package AssertionsTest;

import org.testng.annotations.Test;

public class HardAssertions1 {
	@Test
	void testa()
	{
		int a=10;
		int b=20;  //if else condition does not make the method pass/fail though 10==10 condition does not works here
		//use Assertions to work it out
		
		if(a==b)
			
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}

	
}


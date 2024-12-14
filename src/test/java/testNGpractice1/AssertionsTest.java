package testNGpractice1;

import org.testng.annotations.Test;

public class AssertionsTest {
	
	@Test(priority=1)
	void testa()
	
	{
		int x=18;
		int y=10;
		if(x==y)
		{
			System.out.println("x is equals to y");
		}
		else
		{
			System.out.println("test failed");
		}
	}
// Assertion can only make the test pass/fail, if else condition always pass the condition, cant use if else
	//with testNG 
}

package testNGpractice1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyListeners1 implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		System.out.println("on test startpoint");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test got passed");
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("on test failures1");
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("on test Skipped1");
	}

	public void onTestFinish(ITestContext context)
	{
		System.out.println("test finished");
	}
}

	

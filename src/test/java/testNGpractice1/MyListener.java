package testNGpractice1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	 public void onStart(ITestResult result) {
		   
		  System.out.println("Test execution is started.......");
		  
		  }
	  
	  
	  public void onTestStart(ITestResult result) {
		  System.out.println("test started...");
		  }
	 
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("test passed...");
		  }
	 
	
	  public void onTestFailure(ITestResult result) {
		  System.out.println("test failed...");
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("test skipped...");
		  }
	  
	  public void onFinish(ITestContext context) {
		  System.out.println("test execution is completed...");
		  }


}
package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUsage implements	ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("??????/////// Test started ???????///////");
		System.out.println("*******************");
		System.out.println("-------------------");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successfull");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("??????/////// Test completed ???????///////");
		System.out.println("*******************");
		System.out.println("-------------------");
		
	}


}

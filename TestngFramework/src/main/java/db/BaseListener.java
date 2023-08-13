package db;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListener implements ITestListener{//interface
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+ "is started");
		System.out.println("Git Practice");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "is passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "is failed");
		System.out.println("took screenshot");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "is skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {//xml file er 
		//context.gettext();
		
	}

	public void onFinish(ITestContext context) {
		
		
	}


}  

package com.CRM.BaseTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener  extends TestBase implements ITestListener{

	public void onFinish(ITestContext  result) {					
         	
		System.out.println("test case finished" +result.getName());
        		
    }		

    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailure(ITestResult result) {	
    	
    	System.out.println("test case failed");
    	failed();
    	
       }		

    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestStart(ITestResult result) {					
    	System.out.println("test case started"  +result.getName());			
        		
    }		

    public void onTestSuccess(ITestResult result) {					
    	System.out.println("test case success"  +result.getName());			
    }
}

package com.Oxhead.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenersTest implements ITestListener {
	
	 public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	    }		

	    public void onStart(ITestContext arg0, String browser) {					
	         	System.out.println("Test");			
	        	
	    }		

	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestFailure(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestStart(ITestResult arg0,String browser) throws Throwable {					
	        // TODO Auto-generated method stub	
	    	BaseTest basetest=new BaseTest();
        	System.out.println("Test");
        	basetest.lunchbrowser(browser);
        	//basetest.run(null);
        	//basetest.close();
	        		
	    }		

	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
	

}

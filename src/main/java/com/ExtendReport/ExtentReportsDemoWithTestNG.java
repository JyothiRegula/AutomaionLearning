package com.ExtendReport;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter ;
    ExtentReports extent;
	WebDriver driver;
	
	
	@BeforeSuite()
	public void setup()
	{
        // start reporters
         htmlReporter = new ExtentHtmlReporter("extentTestNG1.html");
    
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

	}
	
	@BeforeTest
	public void setUpTest()
	{
		    String projectPath = System.getProperty("user.dir");
	       WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
	}
	
	@Test
	public void test1() throws Exception 
	{
            
    ExtentTest test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName(), "Sample description");
        driver.get("https://www.facebook.com/");
        test.pass("navigated to facebook");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
      @Test
        public void test2() throws Exception 
    	{    
   ExtentTest test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName(), "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
            }
 
      @AfterTest
        public void tearDownStep()
        {
        	 driver.close();
             driver.quit();
System.out.println("Test completed successfully");
        }
      
	@AfterSuite()
	public void tearDown()
	{
        // calling flush writes everything to the log file
        extent.flush();
	}

}

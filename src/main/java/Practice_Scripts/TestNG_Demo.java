package Practice_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNG_Demo {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	private static WebDriver driver;
	@BeforeSuite
	public void reportSetUp() {
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extentTestNG1.html");
		// Create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	@Test
	public void reportSetUpTest(){
		System.out.println("welcome extent reports");
	
		
	
	}
	
	
	public void reportSetUpTest2(){
		System.out.println("welcome extent reports2");
	
	}
	
	@AfterSuite
	public void tearDown(){
		
		
		
		
	}
	
	
}
	
	

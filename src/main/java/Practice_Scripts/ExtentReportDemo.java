package Practice_Scripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {

	

 
	 	
	 @Test	
	 public void LavanishPatel()
	 {
	 ExtentHtmlReporter htmlreporter;
	 ExtentReports extent;
	 WebDriver driver;	 
	 // start reporters
	 htmlreporter = new ExtentHtmlReporter("Appy6.html");
	 // create extent reports and attach reporter(s)
	 extent =new ExtentReports();
	 extent.attachReporter(htmlreporter);

	 
		String projectPath=System.getProperty("user.dir");

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
		ExtentTest test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName(), "Sample Description");
		driver.get("https://www.facebook.com/");

		// log(LogStatus, details)
		test.pass("Navigate to facebook");
		test.log( Status.INFO,  "This step shows usage of log(status, details)");
		System.out.println("Test completed successfully ");


		// close the popup
		// click on the login button

	 
		driver.close();
		driver.quit();
		extent.flush();
	    

	
	 }
	 
 }




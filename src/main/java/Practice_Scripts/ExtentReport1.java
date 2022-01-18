package Practice_Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport1 {

		ExtentHtmlReporter htmlreporter;
		ExtentReports extent;
		WebDriver driver;

		@BeforeSuite

		public void setUp()
		{
			// start reporters
			htmlreporter = new ExtentHtmlReporter("Lavanish9.html");

			// create extent reports and attach reporter(s)
			extent =new ExtentReports();
			extent.attachReporter(htmlreporter);

		}

		@BeforeTest
		public void setUpTest()
		{

			String projectPath=System.getProperty("user.dir");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@Test
		public void test1() throws Exception
		{

			ExtentTest test = extent.createTest( Thread.currentThread().getStackTrace()[1].getMethodName(), "Sample Description");
			driver.get("https://www.facebook.com/");

			// log(LogStatus, details)
			test.pass("Navigate to facebook");
			test.log( Status.INFO,  "This step shows usage of log(status, details)");
			test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
			test.addScreenCaptureFromPath("screenshot.png");
			

			// close the popup
			// click on the login button

		} 

		@AfterTest
		public void tearDownStep()
		{
			driver.close();
			driver.quit();
			System.out.println("Test completed successfully ");


		}
		@AfterSuite

		public void tearDown()
		{

			// calling flush writes everything to the log file
			driver.quit();
			extent.flush(); 
		}

	}





package Practice_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	
	public  WebDriver driver;
	private ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	
	
	//@BeforeTest
	
	public void run1() throws Throwable{
		// start reporters
	 htmlreporter = new ExtentHtmlReporter("extentReports4.html");

		// create extent reports and attach reporter(s)
	 extent =new ExtentReports();
		extent.attachReporter(htmlreporter);
		
	}
	@Test
	public void run2() throws Throwable {
		// creates a toggle for the given test, adds all log events under it    
		 ExtentTest test1 = extent.createTest("oxhead search","this is a test to validate oxhead site login funtionality");

		String projectPath=System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver",projectPath+"./drivers");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// log(LogStatus, details)
		test1.log(Status.INFO,"Starting test case");
		test1.pass("Navigate to oxhead site");

		driver.get("https://oxheaduatstg.wpengine.com/?v=47e5dceea252");
		Thread.sleep(3000);
		
		// close the popup
		driver.findElement(By.className("mfp-close")).click();
		test1.pass("clicked on the login button");
		Thread.sleep(2000);

		// click on the login button
		driver.findElement(By.className("wd-tools-text")).click();
		Thread.sleep(2000);
		
		test1.pass("closed the browser");
		test1.info("Test completed");
	}
		 
		
		//@AfterTest
	
		public void tearDown() {
			 
			// calling flush writes everything to the log file
			driver.quit();;
		}
		
	}




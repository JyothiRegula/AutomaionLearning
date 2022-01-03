package Practice_Scripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Oxhead.CommonUtils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest1 {
	
	WebDriver driver;
	Logger log = Logger.getLogger(LoginTest1.class);
	
	// what is log? : capturing info/activities at the time of program execution
	// types of logs
		// 1.info
		//2. warn
		//3.error
		//4. fatal
	
	// how to generate the logs? : use Apache Log4j API (log4j.jar)
	// how it works ? ; it reads log 4j configuration from  "log4j.properties"  file
	// where to create : create inside resources folder ---src/main/resources
	
		@BeforeMethod
		public void setUp(){
			
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com");
		
		log.info("entering application url");
		log.warn(" hey this is just warning message");
		log.fatal( "hey this is just a fatal error message");
		log.debug("this is just a debug message");
	}
		@Test(priority = 1)
		public void freeCRMTitleTest(){
			String title= driver.getTitle();
			System.out.println(title);
			log.info("login page title is---->" +title);
			Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.");
		}
		
		@Test(priority = 2)
		public void freeCRMLogoTest() {
			
			boolean b=driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed();
			Assert.assertTrue(b);
			
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
			
		}
		
	
	
	
	
	
	
	

}

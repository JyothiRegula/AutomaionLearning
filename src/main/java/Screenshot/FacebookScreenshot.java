package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookScreenshot {
	
	public WebDriver driver;
	
	@Test
	public void captureScreeshot() {
		

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Utility.captureScreenshot(driver,"Browser started");
		driver.findElement(By.id("76"));
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			
			
			Utility.captureScreenshot(driver,result.getName());
		}
		driver.quit();
	}
	
	
	
	
	
	
	

}

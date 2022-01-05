package Listeners;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1{
	public WebDriver driver;

	@Test
	public void googleTitle() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("hii");
		TakesScreenshot ts = (TakesScreenshot)driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dest= new File(System.getProperty("C:\\project1\\AutomaionLearning\\ Screenshots\facebook.jpg"));
    	
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		System.out.println("Screenshot is taken");
		
		driver.close();
	}
	
	 
}

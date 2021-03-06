package demo.login;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CRM.CommonUtils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	// super call constructor
	public TestBase()
	{
		
		try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("C:\\project1\\AutomaionLearning\\src\\main\\java\\com\\Oxhead\\config\\config.properties");
				prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}
   }
	public static void intialisation(){
		
		 String browser = prop.getProperty("browser");
		 if(browser.equalsIgnoreCase("Chrome"))
			{
				// open the browser
			 	WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}


			else if(browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
		 
	
			// enter the url
			
		 driver.get(prop.getProperty("url"));
		 // close the popup
		 driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
		 
	}
	
	
	
	

}

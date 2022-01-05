package Practice_Scripts;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.CRM.CommonUtils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	public static WebDriver driver;
		
	@Test
	 public static void readPropFile() throws Throwable {
		 Properties prop = new Properties();
				 try {
					 
					InputStream ip =new FileInputStream("C:\\project1\\AutomaionLearning\\src\\main\\java\\com\\Oxhead\\config\\config.properties");
					prop.load(ip);
					System.out.println(prop.getProperty("browser"));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 		
				 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 // enter url
				 driver.get(prop.getProperty("url"));
				
				 // click on Gmail
				 driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	
				 // enter username
				 driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jyothi.rpee9@gmail.com");
				 Thread.sleep(2000);
				 
				 //click on next button
				 driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
				 System.out.println("You are in Next");
				 
				  // enter password
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jyothi@143");
				
				 Thread.sleep(2000);
				  //click on login button
				  //driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
				  //Thread.sleep(2000);
				  
				 driver.quit();
				 
	 }
				
				 
  }

		
		  
	 

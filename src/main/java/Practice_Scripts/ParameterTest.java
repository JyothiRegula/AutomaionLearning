package Practice_Scripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	 
	WebDriver driver;
	@Test
	@Parameters({"url","email"})
	public void googleLoginTest(String url,String email) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup(); // setting path
		driver= new FirefoxDriver();   // upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("enter url");
		driver.get(url);
		
		//click on sign in
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//Thread.sleep(2000);
		
		// enter email 
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		//Thread.sleep(2000);
		
		// click on next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(2000);
		
	}
	
	 

}

package Practice_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1 {
@Test
	
	public void testing() throws Throwable {
	System.out.println("Testing point ");	
	WebDriverManager.chromedriver().setup(); // setting path
	WebDriver driver= new ChromeDriver();   // upcasting
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://oxheaduatstg.wpengine.com/?v=47e5dceea252");
	Thread.sleep(3000);
	driver.findElement(By.className("mfp-close")).click();
	driver.close();
}
}

package Practice_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	WebDriver driver;
	 
	@BeforeMethod
	public void setUp() throws Throwable {	
	WebDriverManager.chromedriver().setup(); // setting path
	driver= new ChromeDriver();   // upcasting
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://oxheaduatstg.wpengine.com/?v=47e5dceea252");
	Thread.sleep(3000);
	
	}
	@Test(priority = 1,groups ="Title")
	public void oxHeadTitleTest(){
	
		String title = driver.getTitle();
		System.out.println(title);
		// Validation
		Assert.assertEquals(title, "Oxhead" ,"title is not matched");
	}
	@Test(priority = 2,groups ="Logo")
		public void oxHeadLogoTest() throws Throwable{
		Thread.sleep(3000);
		boolean b1 = driver.findElement(By.xpath("//div[@class='whb-main-header']//div[@class='whb-column whb-col-left whb-visible-lg']//img[@alt='Oxhead']")).isDisplayed();
		System.out.println("oxheadlogo");
		// Validation
		Assert.assertEquals(b1, true);
	}
	@Test(priority = 3,groups ="LinkTest")
	public void aboutLinkTest() throws Throwable{
		Thread.sleep(3000);
		 boolean b2 = driver.findElement(By.xpath("//span[text()='About']")).isDisplayed();
		 System.out.println("AboutLinkTest");
		 //Validation
		 Assert.assertEquals(b2, true);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
	}
}

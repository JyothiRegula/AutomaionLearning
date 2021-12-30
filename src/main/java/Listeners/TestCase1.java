package Listeners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	@Test
	public void googleTitle() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
		String title = "Google";
		Assert.assertEquals(title,"Google");
		driver.close();
	}
	@Test
	public void logoTest() {
		
		System.out.println("Google logo");
		
	}
	
}
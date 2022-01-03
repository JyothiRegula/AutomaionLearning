package com.Oxhead.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MytestCase {
	
	@Test
	public void Googleverify() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		
	}


}

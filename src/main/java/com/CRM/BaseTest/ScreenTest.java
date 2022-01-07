package com.CRM.BaseTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenTest  extends TestBase{
	
	@BeforeMethod
	public void setUp() {
		
		intialisation();
	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	@Test
	public void takeScreenTest() {
		
		Assert.assertEquals(false, true);
		
		
		
		
	}
}

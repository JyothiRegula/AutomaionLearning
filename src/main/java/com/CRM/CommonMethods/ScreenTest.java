package com.CRM.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.BaseTest.TestBase;
import com.CRM.Listeners.CustomListener;
import com.CRM.Pages.LoginPage;

@Listeners(CustomListener.class)
public class ScreenTest  extends TestBase{
	
	@BeforeMethod
	public void setUp() {
		
		intialisation();
	}
	@Test
	public void takeScreenshot() {

		/*System.out.println("Welcome to OrangeHRM");

		String title= LoginPage.verifyLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title,"OrangeHR");*/
		Assert.assertEquals(false, true);

		 
	}
	@AfterMethod
	public void tearDown() throws Throwable {
		 Thread.sleep(2000);
		driver.quit();
		
	}
}

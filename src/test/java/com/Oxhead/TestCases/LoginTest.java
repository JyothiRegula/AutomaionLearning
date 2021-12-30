package com.Oxhead.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

import com.Oxhead.BaseTest.TestBase;
import com.Oxhead.Pages.HomePage;
import com.Oxhead.Pages.LoginPage;

public class LoginTest extends TestBase {
	 
	// test script execution starts from here @test
	LoginPage loginPage;
	HomePage homePage;
	
	
	
	@BeforeMethod
	public void setUp() {
		
		 
		intialisation();
	 
		
	}
	
	// test scripts running from here
	
	@Test(priority = 1)
	public void LoginPageTitleTest() {
	
			System.out.println(" hii login test1");
		
		 String title= loginPage.validateLoginPageTitle();
		 System.out.println(title);
		Assert.assertEquals(title,"Oxhead");
	}

	/*@Test(priority = 2)
	public void OxheadLogoTest(){
			System.out.println(" hii login test2");
			LoginPage loginPage = new LoginPage();
			boolean lp = loginPage.validateOxheadLogo();
			Assert.assertTrue(lp);
	}*/
	
	
	@Test(priority = 2)
	public void loginTest() {
		System.out.println(" hii login test3");
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	} 
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}

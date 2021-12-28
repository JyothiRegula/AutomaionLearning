package com.Oxhead.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Oxhead.BaseTest.TestBase;
import com.Oxhead.Pages.HomePage;
import com.Oxhead.Pages.LoginPage;

public class LoginTest extends TestBase {
	
	private static final String Sytem = null;
	LoginPage loginPage;
	HomePage homePage;
	// test script execution starts from here @test
	
	public LoginTest() {
		
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		intialisation();
		LoginPage loginPage = new LoginPage();
		
	}
	
	// test scripts running from here
	
	@Test(priority = 1)
	public void LoginPageTitleTest() {
	
			System.out.println(" hii login test1");
		 String title= loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Oxhead");
	}

	/*@Test
	public void OxheadLogoTest(){
		  boolean flag = loginPage.validateOxheadLogo();
	}*/
	
	
	@Test(priority = 2)
	public void loginTest() {
		System.out.println(" hii login test2");
		  homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}

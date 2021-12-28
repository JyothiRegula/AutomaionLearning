package com.Oxhead.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Oxhead.BaseTest.TestBase;
import com.Oxhead.Pages.HomePage;
import com.Oxhead.Pages.LoginPage;

public class LoginTest extends TestBase {
	 
	// test script execution starts from here @test
	
	@BeforeMethod
	public void setUp() {
		intialisation();
	
		
	}
	
	// test scripts running from here
	
	@Test(priority = 1)
	public void LoginPageTitleTest() {
	
			System.out.println(" hii login test1");
			LoginPage loginPage = new LoginPage();
		 String title= loginPage.validateLoginPageTitle();
		 System.out.println(title);
		Assert.assertEquals(title,"Oxhead");
	}

	/*@Test
	public void OxheadLogoTest(){
		  boolean flag = loginPage.validateOxheadLogo();
	}*/
	
	
	@Test(priority = 2)
	public void loginTest() {
		System.out.println(" hii login test2");
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		
		
		  homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}

package com.CRM.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

import com.CRM.BaseTest.TestBase;
import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

public class LoginTest extends TestBase {
	 
	// test script execution starts from here @test
	LoginPage loginPage;
	HomePage homePage;
	
	
	
	@BeforeMethod
	public void setUp() {
		
		 
		intialisation();
	 
		
	}
	
	// test scripts running from here
	
	@Test
	public void LoginPageTitleTest() {
	
			System.out.println("Welcome to OrangeHRM");
		
		 String title= loginPage.validateLoginPageTitle();
		 System.out.println(title);
		Assert.assertEquals(title,"OrangeHRM");
	}

	/*@Test(priority = 2)
	public void OxheadLogoTest(){
			System.out.println(" hii login test2");
			LoginPage loginPage = new LoginPage();
			boolean lp = loginPage.validateOxheadLogo();
			Assert.assertTrue(lp);
	}*/
	
	
	@Test
	public void loginTest() {
		System.out.println("OrangeHRM loginpage");
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		homePage= loginPage.login(prop.getProperty("Username"),prop.getProperty("Password"));
	} 
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}

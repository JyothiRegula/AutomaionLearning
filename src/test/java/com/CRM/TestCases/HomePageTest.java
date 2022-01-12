package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.BaseTest.TestBase;
import com.CRM.Pages.AdminPage;
import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AdminPage adminPage;
	
	
	@BeforeMethod
	public void setUp() {
		
		 
		intialisation();
		loginPage = new LoginPage();
		adminPage = new AdminPage();
		homePage= loginPage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		
	}
	@Test
	public void HomePageTitleTest() {
		
	 String homePageTitle = homePage.verifyHomePageTitle();
	 Assert.assertEquals(homePageTitle,"OrangeHRM","home page title is not matched");
	}

	@Test
	public void clickOnAdminPageTest() {
		
		adminPage = homePage.clickOnAdminLink();
			
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}

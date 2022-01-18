
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
	
=======

	package com.OrangeHRM.testcases;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.OrangeHRM.BaseTest.TestBase;
	import com.OrangeHRM.CommonUtils.Testutil;
	import com.OrangeHRM.pages.AdminPage;
	import com.OrangeHRM.pages.HomePage;
	import com.OrangeHRM.pages.LoginPage;

	public class HomePageTest extends TestBase {
		LoginPage loginPage;
		HomePage homePage;
		AdminPage adminPage;
		
		
		public HomePageTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			intialisation();
			loginPage = new LoginPage();
			adminPage=new AdminPage();
			homePage=loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		}
		
		@Test(priority = 1)
		public void verifyHomePageTitleTest() {
			String homePageTitle = homePage.verifyHomePageTitle();
			Assert.assertEquals(homePageTitle, "OrangeHRM", "home Page Title not matched");
		}

		@Test(priority = 2)
		public void clickOnAdminPageTest() {
			 adminPage = homePage.clickOnAdminLink();
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		

	}

>>>>>>> c6035cd422b46402e06786d52d5d85bd1eaeb53f
}

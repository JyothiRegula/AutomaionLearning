package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.BaseTest.TestBase;

public class HomePage extends TestBase {
	// page factory or Object repository
		// for each nd every page u hv to create separate java classes in project
		// test cases steps
		
		//  to get logo
		@FindBy(xpath ="//img[@alt='OrangeHRM']")
		public WebElement OrgLogo;
		
		// click on admin link
		@FindBy(xpath  ="//b[contains(text(),'Admin')]")
		public WebElement adminLink;
		
		// Initializing the page objects
		public HomePage(){
			PageFactory.initElements(driver, this);
			}
		
		public String verifyHomePageTitle() {
			return  driver.getTitle();
			}
		public AdminPage clickOnAdminLink() {
			adminLink.click();
			
			return  new AdminPage();
			
			
		}
		
}

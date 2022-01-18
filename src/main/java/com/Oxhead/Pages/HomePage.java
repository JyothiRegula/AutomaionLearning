package com.Oxhead.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.BaseTest.TestBase;
import com.CRM.Pages.AdminPage;


public class HomePage extends TestBase {
	
	
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement OrgLogo;

	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement adminLink;

	//Initializing the Page Objects

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public AdminPage clickOnAdminLink() {
		adminLink.click();
		return new AdminPage();
	}
	}


	


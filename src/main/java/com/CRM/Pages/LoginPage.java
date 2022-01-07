package com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.BaseTest.TestBase;

public class LoginPage extends TestBase{

	// page factory or Object repository
	// for each nd every page u hv to create separate java classes in project
	// test cases steps
	
	// enter the username
	@FindBy(id ="txtUsername")
	public WebElement Username;
	
	// enter password
	@FindBy(id ="txtPassword")
	public WebElement Password;
	
	// click on login button
	@FindBy(name = "Submit")
	public WebElement loginBtn;
	

	
	// Initialising the Page Objects:
	public LoginPage(){

		PageFactory.initElements(driver,this);
		
	}
	
	// Actions:
	public static String validateLoginPageTitle(){
		return driver.getTitle();
	}
	// This method is for OrangeHRM logo feature
	
	/*public boolean validateOxheadLogo(){
		return oxheadLogo.isDisplayed();
		
		
	}*/
	
	public HomePage login(String un,String pwd){
		
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage() ;
		
	}

	 
	
	
	

}

package com.Oxhead.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Oxhead.BaseTest.TestBase;

public class LoginPage extends TestBase{

	// page factory or Object repository
	// for each nd every page u hv to create separate java classes in project
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement loginBtn;
	
	@FindBy(xpath ="//a[@class='btn btn-style-link btn-color-primary create-account-button']")
	WebElement signUpbBtn;
	
	// Initialising the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver,this);
		
	}
	
	// Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	// This method is for oxHead logo feature
	
	/*public void validateOxheadLogo(){
		return oxheadLogo.isDisplayed();
		
	}*/
	
	public HomePage login(String un,String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage() ;
		
	}
	
	
	

}

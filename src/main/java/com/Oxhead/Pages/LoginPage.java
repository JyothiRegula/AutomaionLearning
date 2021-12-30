package com.Oxhead.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Oxhead.BaseTest.TestBase;

public class LoginPage extends TestBase{

	// page factory or Object repository
	// for each nd every page u hv to create separate java classes in project
	@FindBy(className = "mfp-close")
	WebElement popUp;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
		
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='button woocommerce-button woocommerce-form-login__submit']")
	WebElement loginBtn;
	
	@FindBy(xpath ="//a[@class='btn btn-style-link btn-color-primary create-account-button']")
	WebElement signUpbBtn;
	

	@FindBy(xpath="//img[@src='https://oxheaduatstg.wpengine.com/wp-content/uploads/2021/10/MicrosoftTeams-image-19.png']")
	WebElement imgLogo;

	private WebElement oxheadLogo;
	
	// Initialising the Page Objects:
	public LoginPage(){

		PageFactory.initElements(driver,this);
		
	}
	
	// Actions:
	public static String validateLoginPageTitle(){
		return driver.getTitle();
	}
	// This method is for oxHead logo feature
	
	public boolean validateOxheadLogo(){
		return oxheadLogo.isDisplayed();
		
		
	}
	
	public HomePage login(String un,String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage() ;
		
	}
	
	
	

}

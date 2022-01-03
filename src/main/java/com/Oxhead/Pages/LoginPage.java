package com.Oxhead.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Oxhead.BaseTest.TestBase;

public class LoginPage extends TestBase{

	// page factory or Object repository
	// for each nd every page u hv to create separate java classes in project
	// test cases steps
	
	/*// close the popup
	@FindBy(className ="[class='mfp-close']")
	WebElement popupBtn; */
	

	// click on the sign in/register button
	@FindBy(xpath ="//a[@title='My account']")
	WebElement signInBtn;
	// logo 

	
	@FindBy(xpath ="//img [@src='https://oxheaduatstg.wpengine.com/wp-content/uploads/2021/10/MicrosoftTeams-image-19.png']")
	public WebElement logoBtn;
	// enter the username
	@FindBy(xpath ="//input[@id='username']")
	public WebElement username;
	
	// enter password
	@FindBy(xpath ="//input[@id='password']")
	public WebElement password;
	
	// click on login button
	@FindBy(xpath ="//button[@name='login']")
	public WebElement loginBtn;
	

	
	// Initialising the Page Objects:
	public LoginPage(){

		PageFactory.initElements(driver,this);
		
	}
	
	// Actions:
	public static String validateLoginPageTitle(){
		return driver.getTitle();
	}
	// This method is for oxHead logo feature
	
	/*public boolean validateOxheadLogo(){
		return oxheadLogo.isDisplayed();
		
		
	}*/
	
	public HomePage login(String un,String pwd){
		
	
		signInBtn.click();
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage() ;
		
	}

	private void click() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

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
	

	/*// click on the sign in/register button
	@FindBy(xpath ="/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/span[2]")
	WebElement signInBtn;
	// logo */

	
	@FindBy(xpath ="//img [@src='https://oxheaduatstg.wpengine.com/wp-content/uploads/2021/10/MicrosoftTeams-image-19.png']")
	WebElement logoBtn;
	// enter the username
	@FindBy(xpath ="//input[@id='username']")
	WebElement username;
	
	// enter password
	@FindBy(xpath ="//input[@id='password']")
	WebElement password;
	
	// click on login button
	@FindBy(xpath ="//button[@name='login']")
	WebElement loginBtn;
	

	
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
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage() ;
		
	}
	
	
	

}

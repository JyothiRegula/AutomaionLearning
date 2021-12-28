package com.Oxhead.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Oxhead.Listeners.BaseTest;

public class LoginPage_POM extends BaseTest{
	public LoginPage_POM(WebDriver driver) {
     this.driver=driver;	
	}
	
	//accessspecifier returnType elementname = driver.findelement(locator(locatorvalue));
	// WebElement untb = driver.findElement(By.id("username"));
	//Declaration
	//@FindBy(locatorName="loactorValue") accessspecifier returnType elementname
	@FindBy(id="username") public WebElement USERNAME;
	
	//Initialization
	
	
	
	
	
	//utilization
	// two types ----> getters/setters
	// getters are used to get the address of element
	// setters are used to write some actions
	public WebElement getUntb(){
		return USERNAME;

	}
	public void setUntb(String un) {
		untb.sendKeys(un);
	}
	
}

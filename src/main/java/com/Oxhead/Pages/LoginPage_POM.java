package com.Oxhead.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.Oxhead.Listeners.BaseTest;

public class LoginPage_POM extends BaseTest{
	private WebDriver driver1;

	public LoginPage_POM(WebDriver driver) {
		WebDriver driver1 =new ChromeDriver();
     this.driver1=driver1;	
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
		WebElement untb = null;
		untb.sendKeys(un);
	}
	
}

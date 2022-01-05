package com.CRM.Methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Listeners.TestCase1;

public class ScreenShot extends TestCase1 {
	public static WebDriver driver;
	
	public void getPageScreenShot(String path){
			// taking screenshot
				TakesScreenshot ts = (TakesScreenshot)driver;
		    	File src = ts.getScreenshotAs(OutputType.FILE);
		    	File dest= new File(System.getProperty("user.dir")+"C:\\project1\\AutomaionLearning\\Screeshots\\google.jpg");
		    	
				try {
					FileUtils.copyFile(src, dest);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Screenshot is taken");
			
	}

}

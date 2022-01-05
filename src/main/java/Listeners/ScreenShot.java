package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot extends TestCase1 {
	public static WebDriver driver;
	
	public void getScreenShot(String path) throws Throwable {
			// taking screenshot
				TakesScreenshot ts = (TakesScreenshot)driver;
		    	File src = ts.getScreenshotAs(OutputType.FILE);
		    	File dest= new File(System.getProperty(path));
		    	
				FileUtils.copyFile(src, dest);
				System.out.println("Screenshot is taken");
			
	}

}

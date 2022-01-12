package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver,String screenshotName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs( OutputType.FILE);
		String path;
		File dest =  new File(path);
		try {
			Files.copy(source,dest);
		
	}
		catch (Exception e) {
			System.out.println(" Exception while taking screenshot" +e.getMessage());
		}
			 
		}

}

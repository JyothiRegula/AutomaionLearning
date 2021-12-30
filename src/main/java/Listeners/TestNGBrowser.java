package Listeners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBrowser {

	@Test
	public void oxheadTitle() {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://oxheaduatstg.wpengine.com/?v=47e5dceea252");
	driver.manage().window().maximize();
	
	}

}

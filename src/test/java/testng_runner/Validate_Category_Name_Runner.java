package testng_runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testng.Validate_Category_Name;
import util.BrowserFactory;

public class Validate_Category_Name_Runner {
	
	WebDriver driver;
	
	@Test
	public void method1() {
		
		driver = BrowserFactory.launchBrowser();
		Validate_Category_Name auto = PageFactory.initElements(driver, Validate_Category_Name.class);
		auto.remove_Duplicates();
		BrowserFactory.tearDown();
				
		
		
	}

}

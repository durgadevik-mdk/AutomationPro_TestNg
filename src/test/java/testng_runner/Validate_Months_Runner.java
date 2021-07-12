package testng_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testng.Validate_Months;
import util.BrowserFactory;

public class Validate_Months_Runner {
WebDriver driver;
	
	@Test
	public void method1() {
		
		driver = BrowserFactory.launchBrowser();
		Validate_Months monthvalidation = PageFactory.initElements(driver, Validate_Months.class);
		monthvalidation.drop_down_verification();
		BrowserFactory.tearDown();
				
		
		
	}

}



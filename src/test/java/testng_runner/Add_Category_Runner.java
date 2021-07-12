package testng_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testng.Add_Category;
import util.BrowserFactory;

public class Add_Category_Runner {
	

	WebDriver driver;
	
	@Test
	public void method1() {
		
		driver = BrowserFactory.launchBrowser();
		Add_Category add = PageFactory.initElements(driver, Add_Category.class);
		add.add_Category();
		BrowserFactory.tearDown();
				
		
		
	}

}




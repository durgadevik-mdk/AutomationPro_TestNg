package testng;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Add_Category {
	
	WebDriver driver;

	public Add_Category(WebDriver driver) {

		this.driver = driver;

	}

	final String categoryname = "ITINTECHFIOS";

	@FindBy(how = How.CSS, using = "input[name='categorydata']")
	WebElement ADD_TEXT_TO_CATEGORY;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement ADD_CATEGORY_BUTTON;
	@FindBy(linkText = categoryname)
	WebElement CATEGORY_NAME_ADDED;
	



public void add_Category() {

	ADD_TEXT_TO_CATEGORY.sendKeys(categoryname);
	ADD_CATEGORY_BUTTON.click();
	boolean verifyname = CATEGORY_NAME_ADDED.isDisplayed();
	Assert.assertEquals(verifyname, true , categoryname  + " is not displayed");

}

}

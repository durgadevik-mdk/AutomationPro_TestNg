package testng;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Validate_Category_Name {

	WebDriver driver;

	public Validate_Category_Name(WebDriver driver) {

		this.driver = driver;

	}

	final String categoryname = "HelloWorld";

	@FindBy(how = How.CSS, using = "input[name='categorydata']")
	WebElement ADD_TEXT_TO_CATEGORY;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement ADD_CATEGORY_BUTTON;
	@FindBy(tagName = "body")
	WebElement RETURN_MESSGE_BODY;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Nevermind')]")
	WebElement NEVERMIND_FILED;

	public void remove_Duplicates() {
		ADD_TEXT_TO_CATEGORY.sendKeys(categoryname);
		ADD_CATEGORY_BUTTON.click();
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		String text = RETURN_MESSGE_BODY.getText();
		if (text.contains("The category you want to add already exists:")) {
			System.out.println("The category you want to add already exists:" + categoryname);
			NEVERMIND_FILED.click();
		}

	}

}

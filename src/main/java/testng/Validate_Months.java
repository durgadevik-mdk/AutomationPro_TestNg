package testng;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Validate_Months {

	WebDriver driver;

	public Validate_Months(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(name = "due_month")
	WebElement DROP_DOWN_FIELD;

	public void drop_down_verification() {

		String[] allmonths = { "None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
				"Dec" };
		Select sel = new Select(DROP_DOWN_FIELD);
		List<WebElement> months = sel.getOptions();
		for (int i = 0; i < allmonths.length;) {
			for (WebElement month : months) {
				// System.out.println(month.getText());
				if (month.getText().equals(allmonths[i])) {
					System.out.println("Months Mathced");
					i++;
				} else {
					System.out.println("Months Not Mathced");
				}

			}

		}
	}
}

package step_definitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AP_DressesPage;
import pages.AP_HomePage;

public class AP_verifyDressesPageFeatures {

	AP_HomePage homepage = new AP_HomePage();
	AP_DressesPage dresses = new AP_DressesPage();

	@When("user clicks on dresses")
	public void user_clicks_on_dresses() {
		// navigate to dress
		Assert.assertEquals("DRESSES", homepage.dresses_button.getText());
		homepage.dresses_button.click();

		// verify dress
		Assert.assertEquals("Dresses", dresses.DressesText.getText());

	}

	@Then("successfully verifies three sub category buttons exist")
	public void successfully_verifies_three_sub_category_buttons_exist() {

		List<String> expectedArrayList = Arrays.asList("CASUAL DRESSES", "EVENING DRESSES", "SUMMER DRESSES",
				"WINTER DRESSES");

		List<String> actualArray = new ArrayList<String>();

		for (WebElement eachCategory : dresses.subcategories) {
			System.out.println(eachCategory.getText());

			actualArray.add(eachCategory.getText());

		}

		if (expectedArrayList.equals(actualArray)) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT");
		}

	}

}

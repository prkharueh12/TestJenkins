package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AP_HomePage;
import pages.AP_SearchResultsPage;

public class AP_HomePageSearch_StepDefinition {
	
	
	AP_HomePage homepage = new AP_HomePage();
	AP_SearchResultsPage results = new AP_SearchResultsPage();
	
	@When("User enters a search term")
	public void user_enters_a_search_term() {
	 homepage.searchbox.sendKeys("t-shirt");
	}

	@Then("Search box should contain the search term")
	public void search_box_should_contain_the_search_term() {
	
	}
	
	@When("User enters {string} in search engine")
	public void user_enters_in_search_engine(String dress) {
	  
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	  
	}

	@Then("User should be on Search - My Store page")
	public void user_should_be_on_Search_My_Store_page() {
	   
	}

	@Then("Blouse option should be displayed")
	public void blouse_option_should_be_displayed() {

	}
}

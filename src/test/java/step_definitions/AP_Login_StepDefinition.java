package step_definitions;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AP_HomePage;
import pages.AP_SignInPage;
import utilities.Driver;

public class AP_Login_StepDefinition {

	AP_HomePage homepage = new AP_HomePage();
	AP_SignInPage signin = new AP_SignInPage();
	

@Given("User is already on automation practice homepage")
public void user_is_already_on_automation_practice_homepage() {
System.out.println("Runner is on Home Page of AutomationPractice.com");

 String actual_HomePage_Title = "My Store";
 String expected_HomePage_Title = Driver.getDriver().getTitle();
 
 Assert.assertEquals(expected_HomePage_Title, actual_HomePage_Title);
 
}

@When("User clicks on sign in button")
public void user_clicks_on_sign_in_button() {
  homepage.signIn_Button.click();
}

@When("User enters {string} in Email Address Text Box")
public void user_enters_in_Email_Address_Text_Box(String email) {
signin.email_TextBox.sendKeys(email);
}

@When("User clicks on Create an Account button")
public void user_clicks_on_Create_an_Account_button() {
  signin.submit_Button.click();
}

@Then("User should be on Create an Account Page")
public void user_should_be_on_Create_an_Account_Page() {
  //Login - My Store
	 String actual_CreateAccountPage_Title = "Login - My Store";
	 String expected_CreateAccountPage_Title = Driver.getDriver().getTitle();
	 
	 Assert.assertEquals(expected_CreateAccountPage_Title, actual_CreateAccountPage_Title);
}

@When("User enters Personal Information")
public void user_enters_Personal_Information() {
	System.out.println(". . . filling out personal information . . . ");
}

@When("User enters Address Information")
public void user_enters_Address_Information() {
	System.out.println(". . . filling out address information . . . ");

}

@When("User clicks on Register button")
public void user_clicks_on_Register_button() {
	System.out.println(". . . not clicking on register button . . . ");

}

@Then("User should successfully be landed on My Account page")
public void user_should_successfully_be_landed_on_My_Account_page() {
	System.out.println(". . . should be on account page - created account successfully. . . ");

}

@When("User enters {string} in email Address Text Box")
public void user_enters_in_email_Address_Text_Box(String emailaddy) {
	signin.email_TextBox.sendKeys(emailaddy);
}



	
}

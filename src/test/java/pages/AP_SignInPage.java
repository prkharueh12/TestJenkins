package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AP_SignInPage {
	public AP_SignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id= "email_create" )
	public WebElement email_TextBox;
	
	@FindBy(id= "SubmitCreate" )
	public WebElement submit_Button;
	

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AP_SearchResultsPage {
	public AP_SearchResultsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id= "SubmitCreate" )
	public WebElement blouse;
	
	
}

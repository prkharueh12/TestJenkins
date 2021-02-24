package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AP_DressesPage {

	public AP_DressesPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/span")
	public WebElement DressesText;
	
	@FindBy(xpath = "//div[@id='subcategories']/ul/li")
	public List<WebElement> subcategories;
	
	
	
	
	
	
	
	
	
	
	
	

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AP_HomePage {
	public AP_HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	public WebElement signIn_Button;
	
	@FindBy(id = "search_query_top")
	public WebElement searchbox;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	public WebElement search_Button;
	
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]")
	public WebElement dresses_button;
	
	
	
	
	
	
}

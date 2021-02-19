package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {

	
//	@Before("@project2")
//	public void setUp() {
//		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Driver.getDriver().manage().window().fullscreen();
//		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//	}
//	
	@Before()
	public void setUp2() {
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.getDriver().manage().window().fullscreen();
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@After
	public void tearDown(Scenario scenario) {
		// only takes a screenshot if the scenario fails
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
					.getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
	
	
}

package com.oitavo.cucumber.selenium.setup;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * @author olandim
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report", "json:target/report.json"}, 
				 features = {"src/test/resources/feature/GoogleSearch.feature"},
				 dryRun = false,
				 strict = true,
				 glue = {"com.oitavo.cucumber.selenium.steps"},
				 monochrome = true,
				 tags = {"@done , @wip"})
public class RunCucumberTest {
	
	@AfterClass
	public static void finish(){
		WebDriver driver = SeleniumDriver.getDriver();
		driver.quit();
	}
}

package acceptance;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.SeleniumDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStep {
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	@Before("@start")
	public void init(){
		driver = SeleniumDriver.getDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().setPosition(new Point(200, 100));
	}
	
	@Given("^the user accesses the search page$")
	public void theUserAccessesTheSearchPage() throws Exception {
		driver.get("http://www.google.com");
	}

	@When("^the user clicks enter$")
	public void theUserClicksEnter() throws Exception {
		WebElement btn = driver.findElement(By.name("btnG"));
		wait.until(ExpectedConditions.visibilityOf(btn));
	    driver.findElement(By.name("btnG")).click();
	}

	@Then("^the system should display a text on screen$")
	public void theSystemShouldDisplayATextOnScreen() throws Exception {
		String textExpected = driver.findElement(By.cssSelector(".r>a")).getText();
		Assert.assertTrue(textExpected.contains("Cheese"));
	}

	@When("^the user enter cheese into search field$")
	public void theUserEnterCheeseIntoSearchField() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Cheese");
	}
	
	@When("^the user click on advance search icon$")
	public void theUserclickOnAdvanceSearchIcon() throws Throwable {
		 driver.findElement(By.cssSelector("#abar_button_opt")).click();
	}

	@When("^the user click on advance search link$")
	public void theUserclickOnAdvanceSearchLink() throws Throwable {
		driver.findElement(By.cssSelector("#ab_as>div")).click();
	}

	@When("^the user click on advance search button$")
	public void theUserclickOnAdvanceSearchButton() throws Throwable {
		driver.findElement(By.cssSelector(".jfk-button.jfk-button-action._JQ")).click();
	}
	
	@After("@finish")
	public void finish(){
		driver.quit();
	}
}
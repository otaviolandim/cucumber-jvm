package com.oitavo.cucumber.selenium.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oitavo.cucumber.selenium.setup.SeleniumDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * @author olandim
 */
public class GoogleSearchStep {
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	@Before
	public void init(){
		driver = SeleniumDriver.getDriver();
		wait = new WebDriverWait(driver, 15);
	}
	
	@Given("^the user accesses the search page$")
	public void theUserAccessesTheSearchPage() throws Exception {
		driver.get("http://www.google.com");
	}

	@When("^the user clicks enter$")
	public void theUserClicksEnter() throws Exception {
		WebElement botao = driver.findElement(By.name("btnG"));
		wait.until(ExpectedConditions.visibilityOf(botao));
	    driver.findElement(By.name("btnG")).click();
	}

	@Then("^the system should display a text on screen$")
	public void theSystemShouldDisplayATextOnScreen() throws Exception {
		String textoEsperado = driver.findElement(By.cssSelector(".r>a")).getText();
		assertTrue(textoEsperado.contains("Cheese"));
	}

	@When("^the user enter cheese into search field$")
	public void theUserEnterCheeseIntoSearchField() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Cheese");
	}
	
	@When("^the user clicks on advance search icon$")
	public void theUserclicksOnAdvanceSearchIcon() throws Throwable {
		 driver.findElement(By.cssSelector("#abar_button_opt")).click();
	}

	@When("^the user clicks on advance search link$")
	public void theUserclicksOnAdvanceSearchLink() throws Throwable {
		driver.findElement(By.cssSelector("#ab_as>div")).click();
	}

	@When("^the user clicks on advance search button$")
	public void theUserclicksOnAdvanceSearchButton() throws Throwable {
		driver.findElement(By.cssSelector(".jfk-button.jfk-button-action._JQ")).click();
	}
}
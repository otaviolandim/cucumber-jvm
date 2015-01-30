package acceptance;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStep {
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	@Before
	public void setup(){
		if(driver == null)
		   driver = new FirefoxDriver();
		   driver.manage().window().maximize();		
		   wait = new WebDriverWait(driver, 20);
	}
	
	@Given("^I access the google page$")
	public void iAccessTheGooglePage() throws Exception {
		driver.navigate().to("http://www.google.com");
	}

	@When("^I click enter$")
	public void iClickEnter() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(By.name("btnG"))); 
	    driver.findElement(By.name("btnG")).click();
	}

	@Then("^I should see a text on screen$")
	public void iShouldSeeATextOnScreen() throws Exception {
		Assert.assertTrue(driver.getPageSource().contains("Cheese"));
	}

	@When("^I search for word$")
	public void iSearchForWord() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Cheese");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
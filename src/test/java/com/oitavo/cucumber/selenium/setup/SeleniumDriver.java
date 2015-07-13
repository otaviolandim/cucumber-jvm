package com.oitavo.cucumber.selenium.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * @author olandim
 */
public class SeleniumDriver {
	private static WebDriver driver = null;
	
	public static WebDriver getDriver(){		
		if (driver == null){								
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);			
			driver.manage().window().setPosition(new Point(200, 100));
		}		
		return driver;
	}

}

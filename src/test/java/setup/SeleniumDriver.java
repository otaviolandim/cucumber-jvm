package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriver {
	private static WebDriver driver = null;
		
	public static WebDriver getDriver(){		
		if (driver == null){								
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);			
		}		
		return driver;
	}

}

package acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", 
							"html:target/report-test", 
							"json:target/report-test.json"}, 
					features = {"src/test/resources/feature"},
					tags = {"@done"})
public class RunCucumberTest {
	
}

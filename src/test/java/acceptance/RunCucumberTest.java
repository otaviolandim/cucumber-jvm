package acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report-test", "json:target/report-test.json"}, 
				 features = {"src/test/resources/feature/GoogleSearch.feature"},
				 glue = {"acceptance"},
				 monochrome = true,
				 tags = {"@done"})
public class RunCucumberTest {
	
}

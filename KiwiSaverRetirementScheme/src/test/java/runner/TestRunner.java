package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/automationTests",
				glue= {"stepDefinitions"},
				tags= {"@Regression"},
				plugin= {"pretty", "html:target/cucumber-reports",
						"junit:target/cucumber-reports/Cucumber.xml"}
		)
public class TestRunner {
}
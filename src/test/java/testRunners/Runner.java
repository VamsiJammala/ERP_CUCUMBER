package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles",
		glue = "stepDefinitions",
		tags = "@stockitems",
		dryRun = false,
		plugin = {"pretty","html:./target/cucumber/result.html"}
		)
public class Runner {

}

package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",glue= {"StepForHooks"},
monochrome=true ,
plugin = {"pretty","html:target/Htmlreports.html",
		"junit:target/reports.xml",
		"json:target/Jsonreports.json"})
public class TestRunnerForHooks {
	
}

package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue= {"pages"},
monochrome=true ,
plugin = {"pretty","html:target/Htmlreports.html",
		"junit:target/reports.xml",
		"json:target/Jsonreports.json"})

public class TestRunner {

	
}

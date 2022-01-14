package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		stepNotifications=true,
		glue="stepDefinition",
		monochrome = true,
		tags="@SmokeTest",
		plugin= {"pretty","html:target/HtmlReports/result.html"}
		)

public class TestRunner {
}

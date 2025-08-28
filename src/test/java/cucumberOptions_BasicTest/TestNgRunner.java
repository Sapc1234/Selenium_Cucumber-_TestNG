package cucumberOptions_BasicTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/cucumberFeatureFiles", dryRun = true, glue = "stepDefinitions", monochrome = true, tags = "@SmokeTest or @RegressionTest", plugin = {
		"pretty", "html:target/cucumber.html", "json:target/cucumber.json" })

//tags = "not @RegressionTest"
//tags = "@SmokeTest and @RegressionTest"
//tags = "@SmokeTest "
public class TestNgRunner extends AbstractTestNGCucumberTests

{
	
}

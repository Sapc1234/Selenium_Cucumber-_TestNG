package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//html,xml,json,junit,extent
@CucumberOptions

(
features   = "@target/failed_scenarios.txt", glue = "eComStepdefinitions",
monochrome = true, 
plugin     = { 
		     "html:target/cucumber.html", 
			 "json:target/cucumber.json",
		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			 }
)

public class Ecom_Failed_TestNgRunner extends AbstractTestNGCucumberTests

{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()

	{
		return super.scenarios();
		// How you make your test run parallel in TestNg Cucumber framework
		// -->call the scenarios method from the parent class and the parallel attribute
		// as true
	}

}

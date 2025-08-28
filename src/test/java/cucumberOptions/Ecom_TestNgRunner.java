package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//html,xml,json,junit,extent
@CucumberOptions(features = "src/main/java/ecom_Rsa_FetureFile", glue = "eCom_Rsa_Stepdefinitions", monochrome = true, tags = "@PlaceOrder or @OffersPage", plugin = {
		"html:target/cucumber.html", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenarios.txt" })

public class Ecom_TestNgRunner extends AbstractTestNGCucumberTests

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

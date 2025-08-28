package eCom_Rsa_Stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ecom_Rsa_Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Ecom_Hooks 

{
	TestContextSetup testContextSetup;
	public Ecom_Hooks(TestContextSetup testContextSetup)
	
	{
		this.testContextSetup=testContextSetup;
	}
	
	@After
	
	public void afterScenario() throws IOException
	
	{
		testContextSetup.testBase.WebDriverManager().quit();;
		
	}
	
	@AfterStep
	
	public void addScreenshot(Scenario scenario) throws IOException
	
	{
		WebDriver driver =testContextSetup.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
		//screenshot
		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
		
		}
		
	}
}

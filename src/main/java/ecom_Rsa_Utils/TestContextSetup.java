package ecom_Rsa_Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import eCom_Cucumber_PageObjet.PageObjectManager;

public class TestContextSetup

{
	public WebDriver driver;
	public String product_Name;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	
	public TestContextSetup() throws IOException

	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new  GenericUtils(testBase.WebDriverManager());
	}
}

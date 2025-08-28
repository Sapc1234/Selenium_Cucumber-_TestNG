package eCom_Rsa_Stepdefinitions;

import org.testng.Assert;

import eCom_Cucumber_PageObjet.LandingPage;
import eCom_Cucumber_PageObjet.OffersPage;
import eCom_Cucumber_PageObjet.PageObjectManager;
import ecom_Rsa_Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OffersPageStepDefinitions

{

	public String offerPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	// single responsibility principle
	// loosely coupled means sharing the information from one class to another class
	// with the help of dependency injection

	public OffersPageStepDefinitions(TestContextSetup testContextSetup)

	{
		this.testContextSetup = testContextSetup;
	}

	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException

	{

		// testContextSetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortName);
		// offerPageProductName =
		// testContextSetup.driver.findElement(By.cssSelector("tbody
		// tr td:nth-child(1)")).getText();

		switchOfferPage();
		// OffersPage op = new OffersPage(testContextSetup.driver);
		OffersPage op = testContextSetup.pageObjectManager.getOfferPage();
		op.enterSearchItem(shortName);
		Thread.sleep(2000);
		offerPageProductName = op.getProductName();
	}

	public void switchOfferPage()

	{
		// if switched to offer page ->skip below part
		// if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))

		// testContextSetup.driver.findElement(By.cssSelector(".cart-header-navlink[href='#/offers']")).click();

		// PageObjectManager pageObjectManager = new
		// PageObjectManager(testContextSetup.driver);

		// LandingPage lp = new LandingPage(testContextSetup.driver);

		// LandingPage lp = pageObjectManager.getLandingPage();

		LandingPage lp = testContextSetup.pageObjectManager.getLandingPage();
		lp.selectTopdeals();
		testContextSetup.genericUtils.switchToChild();
		// explicit wait, parse string

	}

	@And("^Validate product name in offers page matches with landing page$")
	public void validate_product_name_in_offers_pag_matches_with_landing_page() throws Throwable

	{
		// Assert.assertEquals(offerPageProductName, product_Name);
		Assert.assertEquals(offerPageProductName, testContextSetup.product_Name);
		System.out.println(offerPageProductName);
		System.out.println("The product validation is successfully completed");

	}
}

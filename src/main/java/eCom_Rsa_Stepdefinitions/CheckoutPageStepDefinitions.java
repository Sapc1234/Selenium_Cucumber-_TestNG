package eCom_Rsa_Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import eCom_Cucumber_PageObjet.CheckoutPage;
import ecom_Rsa_Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class CheckoutPageStepDefinitions

{

	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public CheckoutPage cp;
	TestContextSetup testContextSetup;


	public CheckoutPageStepDefinitions(TestContextSetup testContextSetup)

	{
		this.testContextSetup = testContextSetup;
		this.cp = testContextSetup.pageObjectManager.getCheckoutPage();
	}

	@Then("^verify user has ability to enter promo code and place the order$")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable

	{
		//checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
		Assert.assertTrue(cp.verifyPromoButton());
		Assert.assertTrue(cp.verifyPlaceOrder());
	}

	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) throws Throwable

	{
		cp.checkOutItems();
		Thread.sleep(3000);
		//Assertion to extract name from screen and  compare with name
		
	}
}

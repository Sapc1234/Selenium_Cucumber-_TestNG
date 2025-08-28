package eCom_Rsa_Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import eCom_Cucumber_PageObjet.LandingPage;
import ecom_Rsa_Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPageStepDefinitions

{

	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	LandingPage lp;

	public LandingPageStepDefinitions(TestContextSetup testContextSetup)

	{
		this.testContextSetup = testContextSetup;
		this.lp = testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("^User is on GreenCart Landing page$")
	public void user_is_on_greencart_landing_page() throws Throwable

	{

		/*
		 * WebDriverManager.chromedriver().setup(); cucumberUtils.driver = new
		 * ChromeDriver();
		 * cucumberUtils.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"
		 * );
		 * cucumberUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10
		 * )); cucumberUtils.driver.manage().window().maximize();
		 */

		Assert.assertTrue(lp.getTitleLandingPage().contains("GreenKart"));
	}

	@When("^User serarched with (.+) and extracted actual name of product$")
	public void user_serarched_with_something_and_extracted_actual_name_of_product(String shortname) throws Throwable

	{
		// cucumberUtils.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		// cucumberUtils.product_Name =
		// cucumberUtils.driver.findElement(By.cssSelector("h4[class='product-name']")).getText().split("-")[0].trim();

		// LandingPage lp = new LandingPage(cucumberUtils.driver);

		// lp = cucumberUtils.pageObjectManager.getLandingPage();
		lp.enterSearchItem(shortname);
		Thread.sleep(2000);
		testContextSetup.product_Name = lp.getProductName().split("-")[0].trim();
		System.out.println(landingPageProductName + " is extracted from home page");
	}

	@When("^Added \"([^\"]*)\" items of the selected product to cart$")
	public void added_something_items_of_the_selected_product_to_cart(String qty) throws Throwable

	{
		lp.incrementQuantity(Integer.parseInt(qty));
		lp.addToCart();
	}

}

package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps

{
	@Given("^setup the entries in  database$")
	public void setup_the_entries_in_database() throws Throwable
	
	{
		System.out.println("setup the entries in  database");
	}

	@When("^launch the browser from config variables$")
	public void launch_the_browser_from_config_variables() throws Throwable {
		System.out.println("launch the browser from config variables");
	}

	@And("^Hit the home page url og banking site$")
	public void hit_the_home_page_url_og_banking_site() throws Throwable {
		System.out.println("Hit the home page url og banking site");
	}

	@Given("the user is on the NetBanking landing page")
	public void the_user_is_on_the_net_banking_landing_page() {
		System.out.println("the user is on the NetBanking landing page");
	}

	@Given("^the user is on the practice landing page$")
	public void the_user_is_on_the_practice_landing_page() throws Throwable {

	}

	@When("^the user sign up into application$")
	public void the_user_sign_up_into_application(List<String> data) throws Throwable

	{
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

	@When("the user logs in with a username {string} and password {string}")
	public void the_user_logs_in_with_a_username_and_password(String userName, String password) {

		System.out.println("UserName is :" + userName);
		System.out.println("Password is :" + password);
	}

	// Regex Pattern
	@When("^the user logs in with a username (.+) and password (.+) combination$")
	public void the_user_logs_in_with_a_username_and_password_combination(String username, String password)
			throws Throwable {
		System.out.println("UserName is :" + username);
		System.out.println("Password is :" + password);
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
		System.out.println("the home page is displayed");
	}

	@Then("the cards are displayed")
	public void the_cards_are_displayed() {
		System.out.println("the cards are displayed");
	}

}

package TestJavaCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucuTest {
	
	@Given("TestMe app is launched")
	public void testme_app_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for launch");
	}

	@Given("User accessing registration link in TestMe app")
	public void user_accessing_registration_link_in_TestMe_app() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for registarion link");
	}

	@When("User providing valid data for all the required field")
	public void user_providing_valid_data_for_all_the_required_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for provideing data");
	}

	@Then("User varifying registration status")
	public void user_varifying_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for verifying status");
	}

	@Given("TestMe is launched and is accessible")
	public void testme_is_launched_and_is_accessible() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for launch and access TestMe");
	}

	@Then("User clicks on the login link available in HomePage")
	public void user_clicks_on_the_login_link_available_in_HomePage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for login link available in the Homepage");
	}

	@Then("Provides the valid credentials")
	public void provides_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("provides the valid credentials");
	}

	@Then("User creates the login status")
	public void user_creates_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for login status");
	}





}

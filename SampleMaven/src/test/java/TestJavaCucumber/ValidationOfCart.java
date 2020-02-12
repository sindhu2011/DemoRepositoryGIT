package TestJavaCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ValidationOfCart {
	
	@Given("Application launched by registarion user for cart")
	public void application_launched_by_registarion_user_for_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for registarion user for cart");
	}

	@Then("user verfying add item")
	public void user_verfying_add_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for adding data");
	}

	@Given("Application launched by registred user for cart")
	public void application_launched_by_registred_user_for_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for removing data");
	}

	@Then("user veryfying remove item")
	public void user_veryfying_remove_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for count verification");
	}

	@Then("user veryfying max count item")
	public void user_veryfying_max_count_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("cod for max count");
	}

}

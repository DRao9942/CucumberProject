package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_1 {

	@Given("user is on login page one")
	public void user_is_on_login_page_one() {
		
		System.out.println("Inside Step - User is on login page one");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - User enters username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside Step - Click on Login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside Step - User is navigated to the Home page");
	}

}



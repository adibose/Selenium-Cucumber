package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDef {
	
	@Given("user is on a login page")
	public void user_is_on_a_login_page() {
	   System.out.println("Inside step - user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Inside step - user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - user clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside step - user is navigated to home page");
	}


}

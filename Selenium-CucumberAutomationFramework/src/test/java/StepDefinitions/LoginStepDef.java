package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {
	
	WebDriver driver;
	private String userName;
	
	@Given("browser is open")
	public void browser_is_open() {
	     driver = DriverFactory.getDriver();
	}

	@And("user is in login page")
	public void user_is_in_login_page() throws InterruptedException {
		
		driver.get("https://example.testproject.io/web/");

	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		userName = username;
		new LoginPage(driver).enterLoginCredentials(username, password);


	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		


	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		
		System.out.println(driver.findElement(By.id("greetings")).getText());
		Assert.assertEquals("Hello "+userName+", let's complete the test form:", driver.findElement(By.id("greetings")).getText());
		


	}
	
	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials(List<Map<String,String>> data) {
		
		new LoginPage(driver).enterLoginCredentials(data.get(0).get("username"),data.get(0).get("password"));
	}

	@Then("user sees an error message")
	public void user_sees_an_error_message() throws InterruptedException {
		
		Assert.assertEquals("Password is invalid", new LoginPage(driver).validateErrorMessage());
	    
	}


}

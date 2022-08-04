package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.PageFactoryManager;
import utils.ConfigLoader;

public class LoginStepDef {
	
	private final WebDriver driver;

	
	private TestContext context;
	
	private String url = ConfigLoader.getInstance().getBaseUrl();
	
	private LoginPage loginPage;
	
	public LoginStepDef(TestContext context) {
		this.context = context;
		this.driver = context.driver;
		this.loginPage = PageFactoryManager.getLoginPage(driver);
		
		
	}
	

	
	@Given("browser is open")
	public void browser_is_open() {
	}

	@And("user is in login page")
	public void user_is_in_login_page() throws InterruptedException {
		
		loginPage.load(url);

	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		context.userName = username;
		loginPage.enterLoginCredentials(username, password);


	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		
		loginPage.clickLogin();

	}
	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials(List<Map<String,String>> data) {
		
		loginPage.enterLoginCredentials(data.get(0).get("username"),data.get(0).get("password")).clickLogin();
	}

	@Then("user sees an error message")
	public void user_sees_an_error_message() throws InterruptedException {
		
		Assert.assertEquals("Password is invalid", loginPage.validateErrorMessage());

	    
	}
	
	@Given("I'm a user")
	public void i_m_a_user() {
	}



	@When("I logged into my application")
	public void i_logged_into_my_application() {
		loginPage.load(url);
		loginPage.enterLoginCredentials(ConfigLoader.getInstance().getUsername(),ConfigLoader.getInstance().getPassword());
		loginPage.clickLogin();
	}

	


}

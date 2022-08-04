package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import context.TestContext;
import domainObjects.PersonalDetails;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PageFactoryManager;

public class HomeStepDef {
	
	private WebDriver driver;
	
	private String userName;
	private PersonalDetails pDetails;
	private HomePage homePage;
	
	public HomeStepDef(TestContext context) {
		this.driver = context.driver;
		this.pDetails = context.pDetails;
		this.userName = context.userName;
		this.homePage = PageFactoryManager.getHomePage(driver);
	}
	

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page(){
		Assert.assertEquals("Hello "+userName+", let's complete the test form:", homePage.validateGreetMessage());
		


	}
	
	@When("I provide the details")
	public void i_provide_the_details() {
		homePage.enterPersonalDetails(pDetails);
	    
	}

	@When("I clicked on Save")
	public void i_clicked_on_save() {
		homePage.clickSave();
	}

	@Then("I should see saved message on Screen")
	public void i_should_see_saved_message_on_screen() {
	    Assert.assertEquals("Saved", homePage.validateSuccessMessage());
	}


}

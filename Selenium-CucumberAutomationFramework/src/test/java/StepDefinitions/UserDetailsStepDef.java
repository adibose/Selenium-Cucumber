package StepDefinitions;

import context.TestContext;
import domainObjects.PersonalDetails;
import io.cucumber.java.en.Given;

public class UserDetailsStepDef {
	
	private TestContext context;
	
	public UserDetailsStepDef(TestContext context) {
		this.context = context;
	}
	
	@Given("my personal details are")
	public void my_personal_details_are(PersonalDetails pDetails) {
			context.pDetails = pDetails;
	}

}

package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	     driver = WebDriverManager.chromedriver().create();
	    
	    driver.manage().window().maximize();
	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	@And("user is in login page")
	public void user_is_in_login_page() throws InterruptedException {
		
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(6000);

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys(username);
		
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(6000);


	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(6000);



	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		
		System.out.println(driver.findElement(By.id("greetings")).getText());
		
		Thread.sleep(6000);


	}

}

package hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	private WebDriver driver;
	
	@Before
	public void before() {
		driver = DriverFactory.driverInitialize();
	}
	
	@After
	public void after() {
		driver.quit();
	}

}

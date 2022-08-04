package hooks;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	private WebDriver driver;
	private final TestContext context;
	
	
	public MyHooks(TestContext context) {
		this.context = context;
	}

	@Before
	public void before() {
		driver = DriverFactory.driverInitialize();
		context.driver = driver;
	}
	
	@After
	public void after() {
		driver.quit();
	}

}

package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public static WebDriver driverInitialize(String browser) {
		
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			driver = WebDriverManager.chromedriver().create();
		}
		else if(browser.equals("edge")) {
			driver = WebDriverManager.edgedriver().create();
		}
		else {
			System.out.println("No browser sent");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		return driver;
		

	}
	


}

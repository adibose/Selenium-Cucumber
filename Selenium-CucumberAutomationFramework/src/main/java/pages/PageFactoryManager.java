package pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
	
	private static LoginPage loginPage = null;
	private static HomePage homePage = null;
	
	
	public static LoginPage getLoginPage(WebDriver driver) {
		return loginPage == null? new LoginPage(driver):loginPage;
	}
	
	public static HomePage getHomePage(WebDriver driver) {
		return homePage == null? new HomePage(driver):homePage;
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "name")private WebElement enterName;
	@FindBy(id = "password")private WebElement enterPassword;
	@FindBy(id = "login")private WebElement clickLogin;
	@FindBy(xpath="//div[text()='Password is invalid']")private WebElement validateInvalidMessage;
	
	
	public void enterLoginCredentials(String username, String password) {
		wait.until(ExpectedConditions.elementToBeClickable(enterName)).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(enterPassword)).sendKeys(password);
	}
	
	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(clickLogin)).click();
	}
	
	public String validateErrorMessage() {
		return wait.until(ExpectedConditions.visibilityOf(validateInvalidMessage)).getText();
	}
	

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import domainObjects.PersonalDetails;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//p[@id='greetings']")private WebElement getMessage;
	@FindBy(id="country")private WebElement myCountry;
	@FindBy(id="address")private WebElement myAddress;
	@FindBy(id="email")private WebElement myEmail;
	@FindBy(id="phone")private WebElement myPhone;
	@FindBy(id="save")private WebElement clickSave;
	@FindBy(xpath="//span[@class='tp-saved']")private WebElement successMessage;
	
	
	public String validateGreetMessage() {
		System.out.println("Pageeeeeeeeeee"+getMessage.getText());
		return getMessage.getText();
	}
	
	public void	enterPersonalDetails(PersonalDetails pDetails) {
		Select countryDropdown = new Select(myCountry);
		countryDropdown.selectByVisibleText(pDetails.getCountry());
		myAddress.sendKeys(pDetails.getAddress());
		myEmail.sendKeys(pDetails.getEmail());
		myPhone.sendKeys(pDetails.getPhone());
	}
	
	public void clickSave() {
		clickSave.click();
	}
	
	public String validateSuccessMessage() {
		return successMessage.getText();
	}
	

}

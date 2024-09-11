package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageSetup;

public class LoginPage_PF extends AbstractPageSetup {

	/*
	 * Creating CONSTRUCTOR to get DRIVER INSTANCE and
	 * 
	 * initialize ELEMENTS using initElements Method
	 */

	WebDriver driver = getDriver();

	public LoginPage_PF(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver,this);
	}

	
	// Creating Locators for all objects on the WebPage

	@FindBy(id = "user-name")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(name = "login-button")
	WebElement btn_login;

	// Creating Functions/Methods

	public void enterUsername(String username) {

		txt_username.sendKeys(username);

	}

	public void enterPassword(String password) {

		txt_password.sendKeys(password);

	}

	public void clickOnLogin() {

		btn_login.click();

	}

}

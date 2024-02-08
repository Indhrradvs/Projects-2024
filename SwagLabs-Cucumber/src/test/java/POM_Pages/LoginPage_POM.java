package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {
	
	protected WebDriver driver;

	// Objects/Locators: X-Paths	
	private By txt_username_swaglabs = By.id("user-name");
	private By txt_password_Swaglabs = By.id("password");
	private By btn_Loginbutton_Swaglabs = By.name("login-button");

	/* Building the CONSTRUCTOR- Constructor has the same name as class */
	
	public LoginPage_POM(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	//Functions or Actions
	

	//Method-1
	
	/*
	
	public void EnterUsername(String username) {
	
		driver.findElement(txt_username_swaglabs).sendKeys(username);
		
	}
	
	public void EnterPassword(String password) {
		
		driver.findElement(txt_password_Swaglabs).sendKeys(password);
		
	}

	*/
	
	
	//Method-2: Most commonly used 

	
	public void Credentials(String username, String password) {
		
		driver.findElement(txt_username_swaglabs).sendKeys(username);
		driver.findElement(txt_password_Swaglabs).sendKeys(password);
	}
	
    public void clickLogin() {
		
		driver.findElement(btn_Loginbutton_Swaglabs).click();
		
	}
}


package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps_POM {

//	WebDriver driver;
//	POM_Pages.LoginPage_POM login;
//
//	@Given("user is on login page")
//	public void loginPage() throws InterruptedException {
//
//		System.out.println(" ---I'M Using LoginSteps_POM Page--");
//
//		WebDriverManager.chromedriver().setup();
//
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.get("https://www.saucedemo.com/");
//
//		System.out.println("user is on login page");
//
//		Thread.sleep(3000);
//
//	}
//
//	@When("^user enters(.*) and (.*)$")
//	public void credentials(String username, String password) throws InterruptedException {
//
//		// Below functions are created in Object Repository, including in test scripts
//
//		login = new POM_Pages.LoginPage_POM(driver);
//		
//		//Method-2
//		login.Credentials(username, password);
//	
//		//Method-1
//		
//		/*
//		login.EnterUsername(username);
//		login.EnterPassword(password);
//         */
//		System.out.println("user enters the username and password Successfully!");
//
//		Thread.sleep(3000);
//	}
//
//	@And("clicks on login button")
//	public void Loginbtn() {
//
//		// Below functions are created in Object Repository, including in test scripts
//
//		login.clickLogin();
//
//		System.out.println("Logged in Successfully!");
//	}
//
//	@Then("user is navigated to the Home Page")
//	public void Homepage() {
//
//		String title = driver.getTitle();
//
//		System.out.println(" Page title is " + title);
//
//		driver.quit();
//	}

}

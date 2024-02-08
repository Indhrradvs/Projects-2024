package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginPage_PF;

public class loginSteps_PF extends AbstractPageSetup {

	WebDriver driver = getDriver();

	LoginPage_PF swagslogin;

	@Given("user is on login page")
	public void loginPage() throws InterruptedException {

		System.out.println("-- I'M in loginSteps_PF class ");

		WebDriverManager.chromedriver().setup();

		//driver = new ChromeDriver(); // ALready declared in AbstractPage

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		System.out.println("user is on login page");

		Thread.sleep(3000);

	}

	@When("^user enters(.*) and (.*)$")
	public void credentials(String username, String password) throws InterruptedException {

		swagslogin = new LoginPage_PF(driver);
		swagslogin.enterUsername(username);
		swagslogin.enterPassword(password);

		// driver.findElement(By.id("user-name")).sendKeys(username);
		// driver.findElement(By.id("password")).sendKeys(password);

		System.out.println("user enters the username and password Successfully!");

		Thread.sleep(3000);
	}

	@And("clicks on login button")
	public void Loginbtn() {

		swagslogin.clickOnLogin();

		// driver.findElement(By.name("login-button")).click();

		System.out.println("Logged in Successfully!");
	}

	@Then("user is navigated to the Home Page")
	public void Homepage() {

		String title = driver.getTitle();

		System.out.println(" Page title is " + title);

		// driver.quit();

	}

}

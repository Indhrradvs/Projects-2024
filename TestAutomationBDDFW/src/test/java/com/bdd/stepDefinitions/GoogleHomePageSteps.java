package com.bdd.stepDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.bdd.utils.WebDriverUtils.*; // Added this class to import manually
import static com.bdd.variables.GlobalVariables.*; // Added this to import GlobalVariables class
import static com.bdd.pages.HomePage.*; // Added this to import HomePage class


public class GoogleHomePageSteps {

	@When("User clicks on Store option")
	public void user_clicks_on_store_option() {

		clickStoreOption(); // calling this method from HomePage
		
		System.out.println("Successfully landed on Store Page");
	}


	@Then("Verify if the text is displayed correctly")
	public void verify_if_the_text_is_displayed_correctly() {
		
		verifyStoreText();
		
		System.out.println("Verified the text successfully!");
		
		gdriver.quit();
	}

}

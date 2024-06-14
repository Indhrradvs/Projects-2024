package com.bdd.stepDefinitions;

import static com.bdd.utils.WebDriverUtils.getDriver;
import io.cucumber.java.en.Given;
import static com.bdd.variables.GlobalVariables.*;
import static com.bdd.implementations.AppAcess.*;

public class CommonSteps {

	/*
	 * import static com.bdd.variables.GlobalVariables.*;
	 * 
	 * we are importing GlobalVariables class to use common variables across the project
	 * 
	 * */
	
	
	@Given("User navigates to the google page")
	public void user_navigates_to_the_google_page() {

		// Calling accessApp method from AppAccess class contains Webdriver initiation
		accessApp(); 
		
	}
}

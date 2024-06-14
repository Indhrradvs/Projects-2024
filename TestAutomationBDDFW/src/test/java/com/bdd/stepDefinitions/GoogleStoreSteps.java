package com.bdd.stepDefinitions;

import io.cucumber.java.en.Then;
import static com.bdd.pages.HomePage.*;
import static com.bdd.variables.GlobalVariables.*;

public class GoogleStoreSteps {
	
	@Then("Verify if the pre-order button is available")
	public void verify_if_the_pre_order_button_is_available() throws InterruptedException {
	  
		watches(); // Imported watches method
		
		gdriver.quit();
		
	}

}

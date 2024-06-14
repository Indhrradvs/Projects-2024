package com.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/Resources/features",

		glue = "com.bdd.stepDefinitions",

		//tags = "@googleStoreValidation",

		tags= "@preOrderButtonValidation",
		
		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json" },
		
		monochrome = true)


/*
 When we are using TestNG as a test execution Engine 
 then we need to extend the AbstractTestNGCucumberTests class for execution
*/

public class TestRunner extends AbstractTestNGCucumberTests {

	//creating object for TestNGCucumberRunner class used to Glue code for running Cucumber via TestNG
	
	TestNGCucumberRunner testngcucumber = new TestNGCucumberRunner(this.getClass());
	
}

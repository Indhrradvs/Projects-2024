package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginPage.feature", 

glue = { "stepDefinitions" }, monochrome = true, dryRun=false,

plugin = {"pretty","html:target/HtmlReports/HTMLreport.html"}

//plugin = { "pretty", "json:target/JSONReports/jsonreport.json" },

//plugin = { "pretty", "junit:target/JunitReports/junitreport.junit" }

//tags ="@smoketest" 

		)	

public class TestRunner {

}

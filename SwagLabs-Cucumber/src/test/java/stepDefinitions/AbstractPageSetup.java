package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPageSetup {
	
	protected static WebDriver driver;
	
	/* To avoid Null pointer exception in other step definition files, 
	 * created new ABSTRACT CLASS and instantiation from here. */
	
	//created a method with name getDriver
	protected WebDriver getDriver() {
		
		if(driver == null) {
			
			driver = new ChromeDriver(); //If driver is null then instantiate new driver
		}
		
		return driver; 
	}

}

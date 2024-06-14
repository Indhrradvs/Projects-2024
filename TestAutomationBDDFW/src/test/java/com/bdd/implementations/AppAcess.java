package com.bdd.implementations;

import static com.bdd.variables.GlobalVariables.*;

import org.openqa.selenium.WebDriver;

import static com.bdd.utils.WebDriverUtils.getDriver;

public class AppAcess {

	public static void accessApp() {
	
		if (gdriver == null || gdriver.toString().contains("null")) {

			gdriver = getDriver();

		}
		
		openUrl(); // Opening URL of the application
	}

	public static void openUrl() {

		gdriver.get("https://www.google.com/");

		System.out.println("Successfully landed on Google Home Page");

	}
}

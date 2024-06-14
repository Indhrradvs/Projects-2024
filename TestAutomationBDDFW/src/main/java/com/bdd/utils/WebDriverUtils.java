package com.bdd.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {

	public static WebDriver driver; // Making WebDriver Global. So we can use under any method in this class

	// For below method return type is WebDriver. which means it retuns webdriver instance
	// so, instead of VOID we put WebDriver

	public static WebDriver getDriver() {

		WebDriverManager.chromedriver().clearDriverCache().setup(); // used to clearCache the driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver; // return driver instance. We use this in other classes to invoke above driver functionality

	}

}

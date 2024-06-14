package com.bdd.utils;

import static com.bdd.variables.GlobalVariables.gdriver;

import org.openqa.selenium.By;

public class SeleniumReusableFunctions {
	
	public static void Click(By WebElement){
		
		gdriver.findElement(WebElement).click();
	}

}

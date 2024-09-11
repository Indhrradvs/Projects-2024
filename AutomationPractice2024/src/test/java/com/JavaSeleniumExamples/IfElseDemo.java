package com.JavaSeleniumExamples;

public class IfElseDemo {

	public static void main(String[] args) {
		
		String browser ="Firefox";
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.out.println("Testcases executed on CHROME browser");			
			
		} else 
		
		{
			System.out.println("Testcases executed on Firefox browser");
		}

	}

}

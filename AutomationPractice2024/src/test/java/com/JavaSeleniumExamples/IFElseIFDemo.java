package com.JavaSeleniumExamples;

public class IFElseIFDemo {

	public static void main(String[] args) {

		String browser = "Safari";

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("Testcases executed on Chrome browser");

		} else if (browser.equalsIgnoreCase("Firefox"))

		{
			System.out.println("Testcases executed on Firefox browser");
			
		} else if (browser.equalsIgnoreCase("Safari")) {
			
			System.out.println("Testcases executed on Safari browser");
			
		} else {
			System.out.println("Please provide correct Browser Name");
		}

	}

}

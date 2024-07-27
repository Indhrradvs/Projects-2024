package com.JavaSeleniumExamples.WrapperClass;

public class DemoWrapper2 {

	public static void main(String[] args) {

		String price1 = "200";
		String price2 = "150";
		String price3 = "22.36";
		String price4 = "27.64";
		// Now if we want to print total price then we can't,
		// because int is assigned to string

		/*
		 * String sum = price1+price2; System.out.println(sum);// it just print above
		 * values. addition operation not happened
		 */

		/**
		 * Real time Scenario: Amazon item price & cart final Amount
		 * 
		 * 1. if we use gettext() method to return the text, return type is STRING. 2.
		 * Now, if we want to capture the numeric values and we need to perform
		 * operation. 3. if we want to check the total is correct or not.
		 * 
		 * In this scenario, we need to convert STRING to INT. Here wrapper class comes
		 * to the picture.
		 * 
		 */

		// Example-1: Converting string to int by using Integer wrapper class
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);

		int sum = p1 + p2;
		System.out.println("Total Price is: " + sum);

		if (sum == 350) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		// Example-2: Converting string to double by using Double wrapper class
	
		double d1 = Double.parseDouble(price3);
		double d2 = Double.parseDouble(price4);
		
		System.out.println(d1);
		System.out.println(d2);
		
		double total = d1 + d2;
		System.out.println("Total Price is: " + total);

		if (total == 50) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
}

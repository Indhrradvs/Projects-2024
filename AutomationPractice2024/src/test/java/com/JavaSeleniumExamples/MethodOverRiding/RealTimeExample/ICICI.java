package com.JavaSeleniumExamples.MethodOverRiding.RealTimeExample;

public class ICICI extends RBI {

	public static void main(String[] args) {

		ICICI home = new ICICI();
		home.homeLoanIntRate();//Calling below method because we override the method from RBI
		
	}

	public void homeLoanIntRate() {

		System.out.println("Home Loan Interest Rate is 10.77%");

	}
}

package com.JavaSeleniumExamples.MethodOverRiding.RealTimeExample;

public class HDFC extends RBI {

	public static void main(String[] args) {
		
		RBI r = new RBI();
		r.homeLoanIntRate();//Calling method from RBI

	}

	public void homeLoanIntRate() {

		System.out.println("Home Loan Interest Rate is 12%");

	}
}

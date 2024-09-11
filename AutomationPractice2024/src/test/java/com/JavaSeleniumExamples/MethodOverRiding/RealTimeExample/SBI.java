package com.JavaSeleniumExamples.MethodOverRiding.RealTimeExample;

public class SBI extends RBI implements Loan {

	public static void main(String[] args) {

		SBI home = new SBI();
		home.homeLoanIntRate();//Calling below method because we override the method from RBI
		home.carLoan();
		home.homeLoan();
	}

	public void homeLoanIntRate() {

		System.out.println("Home Loan Interest Rate is 8.35%");

	}

	//Below Methods from Loan Interface
	@Override
	public void homeLoan() {
		
		System.out.println("SBI Provides Home Loan");
		
	}

	@Override
	public void carLoan() {
		
		System.out.println("SBI Provides Car Loan");
		
	}
}

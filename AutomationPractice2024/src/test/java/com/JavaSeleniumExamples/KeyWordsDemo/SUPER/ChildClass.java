package com.JavaSeleniumExamples.KeyWordsDemo.SUPER;

public class ChildClass extends BaseClass {

	int intRate = 10;

	public static void main(String[] args) {

		ChildClass obj1 = new ChildClass();

		System.out.println(obj1.intRate); // coming from variable in Child class

		obj1.pvtBankInt();// coming from Base class because SUPER keyword

	}

	public void pvtBankInt() {
		
		shwMeIntRate(); // Calls below method
		
		super.shwMeIntRate(); // call from Base class

		System.out.println("Current interest rate from Private Bank is " + super.intRate);
	}

	//Below same method available in Base class
	public void shwMeIntRate() {

		System.out.println("I'm in Child class ");
	}

}

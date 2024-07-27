package com.JavaSeleniumExamples.Abstraction;

public abstract class ITDept implements Employee {

	/** ABSTRACT class can have Abstract & Non Abstract Methods */
	
	public abstract void salary(); //Abstract Method

	//NON-Abstract Method
	public void goodies() {

		System.out.println("Laptop");
	}
	
	//NON-Abstract Method
	public void work() {

		System.out.println("Automation");
	}

}

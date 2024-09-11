package com.JavaSeleniumExamples.KeyWordsDemo.FINAL;

public class FINALMethod extends Parent {

	public static void main(String[] args) {
		
		FINALMethod obj1 = new FINALMethod();
		
		obj1.name();
		
		obj1.address();
		
		obj1.phone(); 
	}
	
	public void phone() {
		
		System.out.println("Here's my Number: +10987654321");
	}
	
	//We cannot override the FINAL method. uncomment and read the error
	/*
		public void name() {
		System.out.println("Hey! I'm Frankie!");	
	} */

	//It's not a FINAL method from parent class. so we can use & Update
	public void address() {
		System.out.println("I'm from New York");
	}
}


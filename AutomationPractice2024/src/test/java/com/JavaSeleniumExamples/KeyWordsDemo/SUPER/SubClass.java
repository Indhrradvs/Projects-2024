package com.JavaSeleniumExamples.KeyWordsDemo.SUPER;

public class SubClass extends ParentClass {

	//Constructor
	public SubClass() {

		System.out.println("I'm in Sub class constructor");
	}
	
	public SubClass(String name) {
		
		super(name); // it will call from Parent class
		
		System.out.println("I'm in Sub class constructor "+name);
		
	}

	public static void main(String[] args) {

		SubClass obj1 = new SubClass(); //Calling Parent class & Sub class constructor as well
		SubClass obj2 = new SubClass("Charlie"); //Calling subclass constructor with String Param
	
	}

}

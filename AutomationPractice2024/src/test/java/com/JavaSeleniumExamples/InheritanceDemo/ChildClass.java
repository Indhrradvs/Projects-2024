package com.JavaSeleniumExamples.InheritanceDemo;

public class ChildClass extends BaseClass{
	
	public static void main(String args[]) {
		
		ChildClass obj = new ChildClass();
		
		/* If we refer baseclass obj to child class then child class methods u can't access */
		//BaseClass obj = new ChildClass(); 
		
		/* If we refer child class Obj to baseclass, its invalid. Child Can't hold Parent */
		//ChildClass obj = new BaseClass();
		
		obj.division();
		obj.multiplication();
		
		//Methods from Base Class
		obj.addition();
		obj.substraction();
		
		
	}

	public void multiplication() {

		System.out.println("Hey! I'm from CHILD Class and Multiplication is 2500 ");

	}

	public void division() {

		System.out.println("Hey! I'm from CHILD Class and Division is 75 ");
	}
}

package com.JavaSeleniumExamples.WrapperClass;

public class DemoWrapper {

	public static void main(String[] args) {

		int a = 100;

		System.out.println("Primitive Type: " + a);

		Integer b = 5; //Integer = wrapper class, b= object of integer type

		/** By using object b we can perform some operations. 
		 *  Type dot(.) after b and see */
		
		System.out.println("Wrapper class: " + b); 
		
		//Here's with using b object and printing size of b
		System.out.println("Size of the Wrapper class object b is: " + b.SIZE); 
	}

}

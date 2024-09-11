package com.JavaSeleniumExamples.WrapperClass;

public class Boxing {

	public static void main(String[] args) {

		/** Primitive Data type Automatically converted into wrapper class object */
		// Auto Boxing
		int a = 100; // a is a variable
		Integer b = a; // a Automatically converted into object.
		System.out.println("AutoBoxing: "+b);

		/** Primitive Data type converted into wrapper class object by using method */
		// Boxing
		int x = 20;
		Integer y = Integer.valueOf(x); // By using valueOf method x is converted to object
		System.out.println("Boxing: "+x);

		/** Extracting Primitive Data type value by using intValue() */
		// UnBoxing
		Integer result = 100;
		int newResult = result.intValue();
		System.out.println("UnBoxing: "+newResult);

		// Auto-UnBoxing
		Integer marks = 89;
		int newMarks = marks;
		System.out.println("Auto-UnBoxing: "+newMarks);
	}

}

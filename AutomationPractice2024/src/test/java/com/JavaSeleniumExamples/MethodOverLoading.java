package com.JavaSeleniumExamples;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.add(20.36, 5.64);
		obj.add(7.22, 10);
		obj.add(5, 2.58);
		obj.add(20, 30);
		obj.add(5, 10, 15);
		
	}
	
	// Method Name is Same but signatures(parameters, data types etc) are different
	
	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Result is: " + c);

	}

	public void add(double a, int b) {

		double c = a + b;
		System.out.println("Result is: " + c);

	}

	public void add(int a, double b) {

		double c = a + b;
		System.out.println("Result is: " + c);

	}

	public void add(double a, double b) {

		double c = a + b;
		System.out.println("Result is: " + c);

	}

	public void add(int a, int b, int d) {

		int c = a + b+d;
		System.out.println("Result is: " + c);

	}


}

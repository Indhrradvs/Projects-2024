package com.JavaSeleniumExamples;

public class ParametersDemo {

	public static void main(String[] args) {
		
		ParametersDemo obj = new ParametersDemo();
		
		obj.add(100, 20); //providing values to the Parameters provided
		 
		obj.subs(75.25, 5.25); //providing values to the Parameters provided
		
		
		//Using Return method in below Name method
		
		String total = obj.name("Sachin", "Tendulkar");
		
		System.out.println("Result of two Strings are: " + total);
	}

	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Result is: " + c);

	}

	public void subs(double x, double y) {

		double z = x - y;
		System.out.println("Result of Substraction is: " + z);

	}

	public String name(String m, String n) {

		String total = m+n;
		
		return total;
	}

}

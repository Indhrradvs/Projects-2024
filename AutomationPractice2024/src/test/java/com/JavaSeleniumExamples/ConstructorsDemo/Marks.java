package com.JavaSeleniumExamples.ConstructorsDemo;

public class Marks {

	int result;
	
	public static void main(String[] args) {
		
		Marks m = new Marks(89);

		m.displayResult();
		
	}
	
	//Constructor
	public Marks(int marks) {
		
		result = marks;
	}
	
	public void displayResult() {

		System.out.println("Marks are: "+result);
	}

}

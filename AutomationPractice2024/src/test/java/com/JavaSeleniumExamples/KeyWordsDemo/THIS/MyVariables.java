package com.JavaSeleniumExamples.KeyWordsDemo.THIS;

public class MyVariables {
	
	int a=10;
	int b=20;
	
	public MyVariables(int a, int b) {
		
		this.a = a; //Updating a=50
		this.b = b;	//Updating a=20	
	}
	
	public void sum() {
		
		int sum=a+b;
		System.out.println("Sum of the total is: "+sum);
	}

	public static void main(String[] args) {
		
		MyVariables obj1 = new MyVariables(50, 20);
		
		obj1.sum();
		
	}

}

package com.JavaSeleniumExamples.KeyWordsDemo.THIS;

public class MyDrivers {

	// Default constructor
	public MyDrivers() {

		this("JDBC"); // Ref constructor-1
		System.out.println("Loading My Drivers");
	}

	// constructor-1
	public MyDrivers(String name) {

		this(10);// Ref constructor-2

		System.out.println("Loading My Drivers- Name is " + name);
	}

	// constructor-2
	public MyDrivers(int count) {
		System.out.println("Loading My Drivers- Count is " + count);
	}

	// Method
	public void display() {
		System.out.println("I'm in Display method");
	}

	public static void main(String[] args) {

		MyDrivers obj1 = new MyDrivers();
		obj1.display();

	}

}

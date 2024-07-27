package com.JavaSeleniumExamples.ConstructorsDemo;

public class Student {

	int result;
	
	public static void main(String[] args) {

		Student obj = new Student(); //it will call 1st constructor becoz only 0 arguments
		obj.displayResult();
		
		//It will call 2nd constructor because we entered string Parameter 
		
		Student obj1 = new Student("A.V.K"); // compiletime polymarphism
		
		Student obj2 = new Student(21);
		Student obj3 = new Student("D.A.V",99);
		Student obj4 = new Student(120,"GIITS");
		
		obj.displayResult();
	}

	// Constructor

	public Student() {
		System.out.println("Hey! Welcome to School");
	}

	// Constructor OverLoading- Same name with different parameters

	public Student(String schoolName) {
		
		System.out.println("Hey! It's "+schoolName+" High School");
	}

	public Student(int RollNo) {
		
		System.out.println("RollNo is: "+RollNo);
	}

	public Student(String schoolName, int RollNo) {
		System.out.println("Hey! It's "+schoolName +" High School & Roll No "+RollNo);
	}

	public Student(int RollNo, String schoolName) {

		System.out.println("Hey!Roll No:"+RollNo+" & It's " +schoolName+ " High School");
		
		System.out.println("----------------------------------");
	}

	
	// Methods
	public void displayResult() {

		System.out.println("Marks are: "+result);
	}
}

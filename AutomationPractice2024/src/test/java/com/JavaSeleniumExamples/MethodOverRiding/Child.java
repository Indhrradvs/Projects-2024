package com.JavaSeleniumExamples.MethodOverRiding;

public class Child extends Parent{
	
	/** Important scenarios:
     * 
     * 1.Parent p = new Parent(); --> Parent class method will be called
	 * 2.Child c = new Child();  --> Child class method will be called
	 * 3.Parent p = new Child();  --> Child class method will be called
	 * 4.Child c = new Parent(); --> Child reference variable cannot hold parent class Object
     *
     **/
	
	public static void main(String[] args) {
		
		//Scenario-1: Accessing from Child class
		Child obj1 = new Child();
		obj1.display();
		
		//Scenario-2: Accessing from Parent class. This is only way to call parent class methods
		Parent obj2 = new Parent();
		obj2.display(); 

		//Scenario-3: Parent class ref to child class
		Parent obj3 = new Child();
		obj3.display();// it will Call method from child class because we overridden parent class method here.
				
		
	}
	
    public void display(){
		
		System.out.println("I'm in Child Class, display() Method");
		
	}
	
	public void display(String name){
		
		System.out.println("I'm in Child Class, display(String name) Method");
		
	}
	
}

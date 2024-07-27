package com.JavaSeleniumExamples.CollectionsFW.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenericsDemo {

	public static void main(String[] args) {
	
	ArrayList<String> obj1 = new ArrayList<String>(); 

	obj1.add("Frank");
	obj1.add("Selenium");
    obj1.add("Cypress"); 
	
	for(String values:obj1) {
		
		System.out.println("List of the Values are: "+values);
	}
	
	
	
	}

}

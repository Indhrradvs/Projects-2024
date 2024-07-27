package com.JavaSeleniumExamples.CollectionsFW.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	 ArrayList obj1 = new ArrayList();
	 
	 obj1.add(787878);
	 obj1.add('M');
	 obj1.add("Selenium WebDriver");
	 obj1.add("Selenium WebDriver"); //ArrayList will allow duplicate values
	 obj1.add(23.78);
	 
	// System.out.println(obj1);
	//System.out.println(obj1.get(3));

	int myListSize = obj1.size();
	
	for(int i=0; i<myListSize; i++) {
		
		System.out.println("Values from ArrayList is "+obj1.get(i));
	}
	
	System.out.println("-----------------------------");
	
	// or we can use like below Enhanced For Loop
	
	for(Object abc:obj1) {
		
		System.out.println("Values from ArrayList is "+abc);
	}
	 
	System.out.println("-------------------------------");
	
	//By using Iterator. Iterator is an Interface comes from Java.util
	
	Iterator itr = obj1.iterator();
	
	while(itr.hasNext()) {
		
		Object value = itr.next(); //return next element in the iteration
		System.out.println("Iterated values are: "+value);
	}
	
	
	
	
	
	
	}

}

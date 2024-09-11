package com.JavaSeleniumExamples.CollectionsFW.SET;


import java.util.HashSet;
import java.util.Set;

public class SetDemo {


	public static void main(String[] args) {

		Set<String> values = new HashSet<String>();
		
		values.add("Zebra");
		values.add("Apple");
		values.add("Book");
		values.add("Car");
		values.add("Dog");
	    values.add("1");
		values.add("Fox");

		// If we add duplicate values it won't store and wont'show in console

		values.add("Apple"); // you won't see 2 Apple.

		for (String e : values) {

			System.out.println(e); // It will display in the unordered 
		}

	}

}

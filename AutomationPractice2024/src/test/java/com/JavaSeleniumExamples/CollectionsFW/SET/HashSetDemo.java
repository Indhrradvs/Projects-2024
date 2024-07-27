package com.JavaSeleniumExamples.CollectionsFW.SET;

import java.util.HashSet;

public class HashSetDemo {

	/** HashSet which stores its elements in a hash table, is the best-performing implementation. 
	 *  HashSet allows only unique elements. 
	 *  It doesn’t maintain the insertion order which means element inserted 
	 *  last can appear at first when traversing the HashSet.
	 */
	
	public static void main(String[] args) {

		HashSet<String> values = new HashSet<>();
		
		values.add("Zebra");
		values.add("Apple");
		values.add("Book");
		values.add("Car");
		values.add("Dog");
		values.add("1");
		values.add("Fox");
		
	// If we add duplicate values it won't store and wont'show in console
	
		values.add("Apple"); // you won't see 2 Apple. 
		
		for(String e:values) {
			
			System.out.println(e); // It will retrieve unordered list
		}
		
		
	}

}

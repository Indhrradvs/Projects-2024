package com.JavaSeleniumExamples.CollectionsFW.MAP;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		//We can Use MAP also instead of HashMap
		//HashMap<String, String> obj1 = new HashMap<String, String>();
		
		Map<String, String> obj1 = new HashMap<String, String>();

		obj1.put("500", "Tesla"); // First Field = KEY, 2nd Field = VALUE
		obj1.put("200", "Apple");
		obj1.put("700", "Google");
		obj1.put("400", "Nvidia");
		obj1.put("150", "Amazon");
		obj1.put("600", "Netflix");

		System.out.println(obj1); // Returns Key & Value and UnOrderd List

		String values = obj1.get("150");// we need to enter the Key

		System.out.println("Value from the Map is: " + values);

		for (Map.Entry<String, String> test : obj1.entrySet()) {

			System.out.println("Key from MAP is " + test.getKey() + " and value is " + test.getValue());

		}

	}

}

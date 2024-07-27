package com.JavaSeleniumExamples.CollectionsFW.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		/** List -> Parent
		 * ArrayList-> Child
		 */
		
		List<String> lexus = new ArrayList<String>(); 
		
		lexus.add("ES 350 F-Sport");
		lexus.add("RX 350");
		lexus.add("GX 550 F-Sport");
		lexus.add("LX 600");
		
		for(String suv:lexus) {
	
			System.out.println("Lexus models are: "+suv);
		}

	}

}

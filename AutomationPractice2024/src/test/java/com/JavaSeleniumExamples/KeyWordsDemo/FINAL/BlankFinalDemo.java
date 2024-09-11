package com.JavaSeleniumExamples.KeyWordsDemo.FINAL;

public class BlankFinalDemo {

	/**
	 * When we don't initialize the FINAL variable at the time of Declaration
	 * like below is called BLANK FINAL VARIABLE
	 */
	
	final String PANCARD; //Blank Final Variable
	
	public static void main(String[] args) {
		
		BlankFinalDemo obj1 = new BlankFinalDemo("A12XCVF33");
	}

	public BlankFinalDemo(String pancard) {
		
		PANCARD = pancard;
		
		System.out.println("Pancard details are "+PANCARD);
	}
}

package com.JavaSeleniumExamples.KeyWordsDemo.FINAL;

public class FinalDemo {

	public static void main(String[] args) {
		
		FinalDemo obj1 = new FinalDemo();
		obj1.show();
		

	}
	
	public void show() {
		
		//Below are normal variables, we can change value
		
		int marks =90;
		    
		marks = 122; //Updated
		
		final int FINAL_MARKS = 220;//Now u cannot change the value after FINAL
		
		// FINAL_MARKS = 220; //Remove comment and check error. We can't change the FINAL value
		
		System.out.println(FINAL_MARKS);
	}

}

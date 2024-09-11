package com.JavaSeleniumExamples.ExceptionHandling;

public class ExceptionHandling {
	
	// What is DeadCode.? -> The code that never Executes. Ex: InputMismatchException below
	 
	public static void main(String[] args) {

		/**
		 * ArithmeticException: Thrown when an exceptional arithmetic condition has
		 * occurred. For example, an integer "divide by zero" throws an instance of this
		 * class. ArithmeticException objects may be constructed by the virtual machine
		 * as if suppression were disabled and/or the stack trace was not writable.
		 */

		// Below Error will create if we give int c =10/0; and Execute
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * com.JavaSeleniumExamples.ExceptionHandling.ExceptionHandling.main(
		 * ExceptionHandling.java:17)
		 */

		System.out.println("Start");

		/** Base Exception/Parent exception 
		 * 
		 * catch (Exception e) {  
	    	 }
		 * 
		 * If we give the BASE EXCEPTION in the beginning then other exceptions 
		 * won't execute because it will stop at Base/Parent exception.
		 * 
		 * It's better to use in last position.
		 * 
		 * */
		
		try {

			int c = 10 / 0;
			System.out.println("Division Result is " + c);
			
		}
		catch (ArithmeticException test) {

			System.out.println("Something went wrong, please check Exception " + test.getMessage());

			System.out.println("Seems you have entered Zero please provide value >0");
			
		}
		/*
		catch (InputMismatchException test) { //If we don't know exception is then we can customize like below

			System.out.println("Please Enter only Integer values ");
			
		}
		catch (Exception test) {  //Base or Parent Exception
				System.out.println("OOPS! Something went wrong");
				

		System.out.println("End");

	}

      */
  }
}

		

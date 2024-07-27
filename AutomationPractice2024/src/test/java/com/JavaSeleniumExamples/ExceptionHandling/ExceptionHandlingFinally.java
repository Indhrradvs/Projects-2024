package com.JavaSeleniumExamples.ExceptionHandling;

public class ExceptionHandlingFinally {

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

		try {

			int c = 10 / 0;
			System.out.println("Division Result is " + c);

		} catch (ArithmeticException test) {

			System.out.println("Something went wrong, please check Exception " + test.getMessage());

			System.out.println("Seems you have entered Zero please provide value >0");
		}

		finally {
			System.out.println("Executed Finally Block");
			System.out.println("End");
		}

	}

}

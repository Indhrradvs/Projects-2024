package com.JavaSeleniumExamples.ExceptionHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordDemo {

	// No need to give individual Exceptions like below. We can give Exception, it will handle all.
	// public static void main(String[] args) throws InterruptedException,FileNotFoundException, AWTException {

	public static void main(String[] args) throws Exception {
		System.out.println("Start");

		Thread.sleep(5000); // Example-1 for throws

		System.out.println("End");

		FileInputStream fis = new FileInputStream(""); // Example-2 for throws

		Robot a = new Robot();// Example-3 for throws
	}

}

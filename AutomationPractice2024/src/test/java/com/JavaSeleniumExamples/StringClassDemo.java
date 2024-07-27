package com.JavaSeleniumExamples;

public class StringClassDemo {
	
	public static void main(String args[]) {
		
		//1.StartsWith & EndsWith Methods
		String name = "Selenium WebDriver";
		
		boolean status = name.startsWith("Selenium");
		
		System.out.println("Status is "+status);
		
		boolean endStatus = name.endsWith("WebDriver");
		
		System.out.println("Status is "+endStatus);
		
		System.out.println("--------------------------");
		
		//2. Equals & EqualIgnoreCase Methods
		/*
		 * Equals: Will compare and return True or False
		 * 
		 * EqualsIgnoreCase: Will compare only content(not small & Caps letters ) returns True or False
		 * 
		 * */
		
		String Actual = "Hello Java World!";
		
		String Expected = "hello java world!";
		
		Boolean status1 = Actual.equals(Expected);
		
		System.out.println("Status of the current value is: "+status1);
		
        Boolean status2 = Actual.equalsIgnoreCase(Expected);
		
		System.out.println("New Status of the value is: "+status2);
		
		System.out.println("--------------------------");
		
		//3. Contains Method
		
        String Actual1 = "Welcome to USA";
		
		String Expected1 = "USA";
		
		Boolean status3 = Actual1.contains(Expected1);
		
		System.out.println("Status is: "+status3);
		
		System.out.println("--------------------------");
		
		//4.SPLIT Method - Returns Array of strings
		
		String fullName = "Selenium-QTP-HP-Cypress";
		
		String[] toolName = fullName.split("-");
		
		for(int i=0; i<toolName.length; i++) {
			
			System.out.println("Value of "+i+" is "+toolName[i]);
			
			if(toolName[i].equalsIgnoreCase("Cypress")) {
				
				System.out.println("Cypress Found");
				break;
			}
		}
		System.out.println("--------------------------");
		
		//5.TRIM Method - Eliminate White spaces before and After the string
		
		String fname = "     Venkat    Dhanyamraju    ";
		
		String aftTrim = fname.trim();
		
		System.out.println("After trim happend:"+aftTrim);

		System.out.println("--------------------------");
		
		//6.charAt() Method - returns a character at specified Index
		
		String fname1 = "Venkat Dhanyamraju";
		
	    char place = fname1.charAt(7);
	    
	    System.out.println("Character at Provided index is: "+place);
		
	    //or
		
	    System.out.println("Character at Provided index is: "+fname1.charAt(10));
		
		}
}

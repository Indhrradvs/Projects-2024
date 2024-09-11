package com.JavaSeleniumExamples.InterfaceDemo;

public class AdvanceCalculator implements Calculator {

	public static void main(String[] args) {
		
		AdvanceCalculator obj1 = new AdvanceCalculator();
		obj1.add();
		obj1.subs();
		obj1.calcSin();
		obj1.calcTan();
			
	}

	public void calcSin() {
		System.out.println("I'm in CalcSin Method from AdvanceCalculator class");
	}
	
	public void calcTan() {
		System.out.println("I'm in CalcTan Method from AdvanceCalculator class");
	}
	
	@Override
	public void add() {
		
		System.out.println("I'm in Add Method from Calculator Interface");
		
	}

	@Override
	public void subs() {
		
		System.out.println("I'm in Subs Method from Calculator Interface");
		
	}

}

package com.JavaSeleniumExamples.Abstraction;

public  class HRteam extends ITDept{

	public static void main(String[] args) {
		
		HRteam hr = new HRteam();
		
		//Scenario-1
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();
		
		
		//Scenario-2
		
		ITDept itd = new HRteam();		
		itd.work();
		itd.goodies();
		itd.salary();
		
	}

	//Below method only belongs to HR Team
	public void bonus() {
		
		System.out.println("Bonus is 2Lakh");
		
	}
	public void salary() {
		
		System.out.println("50LPA");
	}

}

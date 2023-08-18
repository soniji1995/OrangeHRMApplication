package com.DecisionStatements;

public class SalaryHraDaExample {
	
	public static void main(String[] args) {
		
		float basicSalary = 2000;
		float hra1 = basicSalary*0.1f;
		float da1 = basicSalary*0.9f;
		float hra2 = 500;
		float da2 = (basicSalary*98)/100f;
		
		
		if(basicSalary>=1500) {
			System.out.println("The Gross salary is :"+"  "+(basicSalary+hra2+da2));
		}
		
		else {
			System.out.println("The Gross salary is :"+"  "+(basicSalary+hra1+da1));
		}
	}

}

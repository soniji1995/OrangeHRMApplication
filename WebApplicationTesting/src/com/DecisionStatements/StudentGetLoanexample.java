package com.DecisionStatements;

public class StudentGetLoanexample {
	
	//This is a program to find a student is eligible for loan or not.

	public static void main(String[] args) {
		
		String name = "Rahul";
		int age = 20;
		double percentage = 80.6;
		
		if(age>=17 && age<=21) {
			
			if(percentage>=80) {
				System.out.println(name+" is eligible for loan");
			}
		}
		
	}
}

package com.DecisionStatements;

public class DivisionOfStudentExample {

	public static void main(String[] args) {
		
		int sub1 = 76;
		int sub2 = 84;
		int sub3 = 85;
		int sub4 = 75;
		int sub5 = 96;
		float percentage = (sub1+sub2+sub3+sub4+sub5)/5f;
		
		if(percentage >= 60) {
			System.out.println("passed in First Division with "+percentage+"% ");
		}
		
		else if(percentage>=50 && percentage<=59) {
			System.out.println("passed in Second Division");
		}
		
		else if(percentage>=40 && percentage<=49) {
			System.out.println("passed in Third Division");
		}
		
		else {
			System.out.println("failed");
			
		}

		
	}
}

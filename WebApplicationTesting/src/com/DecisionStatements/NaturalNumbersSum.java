package com.DecisionStatements;

public class NaturalNumbersSum {
	
	//This is a program to find sum of n natural numbers.
	
	public static void main(String[] args) {
		
		int n = 0;

		for(int i=1;i<=10;i++) {
			
			n = n+i;
			System.out.println(i);
		}
		
		System.out.println("The sum of natural numbers from 1 to 10 is : "+" "+n);
	}
}
package com.DecisionStatements;

public class SumOfEvenNumbers {
	
	//This is a program to find sum of n even numbers.
	
	
	public static void main(String[] args) {
		
		int n = 0;
		
		for(int i=1;i<=10;i++) {
			
			if(i%2 == 0) {
				n = n+i;
			}
		}
		
		System.out.println(n);	
	}

}

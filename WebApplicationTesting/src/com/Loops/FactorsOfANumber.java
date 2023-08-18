package com.Loops;

public class FactorsOfANumber {
	
	public static void main(String[] args) {
		
		int number = 12;
		
		System.out.println("The factors of number "+number+" are : ");
		
		for(int i=1;i<=number;i++) {
			
			if(number%i == 0) {
			
				System.out.println(i);
			}
			
			
		}
		
		
	}

}

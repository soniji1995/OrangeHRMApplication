package com.Loops;

public class FindReverseNumber {
	
	public static void main(String[] args) {
		
		int number = 654321;
		int rem = 0;
		int reverse = 0;
		
		while(number>0) {
			
			rem = number%10;
			reverse = reverse*10+rem;
			number = number/10;
			
		}
		
		System.out.println("The reverse of the number is :  "+reverse);
		
	}

}

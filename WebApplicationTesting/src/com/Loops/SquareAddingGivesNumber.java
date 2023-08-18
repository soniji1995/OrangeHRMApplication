package com.Loops;

public class SquareAddingGivesNumber {
	
	public static void main(String[] args) {
		
		int digit1,digit2;
		
		for(int number=1;number<=99;number++) {
			
			int temp = number;
			
			digit1 = temp%10;
			temp = temp/10;
			
			digit2 = temp%10;
			temp = temp/10;

			

			
			if(digit1*digit1+digit2*digit2 == number) {
				
				System.out.println(number);
				
			}
			
		}
		
	}

}

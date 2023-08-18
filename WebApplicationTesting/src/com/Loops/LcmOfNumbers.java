package com.Loops;

public class LcmOfNumbers {
	
	public static void main(String[] args) {
		
		int num1 = 49;
		int num2 = 343;
		int rem = 0;
		int lcm = 0;
		int x = 0;
		int y = 0;
		
		if(num1>num2) {
			
			x = num1;
			y = num2;
		}
		
		else {
			
			x = num2;
			y = num1;
		}
		
		rem = x%y;
		
		while(rem != 0) {
			
			x = y;
			y = rem;
			rem = x%y;
			
		}
		
		lcm = (num1*num2)/y;
		System.out.println(lcm);
		
	}

}

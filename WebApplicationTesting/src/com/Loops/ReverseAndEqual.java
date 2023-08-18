package com.Loops;

public class ReverseAndEqual {

	public static void main(String[] args) {
		
		int number = 12321;
		int rem =0;
		int sum = 0;
		int a = number;
		
		while(number>0) {
		
			rem = number%10;
			sum = (sum*10)+rem;
			number = number/10;
		}
		if(a == sum) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
	}
	
}

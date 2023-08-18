package com.Loops;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("The odd numbers from 1 to 10 are :");
		
		for(int i=1;i<=10;i=i+2) {
			sum = sum+i;
			System.out.println(i);
		}
		
		System.out.println("The sum of all odd numbers is :"+sum);
		
	}
	
}

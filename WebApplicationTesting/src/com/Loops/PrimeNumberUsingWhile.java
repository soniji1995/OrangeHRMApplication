package com.Loops;

public class PrimeNumberUsingWhile {
	
	public static void main(String[] args) {
		
		int i = 2;
		int n = 10;
		
		
		
		while(i<n) {
			if(n%i == 0) {
				System.out.println(n+" is not a prime Number");
				break;
			}
			i++;
			
		}
			if(i == n){
				System.out.println(n+" is a prime number");
			}
				
	}

}

package com.BasicJava;

public class BasicsOfJava {

	public static void main(String[] args) {
		
		int principal = 5000;
		int rate = 10;
		int time = 2;
		int amount;
		int simpleInterest;
		
		simpleInterest = (principal*rate*time)/100;
		amount = simpleInterest+principal;
		
		System.out.println("The Simple Interest is : - "+simpleInterest);
		System.out.println("The Amount is : - "+amount);
	}		
	
}

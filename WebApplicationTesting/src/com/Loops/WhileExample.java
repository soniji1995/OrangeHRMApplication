package com.Loops;

public class WhileExample {

	public static void main(String[] args) {
		
		int var= 1;
		
		while(var<=3) {
			System.out.println(var+" venkat ");
			var++;
		}
		
		System.out.println();
		
		System.out.println("The value of variable var is : "+var);
		System.out.println();
		
		while(var<=6) {
			System.out.println(var+" Testing ");
			var++;
		}
		System.out.println();
		
		System.out.println("The value of var now is :"+var);
		System.out.println();
		var = 9;
		
		System.out.println("The value 9 assigned and stored in variable var");
		
		while(var>=3) {
			System.out.println(var+" venkat ");
			var = var-3;
		}
		
		System.out.println("The value of var now is :"+var);
		System.out.println();
		
		while(var>=-6) {
			System.out.println(var+" venkat");
			var = var-5;
		}
		
		System.out.println();
		System.out.println("The final value of var now is :"+var);

	}
}

package com.DecisionStatements;

public class TriangleExample {
	
	//This is a program to find type of a triangle.
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 11;
		int c = 12;
		int squareOfC = a*a + b*b;
		
		if(squareOfC == c*c) {
			System.out.println("The given triangke is right angle triangle");
		}
		
		else if(a==b && b==c) {
			System.out.println("This is an equilateral triangle");
		}
		
		else if(a==b || b==c){
			System.out.println("This is an isosceles traiangle");
		}
		
		else {
			System.out.println("This is a normal triangle");
		}
	}

}

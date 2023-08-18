package com.JumpStatements;

public class Breakexample {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println(i+"  selenium ");
		
			
			if(i==3) {
				
				System.out.println(i+"  WebDriver");
				break;   // break is used to terminate the program execution 
				
			}
			
			System.out.println(i+"  Testing");
			
			
		}
		
		
	}

}

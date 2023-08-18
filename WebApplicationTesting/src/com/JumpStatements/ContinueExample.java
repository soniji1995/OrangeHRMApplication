package com.JumpStatements;

public class ContinueExample {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			
			System.out.println(i+"  selenium");
			
			if(i ==3) {
				
				System.out.println(i+"  Testing");
				continue; // continue is used to iterate the loop contiously by this statement control will again go to 7th
				          // line and will increase the value of i 
			}
			
			System.out.println(i+"  WebDriver");
			
		}
		
	}

}

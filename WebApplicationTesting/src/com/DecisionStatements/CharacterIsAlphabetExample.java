package com.DecisionStatements;

public class CharacterIsAlphabetExample {
	
	public static void main(String[] args) {
		
		char ch = 'R';
		
		if(ch >= 'a' && ch <= 'z' || ch>= 'A' && ch<= 'Z') {
			System.out.println(ch+"  "+"is an alphabet");
		}
	}

}

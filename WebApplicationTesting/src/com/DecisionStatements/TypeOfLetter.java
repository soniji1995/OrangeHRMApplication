package com.DecisionStatements;

public class TypeOfLetter {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		
		if(ch>='a' && ch<='z') {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(ch+" is a lowercase vowel");
			}
			else {
				System.out.println(ch+" is a lowercase consonant");
			}
		}
		else if(ch>='A' && ch<='Z') {
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				System.out.println(ch+" is an upper case vowel");
			}
			else {
				System.out.println(ch+" is an upper case consonant");
			}			
		}
		
		else {
			System.out.println("This is not a letter");
		}
		
	}

}

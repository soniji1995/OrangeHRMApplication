package com.DecisionStatements;

public class NestedIf {

	public static void main(String[] args) {
		
		int var1 = 45;
		int var2 = 40;
		int var3 = 35;
		if(var1>var2) {
			System.out.println("var1 is greater than var2");
			if(var1 == var3) {
				System.out.println("var1 is equal to var3");
			}
			System.out.println("completed");
		}
	}
}

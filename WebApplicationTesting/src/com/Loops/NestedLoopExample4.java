package com.Loops;

public class NestedLoopExample4 {
	
	public static void main(String[] args) {
		
		for(int i=3;i>1;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(" * "+"  ");
			}
			System.out.println();
			System.out.print("  ");
		}
		
		for(int i=1;i<=1;i++) {
			System.out.println("    *   ");
		}
		
		System.out.print("  ");
		
		
		
		for(int i=1;i<=2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * "+"  ");
			}
			System.out.println();
			
		}
		
		
		
	}

}

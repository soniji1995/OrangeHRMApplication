package com.Loops;

public class NestedLoopExample3 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(i);
			}
		}
		
		for(int i=1;i<=3;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" * "+"  ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
		
		for(int i=5;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=5;i>0;i--) {
			for(int j=i;j>0;j--) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}

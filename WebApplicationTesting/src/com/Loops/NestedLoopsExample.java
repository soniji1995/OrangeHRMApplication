package com.Loops;

public class NestedLoopsExample {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=0;j<i;j++) {
				
				System.out.println(i);
				System.out.println("The value of j is : "+j+" which is less than "+i);
			}
		}
		
	}

}

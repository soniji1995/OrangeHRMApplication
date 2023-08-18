package com.Arrays;

public class OneDimensionalArrayExample {

	public static void main(String[] args) {
		
		int array1[] = new int[5];
		
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;

      /*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		*/
		
		for(int index=0;index<=4;index++) {
			
			System.out.println(array1[index]);
			
		}
		
		for(int index=0;index<array1.length;index++) {
			
			System.out.println(array1[index]);
		}
		
		
		int index = 0;
		while(index<array1.length-1)
		{
			System.out.println(array1[index]);
			index++;
		}
		
		index = 0;
		
		do {
			
			System.out.println(array1[index]);
			index++;
			
		}while(index<array1.length);
	}
	
}

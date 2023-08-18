package com.Arrays;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		
		String liveTech[][] = new String [2][2];
		
		// A two dimensional array looks like a 2row*2cell table
		/*
		 cell1     cell2
		 ******************
row1	 * 0,0   *  0,1   *
		 *       *        *
		 ****************** 
row2	 * 1,0   *  1,1   *
		 *       *        *
		 ******************
		 
		 if we want to access all of the elements of an array we have to use nested loops
		  
		 */
	
		
		liveTech[0][0] = "Venkat Sir";
		liveTech[0][1] = "Manual Testing";
		liveTech[1][0] = "Srini Sir";
		liveTech[1][1] = "Automation Testing";
		/*
		System.out.println(liveTech[0][0]);
		System.out.println(liveTech[0][1]);
		System.out.println(liveTech[1][0]);
		System.out.println(liveTech[1][1]);
		*/
		
		for(int row=0;row<liveTech.length;row++) {
			
		  for(int rowOfCell=0;rowOfCell<liveTech.length;rowOfCell++) {
			  
			  System.out.println(liveTech[row][rowOfCell]);
		  }
		}
		
		// different type of output
		
		for(int row=0;row<liveTech.length;row++) {
			
			  for(int rowOfCell=0;rowOfCell<liveTech.length;rowOfCell++) {
				  
				  System.out.print(liveTech[row][rowOfCell]+"  |  ");
			  }
			  System.out.println();
			}
	}
}

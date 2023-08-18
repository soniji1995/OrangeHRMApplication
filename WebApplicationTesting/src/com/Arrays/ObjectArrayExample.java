package com.Arrays;

public class ObjectArrayExample {
	
	public static void main(String[] args) {
		
		//Object array is capable of storing different datatypes but the size is fixed
		//syntax Object arrayName[] = new Object[size]
		
		Object array1[] = new Object[4]; //o/p = 10,selenium,A,10.12345
	//	Object array1[] = new Object[5]; //if we declare size of an array and do not add values to all of indexes the the default value is 0 
		                                 // o/p = 10,selenium,A,10.12345,null
		array1[0] = 10;
		array1[1] = "selenium";
		array1[2] = 'A';
		array1[3] = 10.12345;
//		array1[4] = 20.12345f;  if we add more values than declaraed we will get ArrayOutOfBoundsException
		
	   for(int index=0;index<array1.length;index++) {
		   
		   System.out.println(array1[index]);     
		   
	   }
	   
	   //Multidimensional Object Array
	   
	   Object liveTech[][] = new Object[2][2];
		
	   liveTech[0][0] = "Venkat Sir ";
	   liveTech[0][1] = 50;
	   liveTech[1][0] = "$ ";
	   liveTech[1][1] = "400";
	   
	   /*
	
	   System.out.println(liveTech[0][0]);
	   System.out.println(liveTech[0][1]);
	   System.out.println(liveTech[1][0]);
	   System.out.println(liveTech[1][1]);
	   
	   */
	   
	   for(int row=0;row<liveTech.length;row++) {
		   for(int rowOfCell=0;rowOfCell<liveTech.length;rowOfCell++) {
			   
			   System.out.print(liveTech[row][rowOfCell]);
		   }
		   System.out.println();
	   }
	   
	}

}

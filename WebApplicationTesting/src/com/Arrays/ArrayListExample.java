package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		//ArrayList is a dynamic structure , capable of saving any datatype values
		//There is no declaration of size of an ArrayList As we keep on adding the values n the arraylist 
		//At the time of program execution index of arraylist is created and the value stored into the index of arraylist
		
		List<Object>arrayList1 = new ArrayList();
		
		arrayList1.add("selenium");
		arrayList1.add(10);
		arrayList1.add('A');
		arrayList1.add(10.12345);
		arrayList1.add(20.12345f); // if index is 4 values should be 5 index+1=values if values are less we will get arrayoutofbound exception 
		
		/*
		for(int index=0;index<=4;index++) {
			
			System.out.println(arrayList1.get(index));
		}
		*/
		
		System.out.println("################");
		
		//size() is a method used in arrayList in place of length it gets the size of an array
		
		for(int index=0;index<arrayList1.size();index++) {
		
			System.out.println(arrayList1.get(index));
	}
		//for each loop is used to iterate over arrays and such collections
		// syntax:
		//  for(declaration:expression){
		//        statements
		// }
		
		System.out.println("&&&&&&&&& for each loop &&&&&&&&&");
		
		for(Object index : arrayList1) {
			System.out.println(index);
		}
  }
}
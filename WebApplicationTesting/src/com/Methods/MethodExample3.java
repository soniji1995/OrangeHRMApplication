package com.Methods;

public class MethodExample3 {
	
	private void multiplication() //This method is declared private that's why it can be called in same class only
	{
		
		int var1 = 10;
		int var2 = 20;
		int var3;
		
		var3 = var1*var2;
		
		System.out.println("The value of var3 after multiplication is : "+var3);
		
		
	}
	
	public static void main(String[] args) {
		
		MethodExample3 m3 = new MethodExample3();
		
		m3.multiplication();
		m3.multiplication(); // red square is shown because of multiplication is a private method
		
		//accessing addition method of another class into the current class by 
		//creating an object for that class in the current class and calling the method
		//current class object can't be used to call the methods of another class into the current class
		
        MethodExample2 m2 = new MethodExample2();
		
		m2.addition();
		m2.subtraction(); // on a single object we can call multiple methods
		
		
	}

}

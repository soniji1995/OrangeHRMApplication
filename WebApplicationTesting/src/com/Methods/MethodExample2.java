package com.Methods;

public class MethodExample2 {
	
	//user defined methods are created for code reusability purpose
	
	public void addition() {
		
		int var1 = 10;
		int var2 = 20;
		int var3;
		
		var3 = var1+var2;
		
		System.out.println("The value of variable var3 after addition is : "+var3);
		
	}
	
	public static void main(String[] args) {
		
		MethodExample2 m2 = new MethodExample2();
		
		m2.addition();
		//m2.addition();//we can call user defined methods for any number of times
		//m2.addition();//Reusability of the code is increased 
		
		m2.subtraction();
		
	}
	
	public void subtraction() {
		
		int var1 = 10;
		int var2 = 20;
		int var3;
		
		var3 = var1-var2;
		
		System.out.println("The value of variable var3 after subtraction is : "+var3);
		
	}

}

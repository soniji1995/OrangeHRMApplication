package com.Inheritance;

public class Test1 {
	
	public void addition() 
    {
		
		int var1 = 15;
		int var2 = 20;
		int var3;
		
		var3 = var1+var2;
		
		System.out.println("The value of variable var3 after addition is : "+var3);
		
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.addition();
		
	}

}

package com.Methods;

public class MethodExample6 {
	
	//Global Variables
	
	    int var1 = 40;
	    int var2 = 15;
	
    public void addition() // method without parameters/arguements
    {
		
		int var1 = 10;
		int var2 = 20;
		int var3;
		
		var3 = var1+var2;
		
		System.out.println("The value of variable var3 after addition is : "+var3);
		
	}
    
    
    
    public void addition(int var1 , int var2) // method with parameters/arguements
    {
		
		
		int var3;
		
		var3 = var1+var2;
		
		System.out.println("The value of variable var3 after addition is : "+var3);
		
	}
    
    //Method overloading  when 2 or more than 2 methods in the same class have the same name
    // but different parameters is called method overloading
    
    public void addition(int var1 , int var2 , int var3) // method with parameters/arguements
    {
		
		
		int var4;
		
		var4 = var1+var2+var3;
		
		System.out.println("The value of variable var4 after addition is : "+var4);
		
	}
    
     private void subtraction() {
		
		int var3;
		
		var3 = var1-var2;
		
		System.out.println("The value of variable var3 after subtraction is : "+var3);
		
	}
	
	public static void main(String[] args) {
		
		MethodExample6 m6 = new MethodExample6();
		
		m6.addition();
		m6.addition(50, 80);
		m6.addition(20, 30, 40);
		m6.subtraction();
		
		
	}

}
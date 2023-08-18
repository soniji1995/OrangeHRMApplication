package com.Inheritance;

public class Test3 extends Test2 {
	
    void division() {
		
		
			
			int var1 = 15;
			int var2 = 1;
			int var3;
			
			var3 = var1/var2;
			
			System.out.println("The value of variable var3 after division is : "+var3);
			
                   }
    public static void main(String[] args) {
		
    	System.out.println("*********Test3 Java class***********");
    	
    	Test3 t3 = new Test3();
    	t3.division();
    	System.out.println();
    	
    	System.out.println("*********Accessing Test2 Java class Methods**********");
    	
    	t3.multiplication();
    	t3.addition(20, 30, 40);
    	System.out.println();
    	
    	System.out.println("********Directly Accessing Test1 Java Class Methods***********");
    	t3.addition();
	}
    
}

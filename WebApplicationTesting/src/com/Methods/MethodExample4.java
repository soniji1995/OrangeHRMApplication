package com.Methods;

public class MethodExample4 {
	
	//class without user defined methods
	//calling the methods of other class from current class
	
	protected void division() //This method is declared private that's why it can be called in same class only
	{
		
		int var1 = 100;
		int var2 = 20;
		int var3;
		
		var3 = var1/var2;
		
		System.out.println("The value of variable var3 after division is : "+var3);
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("******MethodExample4 Java Class********");
		
		MethodExample4 m4 = new MethodExample4();
		
		m4.division(); //yellow color square is shown for protected method
		
		System.out.println();
		
		System.out.println("******MethodExample2 Java Class********");
		
		MethodExample2 m2 = new MethodExample2();
		
		m2.addition();
		m2.subtraction();
		
		System.out.println();
		
        System.out.println("******MethodExample3 Java Class********");
		
		MethodExample3 m3 = new MethodExample3();
		
		System.out.println("method can not be called because the method multiplication in the class MethodExample3 is declared as private");
		
		//m3. //method can not be called because the method multiplication in the class MethodExample3 is declared as private

	}

}

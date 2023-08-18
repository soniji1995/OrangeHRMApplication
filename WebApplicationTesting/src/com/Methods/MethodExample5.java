package com.Methods;

public class MethodExample5 {
	
	//class without user defined methods
	//calling the methods of other class from current class
	
	public static void main(String[] args) {
		
		System.out.println("******MethodExample4 Java Class********");
		
        MethodExample4 m4 = new MethodExample4();
		
		m4.division(); //yellow color square is shown for protected method
		
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

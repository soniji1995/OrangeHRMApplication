package com.Methods;

public class MethodExample1 {
	
	// A java class can be used to create any number of user defined methods
	// A java class must and should contain main method to perform the operations of user defined methods
	// A java class can have any number of user defined methods even without a main method but those user defined methods 
	// will not get executed.
	// we can create a user defined method either above or below of main method. but not inside main method
	//An Object using classname should be created and used to call the user defined method inside the main method to execute the 
	//user defined method
	//We can create any number of objects for same class using classname
	//we can call the user defined methods using any number of times by using the object created
	
	public void madhyaPradesh() {
		
		System.out.println("The chief minister of Madhya Pradesh is : Shivraj Singh Chouhan");
	}
	
	
	public static void main(String[] args) {
		
		//To perform the operations related to user defined methods an object should be created to the class
		
		MethodExample1 m = new MethodExample1(); //creating an object for class to call a method (when class is same as object name that is called constructor)
		
		//using the object created method should be called 
		
		m.madhyaPradesh();
		
		// we can create any number of objects for a class 
		
		//MethodExample1 m1 = new MethodExample1();
		
		// we can call the method any number of times
		
		//m1.madhyaPradesh();
		//m1.madhyaPradesh();
		
		//using the object created method should be called 
		
		m.srini();
		
	}
	
	public void srini() {
		
		System.out.println("Hello My Dear Students");
		System.out.println("Let's learn java");
	}

}

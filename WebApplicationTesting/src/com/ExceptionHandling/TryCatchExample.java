package com.ExceptionHandling;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
		TryCatchExample tc = new TryCatchExample();
		tc.addition();
		tc.division();
		
		
	}
	
    public void addition() 
    {
		
		int var1 = 15;
		int var2 = 20;
		int var3;
		
		var3 = var1+var2;
		
		System.out.println("The value of variable var3 after addition is : "+var3);
		
	}

   public void division() //This method is declared private that's why it can be called in same class only
    {
	   
	try
	{
	

		int var1 = 15;
		int var2 = 0;
		int var3;
		
		var3 = var1/var2;
		
		System.out.println("The value of variable var3 after division is : "+var3);	
	}
	
	catch(Exception e) {
		
		//screenshot
		System.out.println(e);
		
	}
			
  }

}
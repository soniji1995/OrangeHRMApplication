package com.Inheritance;

public class Test2 extends Test1 {

	int var1 = 15;
	int var2 = 20;
	int var3 = 40;
	
	public void test2Division() {
		
		try {
			
			int var1 = 15;
			int var2 = 0;
			int var3;
			
			var3 = var1/var2;
			
			System.out.println("The value of variable var3 after division is : "+var3);
			
		}
		
		catch(Exception e)
		{
			//screenshot
			System.out.println(e);
			
		}
		
	}
	
        private void subtraction() {
		
		    int var1 = 15;
		    int var2 = 20;
		    int var3;
		
		var3 = var1-var2;
		
		System.out.println("The value of variable var3 after subtraction is : "+var3);
		
	}
        public void addition(int var1 , int var2 , int var3) // method with parameters/arguements
        {
    		
    		
    		int var4;
    		
    		var4 = var1+var2+var3;
    		
    		System.out.println("The value of variable var4 after addition is : "+var4);
    		
    	}
        
        public void addition()
        {
        	int var3;
        	
        	var3 = var1+var2;
        	
    		System.out.println("The value of variable var4 after addition is : "+var3);

        }
        
        protected void multiplication() //This method is declared private that's why it can be called in same class only
    	{
    		
    		var3 = var1*var2;
    		
    		System.out.println("The value of var3 after multiplication is : "+var3);
    		
    		
    	}
        public static void main(String[] args) {
			
        	Test2 t2 = new Test2();
        	
        	t2.addition(25, 20, 25);
        	t2.addition();
        	t2.subtraction();
        	t2.test2Division();
        	t2.multiplication();
        	
        	/*
        	Test1 t = new Test1();
        	t.addition();
        	*/
        }
        
}
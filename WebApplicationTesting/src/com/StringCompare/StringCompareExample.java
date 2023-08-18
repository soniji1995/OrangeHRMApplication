package com.StringCompare;

public class StringCompareExample {
	
	public static void main(String[] args) {
	
		String var1 = "LiveTech";
		String var2 = "LiveTech";
		
		if(var1.equals(var2)) {
			
			System.out.println("The value of variable var1 is equal to var2 variable value");
			
		}
		
		System.out.println("**************");
		System.out.println();
		
		
		String var3 = "LiveTech";
		String var4 = "Livetech";
		
		
        if(var3.equals(var4)) {   //equals method checks exact match case of the letters of the given string
        	                      //(Lowercase and Uppercase letter should be same)
			
			System.out.println("The value of variable var1 is equal to var2 variable value");
			
		}
        
        else {
        	
        	System.out.println("The value of variable var3 is not equal to var4 variable value");
        }
        
        System.out.println("***********converting a string to lowercase string**************");
        System.out.println();
        
        
        
        String var5 = var3.toLowerCase();
        String var6 = var4.toLowerCase();
        
        System.out.println("The value of var5 is : "+var5);
        System.out.println("The value of var6 is : "+var6);

        
        if(var5.equals(var6)) {
        	
        	System.out.println("The value of variable var5 is equal to var6 variable value");
        }
        
        else {
        	
        	System.out.println("The value of variable var5 is not equal to var6 variable value");
        	
        }
        
        System.out.println("***********converting a string to uppercase string**************");
        System.out.println();
        
        String var7 = var3.toUpperCase();
        String var8 = var4.toUpperCase();
        
        System.out.println("The value of var7 is : "+var7);
        System.out.println("The value of var8 is : "+var8);

        

        if(var7.equals(var8)) {
        	
        	System.out.println("The value of variable var7 is equal to var8 variable value");
        }
        
        else {
        	
        	System.out.println("The value of variable var7 is not equal to var8 variable value");
        	
        }
        
        
        System.out.println("***********Ignore Cases**************");
        System.out.println();
        
        //equalsIgnoreCse will check for the same characters of the string but
        //will ignore the Upper case and Lower case letters. 

        if(var3.equalsIgnoreCase(var4)) {
        	
        	System.out.println("Both strings are equal");
        }
        
        else {
        	
        	System.out.println("Both strings are not equal");
        	
        }
        
        
        System.out.println("***********string contains another string or not**************");
        System.out.println();
        
        // contains(); method matches the character  by character and case as well 
        // upper case and lower case letter should be same 
        
        String var9 = "LiveTech";
		String var10 = "Tech";
		
		//checking for an existence of one string value into another string.
		
		 if(var9.contains(var10)) {
	        	
	        	System.out.println("Tech exists in LiveTech");
	        }
	        
	        else {
	        	
	        	System.out.println("String doesn't exist");
	        	
	        }
		
	}

		
}

package com.DecisionStatements;

public class DriverInsurance {
	
	public static void main(String[] args) {
		
		boolean married = true;
		boolean unmarried = true;
		String gender1 = "male";
		String gender2 = "female";
	    int ageOfDriver = 31;
	    
	    	if(married) {
	    		System.out.println("Hey you are married company insures you!!");
	    	}
	    	else if(unmarried && gender1=="male" && ageOfDriver>30) {
	    		System.out.println("Hey you are unmarried boy but company insures you");
	    	}
	    	else if(unmarried && gender2=="female" && ageOfDriver>25) {
	    		System.out.println("Hey you are unmarried girl but company insures you");
	    	}
	    	else {
	    		System.out.println("Hey you are not eligible for insurance");
	    	}
		
	}

}

package com.DecisionStatements;

public class FindingDaysExample {
	
	public static void main(String[] args) {
		
		int month =55;
		int year = 2023222;
		
		   
			   if(year%4==0 || year%400==0) {
				   
				   if(month == 2) {
					   
					   System.out.println("This is February "+" "+year+" It has 29 days");
					   
				   }
			   }
			   
			   else {
				   
				   switch(month)
				   {
				   
				   case 1 :
					   System.out.println("This is January  "+year+" It has 31 days");
					   break;
					   
				   case 2 :
					   System.out.println("This is February  "+year+" It has 28 days");
					   break;

					   
				   case 3 :
					   System.out.println("This is March  "+year+" It has 31 days");
					   break;

					   
				   case 4 :
					   System.out.println("This is April  "+year+" It has 30 days");
					   break;

					   
				   case 5 :
					   System.out.println("This is May  "+year+" It has 31 days");
					   break;

					   
				   case 6 :
					   System.out.println("This is June  "+year+" It has 30 days");
					   break;

					   
				   case 7 :
					   System.out.println("This is July  "+year+" It has 31 days");
					   break;

				   case 8 :
					   System.out.println("This is August  "+year+" It has 31 days");
					   break;

					   
				   case 9 :
					   System.out.println("This is September  "+year+" It has 30 days");
					   break;

				   case 10 :
					   System.out.println("This is October  "+year+" It has 31 days");
					   break;

					   
				   case 11 :
					   System.out.println("This is November  "+year+" It has 30 days");
					   break;

					   
				   case 12 :
					   System.out.println("This is December  "+year+" It has 31 days");
					   break;

				   default :
					   System.out.println("Not a valid month");

				   }				   
			   }		
    	}

}

package com.DecisionStatements;

public class QuantityPriceDiscountExample {
	
	//This is program to calculate discounted bill after purchase if quantity is greater or
	//equal to 100 discount is 10% if quantity >=150 then discount is 15%.
	
	public static void main(String[] args) {
		
		int quantity = 205;
		int price = 16;
		int bill = price*quantity;
		float billWithDiscount1 = (price*quantity) - (quantity*price)*0.1f;
		float billWithDiscount2 = (price*quantity) - (quantity*price)*0.15f;
		
		if(quantity>=100) {
			
			System.out.println(billWithDiscount1);
		}
		else if(quantity>=150) {
			
			System.out.println(billWithDiscount2);
		}
		else {
			
			System.out.println(bill);
		}
	}

}

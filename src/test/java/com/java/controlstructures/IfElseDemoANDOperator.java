package com.java.controlstructures;

public class IfElseDemoANDOperator {

	public static void main(String[] args) {

		int personAge = 17;

		//AND Operator
		
		/* true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 * */
		if (personAge >= 18 && personAge <= 60) {  // 17 >= 18 && 17 <= 60 --> false && true --> false
			System.out.println("Person is eligible to vote from voting station");
		} 
		else if (personAge > 60) { //  17 > 60 -->false
			System.out.println("Person is eligible to vote from Home");
		} 
		else {
			System.out.println("Person is not eligible to vote");
		}

		System.out.println("main() is complete");
	}

}

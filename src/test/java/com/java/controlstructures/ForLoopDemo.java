package com.java.controlstructures;

public class ForLoopDemo {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) { // 2 ; 2 <= 5 --> true
//			if ( i%2 == 0) { //  2 % 2 == 0 --> 
//				System.out.println("Hello All!");
//			} 
//			else {
//				System.out.println("Hi Everyone!");
//			}
//		}

		//To quit the for loop upon break
		// example for increment operator
		for (int i = 1; i <= 5; i++) {
            if(i == 2) { // 2 == 2
            	break;
            }
			System.out.println("Hi Everyone!");
		}
		
		System.out.println("**********************");
		
		//To skip a particular iteration of the forloop we use continue
		for (int i = 1; i <= 5; i++) {
            if(i == 1) { // 3 == 3 --> true
            	continue;
            }
			System.out.println("Hi Everyone! " + i);
		}

		System.out.println("I am ouside of forloop");
		
		System.out.println("==============================");
		
		//decrement oprator
		for (int i = 5; i > 0; i--) { // 0 ; 0 > 0 --> false
			System.out.println("Hi Everyone! " + i);
		}

	}

}

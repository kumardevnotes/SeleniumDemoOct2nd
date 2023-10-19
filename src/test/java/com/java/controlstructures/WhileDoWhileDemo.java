package com.java.controlstructures;

public class WhileDoWhileDemo {

	public static void main(String[] args) {
		
		int abc = 5;
		
		//in while, we first check the condition and then execute the code inside while block
		while(abc > 0) { // 0 > 0
			System.out.println(abc);
			abc--;
		}
		
		System.out.println("++++++++++++++++++++++++++");
		
		int xyz = 5;
		
		//in do..while, we first execute the code inside do  blockand then check the condition 
		do {
			System.out.println(xyz); 
			xyz--; 
		} while(xyz > 0);
		
	}

}

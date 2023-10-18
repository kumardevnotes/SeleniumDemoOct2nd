package com.java.controlstructures;

public class IfElseDemoOROperator {

	public static void main(String[] args) {
		
		//OR Operator Demo
		
		/* true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false
		 * */
		
		/*
		 * int depIdHR = 1122; //HR department 
		 * int depIdRevenue = 3344; //Revenue department 
		 * int depIdIT = 5566; //IT department
		 * int depIdEngineering = 7788; //Engineering department
		 */
		
		int depId = 33445;
		
		if (depId == 1122 || depId == 3344) { // 33445 == 1122 || 33445 == 3344 --> false || false --> false
			System.out.println("Both HR and Revenue departments come under same umbrella");
		} 
		else if (depId == 5566 || depId == 7788) { // false
			System.out.println("Both IT and Engineering departments come under same umbrella");
		} 
		else {
			System.out.println("DepartmentId is not valid");
		}

		System.out.println("main() is complete");
	}

}

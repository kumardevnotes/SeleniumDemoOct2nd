package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		// Store employee details like EmpName, EmpId, EmpGender, EmpMarStatus, EmpSal into a single java variable and print it
		
		//List collection accepts duplicate values
		//List is index based and you can add new value at given index

		List empDetails = new ArrayList(); // internally ArrayList implements List
	
		empDetails.add("John Miller"); // String
		empDetails.add(112233); //int
		empDetails.add('M'); //char index 2
		empDetails.add(false); // boolean
		empDetails.add("John Miller");
		empDetails.add(4000.40); //double 
		empDetails.add("John Miller");
		
		
		//System.out.println(empDetails);
		
		//advanced forlooop
//		for(Object obj : empDetails) {
//			System.out.println(obj);
//		}
		
//		for (int i = 0; i < empDetails.size(); i++) {
//			System.out.println(empDetails.get(i));
//		}
//		
//		System.out.println(empDetails.contains("John Legend")); // true or false
//		
		empDetails.add(2, "NewJersy");
		
		//System.out.println(empDetails);
		
		
		List empChildDetails = new ArrayList();
		empChildDetails.add("Mike");
		empChildDetails.add(9);
		empChildDetails.add('M');
		
		empDetails.addAll(empChildDetails);
		System.out.println(empDetails);
		
		//empDetails.clear();
		
		
		//System.out.println(empDetails);
		//System.out.println(empDetails.isEmpty());
		
		empDetails.remove(2);
		System.out.println(empDetails);
				
	}

}

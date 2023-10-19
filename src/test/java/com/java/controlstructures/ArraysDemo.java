package com.java.controlstructures;

public class ArraysDemo {

	public static void main(String[] args) {
		
		/* Arrays are used to store multiple values into a single variable
		 * Arrays store only homogeneous data
		 * Arrays are fixed in size or you can not add a new values into an array which is assigned with values
		 * */
		
		String empName = "Kumar";
		int empId  =  1122;
		System.out.println(empName);
		
		String[] empNames  = {"John" ,"Mike" ,"Tom","john1" ,"Mike1" ,"Tom1","John2" ,"Mike2" ,"Tom2", "Tim"};
		int[] empIds = {1122, 2233, 3344, 5566, 7788, 8899, 9900, 1001, 1002, 1007 };
		//Assignment1: create float, double, boolean and char arrays and show me
		//Assignment2: try to print your array values using forloop
		
		System.out.println(empNames[0]);
		System.out.println(empNames[1]);
		System.out.println(empNames[3]);
		System.out.println(empNames[6]);
		System.out.println(empNames[empNames.length - 1]); //Tim
		
		System.out.println(empIds[0]);
		System.out.println(empIds[1]);
		System.out.println(empIds[2]);
		System.out.println(empIds[3]);
		System.out.println(empIds[4]);
		
		for (int i = 0; i < empIds.length; i++) { // 10 ; 10 < 10 --> true
			System.out.println(empNames[i]); // empNames[9] --> Tim
		}
		
		//Declaring array with size
		int[] dynamicArrayDemo = new int[4];
		
		System.out.println("Assigning values into array variable");
		for (int i = 0; i < dynamicArrayDemo.length; i++) {
			dynamicArrayDemo[i] = 100 + i;
		}
		
		System.out.println("Printing values of the arry using forloop");
		for (int i = 0; i < dynamicArrayDemo.length; i++) {
			System.out.println(empNames[i]);
		}
	
	}

}

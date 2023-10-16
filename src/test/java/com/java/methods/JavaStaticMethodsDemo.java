package com.java.methods;

public class JavaStaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("demo on Java static methods");
		
		// calling methods directly without class object
		
		JavaStaticMethodsDemo.displayEmpName();
		displayEmpName();
		displayEmpName();
		displayEmpName();
		displayEmpName();

		displayEmpName("Th Kumar");
		displayEmpName("John Doe");
		displayEmpName("Sanaya ");
		displayEmpName("Ruby");

		displayEmpName("Joe", "Biden");

		System.out.println(getEmpSal(300));

		int finalsal = getEmpSal(300);
		System.out.println(finalsal);
	}

	// Concept of methods having same name is called "method overloading" in java

	// Declaring a static method with no params
	public static void displayEmpName() {
		System.out.println("John Miller");
	}

	// Declaring a static method with String param
	public static void displayEmpName(String empName) {
		System.out.println("Given empName: " + empName);
	}

	// Declaring a static method with 2 string params
	public static void displayEmpName(String firstName, String lastName) {
		System.out.println("Given empName: " + firstName + lastName);
	}

	// Declaring a method with int returntype with int param
	public static int getEmpSal(int empIncentive) {
		int fixedSal = 2500;
		int finalSal = fixedSal + empIncentive;
		return finalSal;
	}

	// Declaring a method with int returntype with int param
	public static String demo1() {
		//
		//
		//
		return "Kumar";
	}

	// Declaring a method with int returntype with int param
	public static double demo2() {
		//
		return 400.656565;
	}

	// Declaring a method with int returntype with int param
	public static boolean demo3() {
		//
		return true;
	}

}

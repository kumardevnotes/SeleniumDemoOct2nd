package com.java.methods;

public class JavaNonStaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("demo on Java non-static methods");
		
		//To call all the below 4 non-staic methods, we need to first create an object of the class
		//Then using the object, we can call each non-static method
		
		//A standard expression to create a class object
		JavaNonStaticMethodsDemo object = new JavaNonStaticMethodsDemo();
		object.displayEmpName();
		object.displayEmpName("Kumar Th");
		object.displayEmpName("John", "Doe");
		System.out.println(object.getEmpSal(290));
	}

	// Concept of methods having same name is called "method overloading" in java

	// Declaring a non-static method with no params
	public void displayEmpName() {
		System.out.println("John Miller");
	}

	// Declaring a non-static method with String param
	public void displayEmpName(String empName) {
		System.out.println("Given empName: " + empName);
	}

	// Declaring a non-static method with 2 string params
	public void displayEmpName(String firstName, String lastName) {
		System.out.println("Given empName: " + firstName + lastName);
	}

	// Declaring a non-static method with int return type with int param
	public int getEmpSal(int empIncentive) {
		int fixedSal = 2500;
		int finalSal = fixedSal + empIncentive;
		return finalSal;
	}

}

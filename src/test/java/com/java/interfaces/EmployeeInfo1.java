package com.java.interfaces;

public class EmployeeInfo1 implements EmployerInfo { // class implements interface

	public static void main(String[] args) {
		EmployeeInfo1 empInfo1 = new EmployeeInfo1();
		
		empInfo1.displayEmpName();
		empInfo1.displayEmpId();
		
		empInfo1.displayCompName();
		System.out.println(empInfo1.getCompanyId());
		empInfo1.displayCompanyShareValue(120);
		
		EmployerInfo employerObj = new EmployeeInfo1(); //Creating a class obj and assigning this to interface object as a reference. So using this interface object, you can call only interface level methods but not class methods
		
		employerObj.displayCompName();
		employerObj.displayCompanyShareValue(100);
		System.out.println(employerObj.getCompanyId());
		
	}
	
	//Concrete methods in class
	
	public void displayEmpName() {
		System.out.println("John Miller");
	}
	
	public void displayEmpId() {
		System.out.println("1122");
	}

	@Override
	public void displayCompName() {
		System.out.println("Oracle");
	}

	@Override
	public int getCompanyId() {
		//
		//
		return 5566;
	}

	@Override
	public void displayCompanyShareValue(int shareValue) {
		System.out.println(10 + shareValue);
	}

}

package com.java.interfaces;

public class EmployeeInfo1 implements EmployerInfo {

	public static void main(String[] args) {
		EmployeeInfo1 empInfo1 = new EmployeeInfo1();
		empInfo1.displayEmpName();
		empInfo1.displayEmpId();
		empInfo1.displayCompName();
		System.out.println(empInfo1.getCompanyId());
		empInfo1.displayCompanyShareValue(120);
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

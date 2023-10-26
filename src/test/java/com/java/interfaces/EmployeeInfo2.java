package com.java.interfaces;

public class EmployeeInfo2 implements EmployerInfo {

	public static void main(String[] args) {
		EmployeeInfo2 empInfo1 = new EmployeeInfo2();
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
		System.out.println("The compnany name is:");
		System.out.println("Microsoft");
	}

	@Override
	public int getCompanyId() {
		return 7757576;
	}

	@Override
	public void displayCompanyShareValue(int shareValue) {
		System.out.println(shareValue);
	}

}

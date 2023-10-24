package com.java.inheritance;

public class SchoolClass {
	
	public static void main(String args[]) {
		SchoolClass schoolObj =  new SchoolClass();
		schoolObj.displaySchoolIncome();
	}
	
	public void displaySchoolName() {
		System.out.println("Rynolds High school");
	}
	
	public void getSchoolFee() {
		System.out.println("100$ per month");
	}
	
	public void displaySchoolAddress() {
		System.out.println("Smith Lane 132, Kingston, New York 12401");
	}
	
	private void displaySchoolIncome() {
		System.out.println("School income: 10000$");
	}

}

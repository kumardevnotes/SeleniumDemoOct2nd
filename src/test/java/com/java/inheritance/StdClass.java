package com.java.inheritance;

           //ChildClass extends ParentClass
           //SubClass extends SuperClass
public class StdClass extends SchoolClass{

	public static void main(String[] args) {
		StdClass student =  new StdClass(); //5MB
		student.displayStdName();
		student.displayStdFee();
		
		student.displaySchoolName();
		student.displaySchoolAddress();
		student.getSchoolFee();
		//Below code will give an error becoz the method is private
		//student.displaySchoolIncome();
		
	}
	
	public void displayStdName() {
		System.out.println("John Doe");
	}
	
	public void displayStdFee() {
		System.out.println("500$ per month");
	}

}

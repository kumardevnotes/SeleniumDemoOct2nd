package com.package1;

import com.package2.ParentClass1;

public class ChildClass1 extends ParentClass1 {

	final int stdAge = 20;
	
	String stdName  = "Mike";
	
	public static void main(String[] args) {
		
		ChildClass1 obj = new ChildClass1();
		obj.displayChildNameAndAge();
		//obj.displayParentName();
		obj.displayParentAge();
		obj.displayStdNames();
		
	}
	public void displayChildNameAndAge() {
		System.out.println("John Doe");
		//stdAge = 29;
		System.out.println(stdAge);
	}
	
	//Overriding a parent class method in child class -  Dynamic polymorphism
	public void displayParentName() {
		System.out.println("You can find the parent name below");
		System.out.println("Parent name is: "+ " John Miller");
	}
	
	public void displayStdNames() {
		System.out.println(stdName);
		System.out.println(this.stdName);
		System.out.println(super.stdName);
		this.displayParentName();
		super.displayParentName();
	}

}

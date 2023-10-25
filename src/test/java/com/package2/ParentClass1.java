package com.package2;

public class ParentClass1 {
	
	public String stdName  = "Nelson";
	
	public static void main(String[] args) {
		ParentClass1 parentObj = new ParentClass1();
		parentObj.displayParentName();
		parentObj.displayParentAge();
	}

	public void displayParentName() {
		System.out.println("Tom Cruise");
	}
	
	public void displayParentCountry() {
		System.out.println("U.S.A");
	}
	
	protected void displayParentAge() {
		System.out.println("45");
	}
}

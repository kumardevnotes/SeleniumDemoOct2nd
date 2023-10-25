package com.package2;

public final class ParentClass2 {
	
	public static void main(String[] args) {
		ParentClass2 parentObj = new ParentClass2();
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

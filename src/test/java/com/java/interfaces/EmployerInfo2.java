package com.java.interfaces;

public abstract class EmployerInfo2 {

	//Abstract methods -  Methods without body
	
	public abstract void displayCompName();
	public abstract int getCompanyId();
	public abstract void displayCompanyShareValue(int shareValue);
	
	//below is a concrete method
	public void displayCompanyAddress() {
		System.out.println("Kings lane, 100, London");
	}
}

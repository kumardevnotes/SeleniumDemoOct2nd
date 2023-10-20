package com.java.exceptions;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		try {
			
			String empName = "hello"; 
			System.out.println(empName.toUpperCase());	
			
			int firstNum = 100, secondNum = 10;
			System.out.println(firstNum/secondNum);
			
		} catch (NullPointerException e) {
			System.out.println("caught some exception: " + e);
		} catch (ArithmeticException e) {
			System.out.println("caught some exception: " + e);
		}
		
		finally {
			System.out.println("I will always run whether you get exception or not");
		}

		System.out.println("main() is complete");
	}

}

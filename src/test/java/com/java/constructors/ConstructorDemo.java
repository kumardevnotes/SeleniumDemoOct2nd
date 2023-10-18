package com.java.constructors;

public class ConstructorDemo {
	
	//A constructor is a special method or member function whose name is same as className
	//Constructor is automatically triggered as soon as we create an object of  class. we no need to call them in main()
	//Can we overload a constructor in a java class ? -  Yes
	
	ConstructorDemo(){
		System.out.println("I am default constructor");
	}
	
	ConstructorDemo(String message){
		System.out.println("I am param constructor with some msg " + message);
	}

	public static void main(String[] args) {
		ConstructorDemo object = new ConstructorDemo();
//		object.displayEmpName();
//		System.out.println(object.getEmpId());
		
		ConstructorDemo object1 = new ConstructorDemo("Hello All");
		object1.displayEmpName();
		System.out.println(object1.getEmpId());
	}
	
	public void displayEmpName() {
		System.out.println("John Legend");
	}
	
	public int getEmpId() {
		return 112233;
	}

}

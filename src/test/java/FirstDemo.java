
/*
 * To start with java, we need to create a class
 * Find that a class is created with main method
 * Write some sysout and then press ctrl + spacebar, it creates System.out.println()
 * 
 * */
public class FirstDemo {

	public static void main(String[] args) {
		System.out.println("Hello Everyone!");
		// calling a method in java
		displayName();
		//displayStatus();
	}

	// creating or declaring a user defined method in java
	public static void displayName() {
		System.out.println("John Legend");
	}

	public static void displayStatus() {
		int age = 10;
		if (age >= 18) { // 10 >= 18 --> false
			System.out.println("Its a major");
		} else {
			System.out.println("Its a minor");
		}
	}

	// System.out.println("I am an error. I will not be shown on console");

}

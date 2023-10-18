package com.java.controlstructures;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		String weekDay = "Monday"; // Tuesday Wed...Thurs.. Fri.. Satday Sunday
		
		switch (weekDay) { //Sunday
		case "Monday":
			System.out.println("Its a weekday");
			System.out.println("Its a weekday");
			System.out.println("Its a weekday");
			System.out.println("Its a weekday");
			System.out.println("Its a weekday");
			System.out.println("Its a weekday");
			break;
		case "Tuesday":
			System.out.println("Its a weekday");
			break;
		case "Wednesday":
			System.out.println("Its a weekday");
			break;
		case "Thursday":
			System.out.println("Its a weekday");
			break;
		case "Friday":
			System.out.println("Its a weekday");
			break;
		case "Saturday":
			System.out.println("Its a weekend");
			break;
		case "Sunday":
			System.out.println("Its a weekend");
			break;
		default:
			System.out.println("The day is invalid");
		}
		
		System.out.println("switch block is complete");
	}

}

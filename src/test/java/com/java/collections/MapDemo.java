package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		// empName = John, empId = 1122, empGender = 'M' empSal = 5000, empMarStatus =
		// false
		// Map is dynamic in size same as (List and Set)
		// In Map, we store info in the form of key and value pair where key should be
		// unique but value May/MayNotbe

		Map<String, String> myEmpRecord = new HashMap<String, String>(); // HashMap implements Map

		myEmpRecord.put("empName", "John"); // ?
		myEmpRecord.put("empId", "1122");
		myEmpRecord.put("empGender", "M");
		myEmpRecord.put("empSal", "5000");
		myEmpRecord.put("empMarStatus", "false");
		myEmpRecord.put("empName", "Mike"); // ?

		myEmpRecord.put("empGender", "M");

		System.out.println(myEmpRecord);

		System.out.println(myEmpRecord.containsKey("empName")); // true
		System.out.println(myEmpRecord.containsValue("Mike")); // true

		System.out.println("Keys: " + myEmpRecord.keySet());
		System.out.println("Values: " + myEmpRecord.values());

		for (Map.Entry<String, String> entry : myEmpRecord.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Map<String, Integer> studentNameWithRollNo = new HashMap<String, Integer>(); // HashMap implements Map
		studentNameWithRollNo.put("john", 1122); 
		studentNameWithRollNo.put("Mike", 1123);
		studentNameWithRollNo.put("Tom", 1124);
		studentNameWithRollNo.put("Kumar", 1125);
		studentNameWithRollNo.put("Sam", 1127);
		System.out.println(studentNameWithRollNo);
	}

}

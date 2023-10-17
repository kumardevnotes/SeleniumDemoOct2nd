package com.java.string.methods;

public class StringMethods {

	public static void main(String[] args) {
		
		String city = "NewYork";
		
		/*
		 * city[0] = N
		 * city[1] = e
		 * city[2] = w 
		 * city[3] = Y
		 * city[4] = o
		 * city[5] = r
		 * city[6] = city[legth()-1] =  k
		 * length() --> 7
		 * */
		
		System.out.println(city);
		
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.charAt(2)); //w
		System.out.println(city.equals("newyork")); //true, false ---> false
		System.out.println(city.equalsIgnoreCase("newyork")); // true

		System.out.println(city.replace('Y', 'X')); //NewXork
		System.out.println(city.contains("New")); //true
		System.out.println(city.contains("YorkNew")); //false
		System.out.println(city.startsWith("N")); // true/false
		System.out.println(city.endsWith("New")); //false
		
		System.out.println(city.length()); //7
		System.out.println(city.isEmpty()); //true/false
		
		city = "  NewYork  ";
		
		System.out.println(city);
		System.out.println(city.trim());

	}

}

package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionDemo {

	public static void main(String[] args) {

		/*
		 * Set is a collection interface and HashSet is its implementing class Set is
		 * dynamic in size and its size is increased as soon as you add new element to
		 * it Its size is decreased as soon as you remove an element Each element by
		 * default considered as an Object and stored into Set collection Set collection
		 * does not accept duplicate values 
		 * Set is not index based
		 */

		Set classRollNumbers = new HashSet(); // HashSet implements Set

		classRollNumbers.add(1);
		classRollNumbers.add(2);
		classRollNumbers.add(6);

		classRollNumbers.add(1);
		classRollNumbers.add(2);
		classRollNumbers.add(6);

		classRollNumbers.add(3);
		classRollNumbers.add(4);
		classRollNumbers.add(5);

//		for (Object obj : classRollNumbers) {
//			System.out.println(obj);
//		}
		
		System.out.println(classRollNumbers);

		Set cityNames = new HashSet(); // HashSet implements Set

		cityNames.add("Berlin");
		cityNames.add("London");
		cityNames.add("Madrid");
		cityNames.add("Torino");
		cityNames.add("Vancouver");
		cityNames.add("SanFrancisco");
		cityNames.add("Paris");
		
		System.out.println(cityNames);
		
		Set cityNamesList2 = new HashSet(); // HashSet implements Set

		cityNamesList2.add("Helsinki");
		cityNamesList2.add("Seattle");
		
		System.out.println(cityNames.addAll(cityNamesList2));
		System.out.println(cityNames);
		
		//Practice all the other methods like size(), remove(), clear(), forloop....

	}

}

package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionWithGenerics {

	public static void main(String[] args) {

		List<Integer> empIds = new ArrayList<Integer>();
		
		//empIds.add("Kumar");
		empIds.add(1122);
		empIds.add(1, 4455);
		
		List<Integer> oldEmpIds = new ArrayList<Integer>();
		oldEmpIds.add(9989);
		oldEmpIds.add(1000);
		
		empIds.addAll(oldEmpIds);
		
		System.out.println(empIds);

	}

}

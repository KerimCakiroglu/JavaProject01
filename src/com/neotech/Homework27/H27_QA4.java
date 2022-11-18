package com.neotech.Homework27;

import java.util.ArrayList;

public class H27_QA4 {

	public static void main(String[] args) {

//		Create a ArrayList that will store 5 names into it.
//		Find out whether the given ArrayList is empty or not?
//		Check whether the specific name is present in an ArrayList or not?
//		Find the size of your ArrayList and print all values from the ArrayList
//		

		// int[] numbers = new int[6];

		ArrayList<String> names = new ArrayList<String>();
		int size = names.size();
		names.add("Kerim");
		names.add("Gul");
		names.add("Yusuf");
		names.add("Ayse");
		names.add("Ali");

		System.out.println(names);

		System.out.println("--------");

		for (String name : names) {
			System.out.println(name);
		}

	}
}
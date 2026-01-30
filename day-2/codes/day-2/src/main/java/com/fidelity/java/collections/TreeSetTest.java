package com.fidelity.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names + " | size = " + names.size());
		
		System.out.println(names.add("Sanjay")); //true
		System.out.println(names.add("Sanjay")); //false
		System.out.println(names.add("Praveen")); //true
		names.add("Rahul");
		names.add("Sachin");
		names.add("Bharath");
		
		System.out.println(names + " | size = " + names.size());
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}
}

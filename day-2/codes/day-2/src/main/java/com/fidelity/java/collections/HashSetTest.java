package com.fidelity.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names + " | size = " + names.size());
		
		System.out.println(names.add("Sanjay")); //true
		System.out.println(names.add("Sanjay")); //false
		System.out.println(names.add("Praveen")); //true
		names.add("Rahul");
		names.add("Sachin");
		names.add("Bharath");
		
		System.out.println(names + " | size = " + names.size());
		System.out.println();
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("----> " + name);
		}
		System.out.println();
		
		names.add(null);
		System.out.println(names);
	}
}

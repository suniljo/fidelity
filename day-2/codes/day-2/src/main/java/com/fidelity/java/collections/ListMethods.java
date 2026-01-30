package com.fidelity.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("no of participants = " + names.size());
		System.out.println(names);
		System.out.println("is list empty = " + names.isEmpty());
		
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Shankar");
		names.add("Praveen");
		names.add("Mark");
		names.add("Chris");
		names.add("Praveen");
		System.out.println(names + " | size = " + names.size());
		
		names.add(1, "Sooraj");
		names.set(1, "SOORAJ");
		System.out.println(names + " | size = " + names.size());
		System.out.println();
		
		System.out.println("indexOf(Praveen) = " + names.indexOf("Praveen"));
		System.out.println("indexOf(Sunil) = " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Praveen) = " + names.lastIndexOf("Praveen"));
		System.out.println();
		
		System.out.println("is \"SOORAJ\" in list = " + names.contains("SOORAJ"));
		
		System.out.println("person @ index 0 = " + names.get(0));
		
		System.out.println(names.remove("SOORAJ")); //true
		System.out.println(names.remove("SOORAJ")); //false
		System.out.println(names.remove(1)); //Sanjay
		
		System.out.println(names + " | size = " + names.size());
	}

}

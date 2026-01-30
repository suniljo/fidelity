package com.fidelity.java.collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f));//25000.0
		System.out.println(bank.put("Sahithi", 99999f)); //null
		
		bank.put("Charles", 25000f);
		bank.put("Rahul", 25000f);
		bank.put("Sagar", 85000f);
		
		System.out.println(bank);
		System.out.println();

		//bank.put("Sagar", null);
		bank.put(null, 25000f); //java.lang.NullPointerException
		System.out.println(bank);	
	}

}

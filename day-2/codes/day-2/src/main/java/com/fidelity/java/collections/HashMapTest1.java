package com.fidelity.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		//the previous value associated with key, or 
		//null if there was no mapping for key.
		System.out.println(bank.put("Sanjay", 11500.5f)); //null
		System.out.println(bank.put("Sanjay", 15000f)); //11500.5
		System.out.println(bank.put("Rahul", 12500.5f)); //null
		
		bank.put("Charles", 25000f);
		bank.put("Rahul", 38750.5f);
		bank.put("Sagar", 85000f);
		
		System.out.println(bank);
		System.out.println();	
		
		float bal = bank.get("Sanjay");
		System.out.println("A/c balance of \"Sanjay\" = " + bal);
		bank.put("Sanjay", (bal+1000.5f));
		System.out.println(bank);
		System.out.println();	
		
		Set<String> keySet = bank.keySet();
		keySet.stream().forEach(System.out::println);
		System.out.println();
		
		Set<Map.Entry<String, Float>> entrySet = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String key = entry.getKey();
			Float value = entry.getValue();
			
			System.out.println(String.format("%-10s  : %.2f", key, value));
			Thread.sleep(2000);
		}
	}

}

package com.fidelity.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f));//25000.0
		System.out.println(bank.put("Sahithi", 99999f)); //null
		
		bank.put("Charles", 25000f);
		bank.put("Rahul", 38750.5f);
		bank.put("Sagar", 85000f);
		
		System.out.println(bank);
		System.out.println();
		System.out.println();
		
		float bal = bank.get("Sunil");
		System.out.println(String.format("A/C Balance of \"Sunil\" = %.2f", bal));
		bank.put("Sunil", bal + 1000.5f);
		System.out.println(bank);
		System.out.println();
		
		System.out.print("A/C Holders :  ");
		Set<String> keys = bank.keySet();
		for(String key : keys) {
			System.out.print(key + " | ");
		}
		System.out.println("\n");
		
		System.out.println(" ====== A/C Holders with Balance ======");
		Set<String> keys1 = bank.keySet();
		for(String key : keys1) {
			System.out.println(String.format("%-10s : %.2f", key, bank.get(key)));
		}
		System.out.println("\n");
		System.out.println("=".repeat(100));
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		
		for(Map.Entry<String, Float> entry : entries) {
			String key = entry.getKey();
			Float balance = entry.getValue();
			
			String ac = String.format("%-10s : %.2f", key, balance);
			System.out.println(ac);
			
			try {
				Thread.sleep(2000);
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
		
		System.out.println();
		
		bank.put(null, null);
		System.out.println(bank);
	}
}

package com.fidelity.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HakerRankMap1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> insurances = new TreeMap<Integer, String>();
		
		System.out.print("Enter the no of Policy names you want to store: ");
		int noOfPolicies = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=noOfPolicies; i++) {
			System.out.print("Enter the Policy ID : ");
			int policyId = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter the Policy Name : ");
			String policyName = sc.nextLine();
			
			insurances.put(policyId, policyName);
		}
		
		String id = "Policy ID";
		String pName = "Policy Names";
		System.out.println(String.format("%-10s | %s", id, pName));
		System.out.println("========== | =============================================");
		
		Set<Map.Entry<Integer, String>> entries = insurances.entrySet();
		for(Map.Entry<Integer, String> entry : entries) {
			Integer pid = entry.getKey();
			pName = entry.getValue();
			
			String policy = String.format("%-10d | %s", pid, pName);
			System.out.println(policy);
		}
		System.out.println("=".repeat(100));
		
		System.out.print("Enter the policy type to be searched : ");
		String policyType = sc.nextLine();
		
		List<Integer> matchingPolicies = new ArrayList<Integer>();
		
		Set<Map.Entry<Integer, String>> entries1 = insurances.entrySet();
		for(Map.Entry<Integer, String> entry : entries1) {
			Integer pid = entry.getKey();
			pName = entry.getValue();
			
			boolean checkStatus = pName.toLowerCase().indexOf(policyType.toLowerCase()) >= 0;
			if(checkStatus) {
				matchingPolicies.add(pid);
			}
			
		}
		
		System.out.println();
		for(Integer polId : matchingPolicies) {
			System.out.println(polId);
		}
		
		sc.close();
	}

}

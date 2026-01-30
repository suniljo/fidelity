package com.fidelity.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HackeRankMap {

	public static void main(String[] args) {
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter how many contacts: ");
		int noOfContacts = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=noOfContacts; i++) {
			System.out.print("enter contact name: ");
			String ctName = sc.nextLine();
			
			System.out.print("enter contact no: ");
			Long ctNo = sc.nextLong();
			sc.nextLine();
			
			phoneBook.put(ctName, ctNo);
		} //for
		
		List<String> checkNames = new ArrayList<String>();
		System.out.print("enter queries");
		for(int i=1; i<=noOfContacts; i++) {
			checkNames.add(sc.nextLine());
		}
		
		System.out.println();
		
		for(int i=0; i<noOfContacts; i++) {
			String name = checkNames.get(i);
			if(!phoneBook.containsKey(name)) {
				System.out.println("Not found");
			}else {
				Long ph = phoneBook.get(name);
				System.out.println(name +"="+ph);
			}
		}
		System.out.println(phoneBook);
	}

}

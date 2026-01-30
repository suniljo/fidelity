package com.fidelity.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestFidelity {

	public static void main(String[] args) {
		Set<Product> names = new TreeSet<Product>(new ProductComparator());
		
		Product prod1 = new Product(124, "Mobile");
		Product prod2 = new Product(185, "Laptop");
		Product prod3 = new Product(162, "Tab");
		Product prod4 = new Product(135, "Desktop");
		
		names.add(prod1);
		names.add(prod2);
		names.add(prod3);
		names.add(prod4);
		//System.out.println(names);
		
		names.forEach(p -> System.out.println(p));
	}

}

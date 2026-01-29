package com.fidelity.trainings.java;

import java.util.HashSet;
import java.util.Set;

public class Encapsulatiion {

	public static void main(String[] args) {
		Product prod = new Product();
		System.out.println(prod.getProductId());
		
		//prod.productId = 1001;
		prod.setProductId(1001);
		prod.setProductName("Mobile");
		prod.setProductPrice(25000f);
		/*
		System.out.println(prod.getProductId());
		
		System.out.println(prod.getClass().getName());
		System.out.println(prod.getClass().getSimpleName());
		System.out.println("hashCode = " + prod.hashCode());
		System.out.println("hashCode in hexadecimal form = " + Integer.toHexString(prod.hashCode()));
		System.out.println(prod); //toString()
		
		Product prod1= new Product(1, "A", 1000.5f);
		Product prod2= new Product(1, "A", 1000.5f);
		
		System.out.println("hashCode(prod1) = " + prod1.hashCode());
		System.out.println("hashCode(prod2) = " + prod2.hashCode());
		
		System.out.println(prod1 == prod2);
		System.out.println(prod1.equals(prod2));
		*/
		
		Product prod1= new Product(1, "A", 1000.5f);
		Product prod2= new Product(1, "A", 1000.5f);
		Product prod3= new Product(2, "B", 2000.5f);
		
		Set<Product> products = new HashSet<>();
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		
		products.forEach(System.out::println);
	}

}

package com.fidelity.java.java17;

public class RecordTest {
	public static void main(String[] args) {
		Product prod = new Product(101, "Mobile Phone", 72500f);
		
		System.out.println(prod);
		
		System.out.println("product name = " + prod.productName());
		System.out.println(prod.productId() + " | " + prod.productName() + " | " + prod.productPrice());
	}
}

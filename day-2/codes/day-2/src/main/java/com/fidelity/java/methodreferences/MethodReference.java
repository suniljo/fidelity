package com.fidelity.java.methodreferences;

public class MethodReference {

	public static void main(String[] args) {
		/*
		Nums numsRef = (x, y) -> {
			int sum = x + y;
			System.out.println(String.format("%2d + %2d = %2d", x, y, sum));
		};
		*/
		
		/*
		Nums numsRef = (x, y) -> {
			MethodReference.performAdd(x, y);
		};		
		*/
		
		Nums numsRef = MethodReference::performAdd;		
		numsRef.add(11, 22);		
		
		Nums numsRef1 = ServicesUtility::addition;
		numsRef1.add(10, 20);
	}

	private static void performAdd(int a, int b) {
		int sum = a + b;
		System.out.println(String.format("%2d + %2d = %2d", a, b, sum));
	}
}

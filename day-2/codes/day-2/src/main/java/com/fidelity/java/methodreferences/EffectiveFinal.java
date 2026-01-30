package com.fidelity.java.methodreferences;

public class EffectiveFinal {
	public static void main(String[] args) {
		int age = 25;
		
		Nums numsRef = (x, y) -> {
			System.out.println("sum = " + (x+y));
			//age = 25; //Local variable age defined in an enclosing scope must be final or effectively final
			System.out.println(age);
		};
		
		//age = 26;
		System.out.println("age = " + age);
		numsRef.add(10, 20);
	}
}

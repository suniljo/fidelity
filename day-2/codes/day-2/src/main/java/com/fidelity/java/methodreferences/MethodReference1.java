package com.fidelity.java.methodreferences;

public class MethodReference1 {

	public static void main(String[] args) {
		MethodReference1 mrObj = new MethodReference1();
		
		/*
		Nums numsRef = (x, y) -> {
			mrObj.performAdd(x, y);
		};
		*/
		
		Nums numsRef = mrObj::performAdd;
		
		numsRef.add(10, 20);
	}

	private void performAdd(int a, int b) {
		int sum = a + b;
		System.out.println(String.format("%2d + %2d = %2d", a, b, sum));
	}
}

package com.fidelity.java.methodreferences;

public class MethodReference2 {
	int x;
	int y;

	public MethodReference2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		/*
		Nums numsRef = (x, y) -> {
			MethodReference2 obj = new MethodReference2(12, 34);
		};
	*/
		Nums numsRef = MethodReference2::new;
		
		numsRef.add(10, 20);
	}

}

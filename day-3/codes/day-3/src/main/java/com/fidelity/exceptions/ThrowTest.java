package com.fidelity.exceptions;

public class ThrowTest {
	
	private int performDivision(int x, int y) {
		if(y == 0) {
			//throw new RuntimeException();
			throw new RuntimeException("cannot divide an int by 0");
		}
		int z = x / y;
		return z;
	}
	public static void main(String[] args) {
		ThrowTest ref =new ThrowTest();
		
		int x = 10;
		int y = 0;
		try {
			int res = ref.performDivision(x, y);		
			System.out.println("result = " + res);
		}catch(Exception ex) {
			System.err.println("message - " + ex.getMessage());
		}
		System.out.println("---- done ----");
	}

}
